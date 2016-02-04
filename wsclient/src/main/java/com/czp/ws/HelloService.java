package com.czp.ws;/**
 * 描述：
 */

import javax.jws.WebService;

/**
 * create by chengzhenpeng
 * Date : 2016/1/12 Time:15:15
 * Description:
 */
@WebService(targetNamespace = "http://ws1.czp.com/")
public interface HelloService {

    public String sayHello(String say);


}
