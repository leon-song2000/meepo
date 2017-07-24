package com.leon.meepo.tinyioc;

/**
 * Created by songlin01 on 17/7/24.
 */
public class OutService {

    private HelloWorldService helloWorldService;

    public void out(String text) {
        System.out.println(text);
    }

    public void setHelloWorldService(HelloWorldService helloWorldService) {
        this.helloWorldService = helloWorldService;
    }
}
