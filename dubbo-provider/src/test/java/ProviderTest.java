/**
 * 描述：
 */

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * create by chengzhenpeng
 * Date : 2016/2/3 Time:11:22
 * Description:
 */
public class ProviderTest {

    public static void main(String[] args) throws Exception{
        ClassPathXmlApplicationContext context =  new ClassPathXmlApplicationContext("spring/provider-context.xml");
        context.start();
        System.in.read();
    }
}

