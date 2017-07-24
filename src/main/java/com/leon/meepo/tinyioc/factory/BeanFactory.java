package com.leon.meepo.tinyioc.factory;

import com.leon.meepo.tinyioc.BeanDefinition;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * Created by songlin01 on 17/7/15.
 */
public interface BeanFactory {

    Object getBean(String beanName) throws Exception;

    void registerBeanDefinition(String beanName, BeanDefinition beanDefinition) throws Exception;
}
