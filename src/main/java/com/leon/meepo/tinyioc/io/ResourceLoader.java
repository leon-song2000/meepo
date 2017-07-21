package com.leon.meepo.tinyioc.io;

import java.net.URL;

/**
 * Created by songlin01 on 17/7/21.
 */
public class ResourceLoader {

    public Resource getResource(String location) {
        URL resource = this.getClass().getClassLoader().getResource(location);
        return new UrlResource(resource);
    }
}
