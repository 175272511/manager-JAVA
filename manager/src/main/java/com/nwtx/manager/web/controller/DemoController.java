package com.nwtx.manager.web.controller;

import com.nwtx.manager.data.entity.MchBasicInfo;
import com.nwtx.manager.web.service.DemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by liuhui on 2016/3/23.
 */
@Controller
public class DemoController {

    @Autowired
    private DemoService demoService;

    @RequestMapping(value = "index", method = RequestMethod.GET)
    public String index(){
        MchBasicInfo mchBasicInfo = demoService.getData("2");
        System.out.println(mchBasicInfo);
        return "index";
    }
}
