package com.czp.test;/**
 * 描述：
 */

import com.czp.ws.HelloService;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import java.net.URL;

/**
 * create by chengzhenpeng
 * Date : 2016/1/12 Time:15:30
 * Description:
 */
public class ServiceTest {
    public static void main(String[] args){
        try {
            URL url = new URL("http://localhost:8080/service?wsdl");
            String ns = "http://ws1.czp.com/";
            Service service = Service.create(url,new QName(ns,"HelloServiceService"));
            HelloService helloService = service.getPort(new QName(ns,"HelloServicePort"), HelloService.class);
            System.out.println(helloService.sayHello("您好！"));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


}
