package com.leon.meepo.tinyioc;

/**
 * Created by songlin01 on 17/7/21.
 */
public interface BeanDefinitionReader {

    void loadBeanDefinitions(String location) throws Exception;
}
