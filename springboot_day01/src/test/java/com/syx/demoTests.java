package com.syx;
import com.syx.pojo.Empoyee;
import com.syx.pojo.User;
import org.hibernate.validator.constraints.Email;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;


@RunWith(SpringRunner.class)
@SpringBootTest
public class demoTests {

    @Autowired
    private User user;

    @Autowired
    private Empoyee empoyee;

    @Autowired
    ApplicationContext ioc;

    //OGNL表达式获取配置文件值获取
    @Email//不支持jsr303校验
    @Value("${user.name}+${empoyee.e-name}+#{2*3}")//spel表达式
    private  String name;

    //测试@ConfigurationProperties注入配置文件application.yml属性
    @Test
    public void contextLoads() {

        System.out.println(user.toString());
    }

    //测试@PropertySource加载指定的配置文件注入配置文件empoyee.properties属性
    @Test
    public void contextLoads2() {
        System.out.println(empoyee.toString());
    }

    //测试OGNL表达式获取配置文件值获取配置文件属性
    @Test
    public void contextLoads3() {
        System.out.println(name.toString());
    }

    @Test
    public void contextLoads4() {
        boolean b = ioc.containsBean("helloService02");
        System.out.println(b);
    }

}
