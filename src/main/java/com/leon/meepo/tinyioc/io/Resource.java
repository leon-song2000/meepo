package com.leon.meepo.tinyioc.io;

import java.io.IOException;
import java.io.InputStream;

/**
 * Created by songlin01 on 17/7/21.
 */
public interface Resource {

    InputStream getInputStream() throws IOException;
}
