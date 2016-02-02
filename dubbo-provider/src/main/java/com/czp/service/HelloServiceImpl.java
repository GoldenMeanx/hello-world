package com.czp.service;
/**
 * 描述：
 */

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * create by chengzhenpeng
 * Date : 2016/1/29 Time:9:28
 * Description:
 */
public class HelloServiceImpl implements HelloService {

    private static final Logger LOGGER = LogManager.getLogger(HelloServiceImpl.class);

    @Override
    public void sayHello() {
        LOGGER.info("Hello dubbo");
    }

    public static void main(String[] args){
        LOGGER.info("hello");
    }
}
