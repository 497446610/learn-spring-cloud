package com.lbh360.platform.service.merch.impl;

import java.util.List;
import java.util.Map;

import org.hibernate.service.spi.ServiceException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageRowBounds;
import com.lbh360.platform.base.dao.domain.merch.MerchBaseInfo;
import com.lbh360.platform.dao.mapper.merch.MerchBaseInfoMapper;
import com.lbh360.platform.service.merch.IMerchService;

/**
 * 说明: 功能描述
 * 
 * @author 况小锋
 * @version 1.0
 */
@Service
public class MerchServiceImpl implements IMerchService {

	@Autowired
	MerchBaseInfoMapper merchBaseInfoMapper;

	@Override
	public List<MerchBaseInfo> queryMerchInfo4Restaurant(Map<String, Object> condition, String orderField)
			throws ServiceException {
		PageRowBounds pageRowBounds = new PageRowBounds(2, 5);
		Page<MerchBaseInfo> list = merchBaseInfoMapper.selectByCondition(condition,pageRowBounds);
		System.out.println(list.getTotal());
		return list;
	}

}
