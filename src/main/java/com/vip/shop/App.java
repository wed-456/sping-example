package com.vip.shop;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {
        /**
         * 初始化ApplicationContext容器,参数为上一步的配置文件
         */
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
        //从容器中获取对象
        //一参为注册时声明的id,二参为返回的类型,进行转换
        User user = context.getBean("user", User.class);
        System.out.println(user);

        User user2 = context.getBean("user2", User.class);
        System.out.println(user2);
        context.close();
        //user2.destory1();
    }
}
