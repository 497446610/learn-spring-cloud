package com.dbuyer.springboot.web.converter;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.http.HttpInputMessage;
import org.springframework.http.HttpOutputMessage;
import org.springframework.http.MediaType;
import org.springframework.http.converter.AbstractHttpMessageConverter;
import org.springframework.http.converter.HttpMessageNotReadableException;
import org.springframework.http.converter.HttpMessageNotWritableException;
import org.springframework.util.FileCopyUtils;

import com.dbuyer.springboot.web.ControllerAjaxResult;

import net.sf.json.JSONObject;


/**
 * Class description goes here.
 * 
 * @version 1.0 2012-7-20
 * @author kuangxf
 * @history
 * 
 */
public class UTF8ControllalAjaxResultHttpMessageConverter extends
AbstractHttpMessageConverter<ControllerAjaxResult> {

	Log logger = LogFactory.getLog(this.getClass());

	public static final Charset DEFAULT_CHARSET = Charset.forName("UTF-8");
	public static final MediaType contentType = new MediaType("text", "plain", DEFAULT_CHARSET);
	private final List<Charset> availableCharsets;

	public UTF8ControllalAjaxResultHttpMessageConverter() {
		this(DEFAULT_CHARSET);
	}

	public UTF8ControllalAjaxResultHttpMessageConverter(Charset defaultCharset) {
		super(contentType, MediaType.ALL);
		this.availableCharsets = new ArrayList<Charset>(Charset
				.availableCharsets().values());
	}

	@Override
	protected boolean supports(Class<?> clazz) {
		return ControllerAjaxResult.class.equals(clazz);
	}

	@Override
	protected ControllerAjaxResult readInternal(
			Class<? extends ControllerAjaxResult> clazz,
			HttpInputMessage inputMessage) throws IOException,
			HttpMessageNotReadableException {

		String toString = FileCopyUtils.copyToString(new InputStreamReader(
				inputMessage.getBody(), DEFAULT_CHARSET));
		ControllerAjaxResult result = (ControllerAjaxResult) JSONObject.toBean(
				JSONObject.fromObject(toString), ControllerAjaxResult.class);

		return result;
	}

	@Override
	protected void writeInternal(ControllerAjaxResult t,
			HttpOutputMessage outputMessage) throws IOException,
			HttpMessageNotWritableException {

		outputMessage.getHeaders().setContentType(contentType);
		FileCopyUtils.copy(JSONObject.fromObject(t).toString(),
				new OutputStreamWriter(outputMessage.getBody(), DEFAULT_CHARSET));
	}

	protected List<Charset> getAcceptedCharsets() {
		return this.availableCharsets;
	}

	@Override
	protected Long getContentLength(ControllerAjaxResult s,
			MediaType contentType) {
		if (contentType != null && contentType.getCharSet() != null) {
			Charset charset = contentType.getCharSet();
			try {
				return (long) JSONObject.fromObject(s).toString().getBytes(
						charset.name()).length;
			} catch (UnsupportedEncodingException ex) {
				throw new InternalError(ex.getMessage());
			}
		} else {
			return null;
		}
	}
}
