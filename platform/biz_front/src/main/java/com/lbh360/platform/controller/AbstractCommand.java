package com.lbh360.platform.controller;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;

import org.apache.commons.lang.math.NumberUtils;

import com.pt.core.utils.ObjectUtil;
import com.pt.core.utils.Page;

/**
 * 命令
 * 
 * @author user
 * 
 */
public abstract class AbstractCommand {

	protected final String SESSIONLOGIN = "SESSIONUSER";
	protected final String SIGNUPINFO = "SIGNUPINFO";
	protected final String SOFTKEY_HCDOG = "hcdog";// 好吃狗
	protected final String SOFTKEY_SUPPLIER = "supplier";// 供应商

	protected String commandNM = "";

	public String getCommandNM() {
		return commandNM;
	}

	public void setCommandNM(String commandNM) {
		this.commandNM = commandNM;
	}

	public void init(ServletContext servletContext) {

	}


	protected ControllerAjaxResult ajaxResult(String code) {
		return new ControllerAjaxResult(code, null, null);
	}

	protected ControllerAjaxResult ajaxResult(String code, String message) {
		return new ControllerAjaxResult(code, message, null);
	}

	protected ControllerAjaxResult ajaxResult(String code, String message, Object data) {
		return new ControllerAjaxResult(code, message, data);
	}

	protected ControllerAjaxResult ajaxResult(String code, String message, Object row, Integer total) {
		return new ControllerAjaxResult(code, message, row, total.toString());
	}
	

	protected ControllerAjaxResult ajaxResult(String code, String message, Object row, Integer total,
			Integer totalPage) {
		return new ControllerAjaxResult(code, message, row, total.toString(), totalPage.toString());
	}

	protected ControllerAjaxResult ajaxResult(String code, String message, Object row, Page page) {
		return new ControllerAjaxResult(code, message, row, page.getTotalRecord().toString(),
				page.getTotalPages().toString());
	}

	/** 默认显示行数 */
	protected Integer defSize = 5;

	/**
	 * 取得分页对象
	 * 
	 * @param request
	 * @return
	 */
	protected Page getPage(HttpServletRequest request) {
		String strPageIndex = request.getParameter("pageNo");
		String strNumPerPage = request.getParameter("pageSize");
		if (ObjectUtil.isNull(strPageIndex)) {
			strPageIndex = request.getParameter("pagNo");
		}
		if (ObjectUtil.isNull(strNumPerPage)) {
			strNumPerPage = request.getParameter("pagSize");
		}
		int pageIndex = NumberUtils.toInt(strPageIndex, 1);
		int numPerPage = NumberUtils.toInt(strNumPerPage, defSize);
		Page page = new Page(pageIndex, numPerPage);
		return page;
	}

}
