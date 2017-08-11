package com.lbh360.platform.controller.merch;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lbh360.platform.base.service.bean.merch.MerchBaseInfoBean;
import com.lbh360.platform.controller.AbstractCommand;
import com.lbh360.platform.controller.ControllerAjaxResult;
import com.lbh360.platform.service.merch.IMerchService;
import com.pt.core.common.exception.ServiceException;
import com.pt.core.utils.Page;

/**
 * 说明: 功能描述
 * 
 * @author 况小锋
 * @version 1.0
 */
@RestController
public class MerchInfoController extends AbstractCommand {

	@Autowired
	IMerchService merchService;

	@RequestMapping("merchlist")
	public ControllerAjaxResult merchlist(HttpServletRequest request) {
		Page page = getPage(request);
		List<?> result;
		try {
			result = merchService.queryMerchInfo4Restaurant(null, null, page);
			return ajaxResult(ControllerAjaxResult.SUCCESS, "", result, page);
		} catch (ServiceException e) {
			return ajaxResult(ControllerAjaxResult.FAILE, "数据查询失败！");
		}
	}

	@RequestMapping("merchcu")
	public ControllerAjaxResult merchcu(@ModelAttribute MerchBaseInfoBean merch) {
		try {
			merchService.addMerchBaseInfo(merch);
			return ajaxResult(ControllerAjaxResult.SUCCESS, "商品保存成功！", merch.getId());
		} catch (ServiceException e) {
			return ajaxResult(ControllerAjaxResult.FAILE, "商品保存失败！");
		}

	}

}
