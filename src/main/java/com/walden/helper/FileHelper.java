package com.walden.helper;

import com.walden.common.IFile;
import com.walden.entity.FileEntity;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

import java.io.*;

/**
 * Created by walden on 16/6/17.
 */
public class FileHelper implements IFile {

    private static final Logger logger = LogManager.getLogger(FileHelper.class);
    private File file;
    private InputStream readFileStream;
    private FileEntity fileEntity;

    public FileHelper(FileEntity fileEntity){
        this.fileEntity = fileEntity;
        init();
    }

    private File init(){
        file = new File(fileEntity.getSavePath() + fileEntity.getFileName());
        return file;
    }

    public InputStream read(Object o) {
        try {
            if (file.exists()){
                readFileStream = new FileInputStream(file);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        return readFileStream;
    }

    public void save(Object savePath) {
        try {
            if (!file.exists()){
                file.createNewFile();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void delete(Object o) {
        file.deleteOnExit();
    }
}
