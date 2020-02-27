package com.atguigu.springboot.helloidea.controller;

import com.atguigu.springboot.helloidea.bean.Tadmin;
import com.atguigu.springboot.helloidea.service.TadminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author yizhixld
 * @create 2020-02-27-10:59
 */
@Controller
public class TadminController {

    @Autowired
    private TadminService tadminService;

    @ResponseBody
    @RequestMapping("/test/{id}")
    public Tadmin getTadmin(@PathVariable("id") Integer id){
        Tadmin tadmin = tadminService.getTadminById(id);
        return tadmin;
    }
}
