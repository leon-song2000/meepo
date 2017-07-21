package com.leon.meepo.tinyioc;

import org.junit.Test;
import com.leon.meepo.tinyioc.factory.AutowireCapableBeanFactory;
import com.leon.meepo.tinyioc.factory.BeanFactory;
import com.leon.meepo.tinyioc.io.ResourceLoader;
import com.leon.meepo.tinyioc.xml.XmlBeanDefinitionReader;


import java.util.Map;

/**
 * Created by songlin01 on 17/7/15.
 */
public class BeanFactoryTest {

    @Test
    public void test() throws Exception {

        XmlBeanDefinitionReader xmlBeanDefinitionReader = new XmlBeanDefinitionReader(new ResourceLoader());
        xmlBeanDefinitionReader.loadBeanDefinitions("tinyioc.xml");

        BeanFactory beanFactory = new AutowireCapableBeanFactory();
        for (Map.Entry<String, BeanDefinition> beanDefinitionEntry : xmlBeanDefinitionReader.getRegistry().entrySet()) {
            beanFactory.registerBeanDefinition(beanDefinitionEntry.getKey(), beanDefinitionEntry.getValue());
        }

        // 3.获取bean
        HelloWorldService helloWorldService = (HelloWorldService) beanFactory.getBean("helloWorldService");
        helloWorldService.HelloWorld();

    }
}
