package com.walden.service.common;

import com.walden.common.IDelete;
import org.springframework.stereotype.Component;

import java.io.File;

/**
 * Created by walden on 16/6/21.
 */
@Component
public class DeleteJsonFile implements IDelete {

    private File file;
    private static final String DEFAULT_PATH="/Users/walden/Desktop/save/";

    public DeleteJsonFile(){

    }

    @Override
    public void delete(Object o) {
        file = new File(DEFAULT_PATH + o);
        file.deleteOnExit();
    }
}
