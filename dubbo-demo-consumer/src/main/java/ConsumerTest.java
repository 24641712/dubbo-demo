import com.java1234.service.DemoProviderService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

/**
 * Created by CCL on 2018/12/3 0003 下午 4:32
 *
 * @description:
 */
public class ConsumerTest {
    public static void main(String[] args){
        //Prevent to get IPV6 address,this way only work in debug mode
        //But you can pass use -Djava.net.preferIPv4Stack=true,then it work well whether in debug mode or not
        System.setProperty("java.net.preferIPv4Stack", "true");
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String[]{"dubbo-demo-consumer.xml"});
        context.start();
        DemoProviderService demoProviderService = (DemoProviderService) context.getBean("demoProviderService"); // get remote service proxy
        String result=demoProviderService.sayHello("你好");
        System.out.println("远程调用的结果："+result);
        try {
            System.in.read();
        } catch (IOException e) {
            e.printStackTrace();
        }
        context.close();
    }

}
