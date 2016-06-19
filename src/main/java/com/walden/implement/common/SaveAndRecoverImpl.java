package com.walden.implement.common;

import com.walden.common.ISaveAndRecover;

/**
 * Created by walden on 16/6/17.
 */
public class SaveAndRecoverImpl implements ISaveAndRecover {

    private String fileName;

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public SaveAndRecoverImpl(){

    }

    public Object read(Object o) {
        return null;
    }

    public void save(Object savePath) {

    }
}
