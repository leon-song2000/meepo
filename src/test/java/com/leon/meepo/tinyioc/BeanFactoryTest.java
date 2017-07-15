package com.leon.meepo.tinyioc;


import org.junit.Test;

/**
 * Created by songlin01 on 17/7/15.
 */
public class BeanFactoryTest {

    @Test
    public void test() {

        BeanFactory beanFactory = new BeanFactory();

        BeanDefinition beanDefinition = new BeanDefinition(new HelloWorldService());
        beanFactory.registerBeanDefinition("helloWorldService", beanDefinition);

        HelloWorldService helloWorldService = (HelloWorldService) beanFactory.getBean("helloWorldService");
        helloWorldService.HelloWorld();

    }
}
