package com.lbh360.platform.service.merch;

import java.util.List;
import java.util.Map;

import org.hibernate.service.spi.ServiceException;
import org.springframework.stereotype.Service;

import com.lbh360.platform.base.dao.domain.merch.MerchBaseInfo;

/**
 * 说明: 功能描述
 * 
 * @author 况小锋
 * @version 1.0
 */
@Service
public interface IMerchService {

	/**
	 * 商品综合查询
	 * 
	 * @param condition
	 *            <br>
	 *            compId 供应商(企业)ID <br>
	 *            level1Code 一级分类<br>
	 *            level2Code 二级分类<br>
	 *            search 搜索<br>
	 *            brand 品牌 <br>
	 *            pricemin 价格区间（低）<br>
	 *            pricemax 价格区间（高）
	 * 
	 * @param orderField
	 *            <br>
	 *            price.asc 价格由低到高<br>
	 *            price.desc 价格由高到低<br>
	 *            orderNum.desc 销量
	 * @param page
	 * @return
	 */
	List<MerchBaseInfo> queryMerchInfo4Restaurant(Map<String, Object> condition, String orderField)
			throws ServiceException;

}
