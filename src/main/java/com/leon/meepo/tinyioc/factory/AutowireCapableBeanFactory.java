package com.leon.meepo.tinyioc.factory;

import com.leon.meepo.tinyioc.BeanDefinition;

/**
 * Created by songlin01 on 17/7/20.
 */
public class AutowireCapableBeanFactory extends AbstractBeanFactory {

    @Override
    protected Object doCreateBean(BeanDefinition beanDefinition) {
        Object object = null;
        try {
            object = beanDefinition.getBeanClass().newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
        return object;
    }
}
