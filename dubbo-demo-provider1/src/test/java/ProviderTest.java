import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

/**
 * Created by CCL on 2018/12/3 0003 下午 3:50
 *
 * @description:
 */
public class ProviderTest {
    public static void main(String[] args) {
        System.setProperty("java.net.preferIPv4Stack", "true");
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String[]{"dubbo-demo-provider.xml"});
        context.start();
        System.out.println("服务提供者向zookeeper注册中心注册服务成功（端口号：20881）");
        try {
            System.in.read(); // press any key to exit
        } catch (IOException e) {
            e.printStackTrace();
        }
        context.close();
    }
}
