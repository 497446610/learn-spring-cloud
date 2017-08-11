package com.lbh360.platform.service.merch.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.apache.commons.beanutils.BeanUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lbh360.platform.base.common.ServiceErrorCode;
import com.lbh360.platform.base.dao.domain.merch.MerchBaseInfo;
import com.lbh360.platform.base.service.bean.merch.MerchBaseInfoBean;
import com.lbh360.platform.dao.mapper.merch.MerchBaseInfoMapper;
import com.lbh360.platform.service.merch.IMerchService;
import com.pt.core.common.exception.ServiceException;
import com.pt.core.utils.Page;

/**
 * 说明: 功能描述
 * 
 * @author 况小锋
 * @version 1.0
 */
@Service
public class MerchServiceImpl implements IMerchService {
	
	private final static Logger logger = LoggerFactory.getLogger(MerchServiceImpl.class);

	@Autowired
	MerchBaseInfoMapper merchBaseInfoMapper;

	@Override
	public List<MerchBaseInfoBean> queryMerchInfo4Restaurant(Map<String, Object> condition, String orderField,
			Page page) throws ServiceException {
		logger.debug("开始查询商品信息！");
		List<MerchBaseInfoBean> result = new ArrayList<>();

		List<MerchBaseInfo> list = merchBaseInfoMapper.selectByCondition(condition, page);
		try {
			for (MerchBaseInfo merchBaseInfo : list) {
				MerchBaseInfoBean bean = new MerchBaseInfoBean();
				BeanUtils.copyProperties(bean, merchBaseInfo);
				result.add(bean);
			}
		} catch (Exception e) {
			logger.error("查询商品信息失败！", e);
		}
		return result;
	}

	@Override
	public void addMerchBaseInfo(MerchBaseInfoBean merchbaseInfo) throws ServiceException {
		MerchBaseInfo record = new MerchBaseInfo();
		try {
			BeanUtils.copyProperties(record, merchbaseInfo);
			merchBaseInfoMapper.insert(record);
			merchbaseInfo.setId(record.getId());
		} catch (Exception e) {
			throw new ServiceException(ServiceErrorCode.ADD.toString(), "保存商品信息出现异常！");
		}

	}

}
