package com.walden.helper;

import com.walden.common.IFile;
import org.springframework.beans.factory.annotation.Autowired;

import java.io.File;

/**
 * Created by walden on 16/6/17.
 */
public class FileHelper implements IFile {

    @Autowired
    private File file;

    public Object read(Object o) {
        return null;
    }

    public void save(Object savePath) {

//        file = new File()
//        if (file.)
    }

    public void delete(Object o) {

    }
}
