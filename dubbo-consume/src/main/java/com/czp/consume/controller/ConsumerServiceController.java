package com.czp.consume.controller;/**
 * 描述：
 */

import com.czp.service.HelloService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * create by chengzhenpeng
 * Date : 2016/2/3 Time:10:49
 * Description:
 */
@Controller
@RequestMapping("/hello")
public class ConsumerServiceController {

    private static final Logger LOGGER = LogManager.getLogger(ConsumerServiceController.class);


    @Autowired
    private HelloService helloService;

    @RequestMapping("/toSayHello")
    public String toSayHello(){
        LOGGER.info("调用远程方法开始");
        helloService.sayHello();
        LOGGER.info("调用远程的方法结束");
        return "success";
    }
}
