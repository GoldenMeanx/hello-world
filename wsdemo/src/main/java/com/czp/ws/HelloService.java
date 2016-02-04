package com.czp.ws;/**
 * 描述：
 */

import javax.jws.WebService;
import javax.xml.ws.Endpoint;

/**
 * create by chengzhenpeng
 * Date : 2016/1/12 Time:15:15
 * Description:
 */
@WebService(targetNamespace = "http://ws1.czp.com/")
public class HelloService {

    public String sayHello(String say){
        return "说的内容" + say;
    }

    public static void main(String[] args){
        Endpoint.publish("http://localhost:8080/service",new HelloService());
        System.out.print("发布成功");
    }
}
