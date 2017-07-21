package com.leon.meepo.tinyioc;


import com.leon.meepo.tinyioc.factory.AutowireCapableBeanFactory;
import com.leon.meepo.tinyioc.factory.BeanFactory;
import org.junit.Test;

/**
 * Created by songlin01 on 17/7/15.
 */
public class BeanFactoryTest {

    @Test
    public void test() throws Exception {

        BeanFactory beanFactory = new AutowireCapableBeanFactory();

        BeanDefinition beanDefinition = new BeanDefinition();
        beanDefinition.setBeanClassName("com.leon.meepo.tinyioc.HelloWorldService");

        PropertyValues propertyValues = new PropertyValues();
        propertyValues.addPropertyValue(new PropertyValue("text", "hello world"));
        beanDefinition.setPropertyValues(propertyValues);

        beanFactory.registerBeanDefinition("helloWorldService", beanDefinition);

        HelloWorldService helloWorldService = (HelloWorldService) beanFactory.getBean("helloWorldService");
        helloWorldService.HelloWorld();

    }
}
