package com.leon.meepo.tinyioc;

/**
 * Created by songlin01 on 17/7/15.
 */
public class HelloWorldService {

    private String text;

    private String name;

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public void HelloWorld() {
        System.out.println(text);
        System.out.println(name);
    }

}
