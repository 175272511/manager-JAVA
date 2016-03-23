package com.nwtx.manager.web.service.impl;

import com.nwtx.manager.data.dao.MchBasicInfoMapper;
import com.nwtx.manager.data.entity.MchBasicInfo;
import com.nwtx.manager.web.service.DemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by liuhui on 2016/3/23.
 */
@Service
@Transactional
public class DemoServiceImpl implements DemoService{

    @Autowired
    private MchBasicInfoMapper mchBasicInfoMapper;

    @Override
    public MchBasicInfo getData(String id) {
        return mchBasicInfoMapper.selectByPrimaryKey(Integer.parseInt(id));
    }
}
