package com.lbh360.platform.dao.mapper.merch;

import com.lbh360.platform.base.dao.domain.merch.MerchBaseInfo;
import com.lbh360.platform.base.dao.domain.merch.MerchBaseInfoExample;
import java.util.List;

public interface MerchBaseInfoMapper {
    int deleteByPrimaryKey(Long id);

    int insert(MerchBaseInfo record);

    int insertSelective(MerchBaseInfo record);

    List<MerchBaseInfo> selectByExample(MerchBaseInfoExample example);

    MerchBaseInfo selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(MerchBaseInfo record);

    int updateByPrimaryKey(MerchBaseInfo record);
}