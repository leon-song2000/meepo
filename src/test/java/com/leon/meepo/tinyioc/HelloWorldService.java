package com.leon.meepo.tinyioc;

/**
 * Created by songlin01 on 17/7/15.
 */
public class HelloWorldService {

    private String text;

    private OutService outService;

    public void setOutService(OutService outService) {
        this.outService = outService;
    }

    public void helloWorld() {
        outService.out(text);
    }
}
