package com.czp.controller;
/**
 * 描述：
 */

import com.czp.service.HelloService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.HashMap;
import java.util.Map;

/**
 * create by chengzhenpeng
 * Date : 2016/1/29 Time:9:35
 * Description:
 */
@RequestMapping("/hello")
@Controller
public class HelloServiceController {

    private static final Logger LOGGER = LogManager.getLogger(HelloServiceController.class);

    @Autowired
    private HelloService helloService;

    /**
     * 返回到指定的success.jsp，并且携带了参数
     * @return
     */
    @RequestMapping("/toSayhello" )
    public ModelAndView toSayHello(){
        ModelAndView modelAndView = new ModelAndView();
        Map<String,String> data = new HashMap<String,String>();
        data.put("msg","成功");
        helloService.sayHello();
        modelAndView.addAllObjects(data);
        modelAndView.setViewName("success");
        return modelAndView;
    }

    /**
     * 返回success.jsp的视图，没有携带任何数据
     * @return
     */
    @RequestMapping("/toSayHi")
    public String toSayHi(){
        return "success";
    }
}
