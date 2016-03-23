package com.nwtx.manager.data.dao;

import com.nwtx.manager.data.entity.MchBasicInfo;

public interface MchBasicInfoMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(MchBasicInfo record);

    int insertSelective(MchBasicInfo record);

    MchBasicInfo selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(MchBasicInfo record);

    int updateByPrimaryKey(MchBasicInfo record);
}