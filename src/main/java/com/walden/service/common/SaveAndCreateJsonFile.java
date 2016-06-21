package com.walden.service.common;

import com.walden.common.IConverter;
import com.walden.common.ISave;
import com.walden.entity.FileEntity;
import com.walden.helper.DraftConvertHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.io.*;

/**
 * Created by walden on 16/6/21.
 */
@Component
public class SaveAndCreateJsonFile implements ISave {

    private File file;
    private OutputStream outputStream;
    private FileWriter fileWriter;
    private FileEntity fileEntity;
    private IConverter draftConvertHelper;
    private String fileName;
    private String fileString;

    public SaveAndCreateJsonFile(){

    }

    @Override
    public void save(Object o) {
        this.fileEntity = (FileEntity) o;
        draftConvertHelper = new DraftConvertHelper(this.fileEntity.getJsonStringBuffer());
        fileName = (String) draftConvertHelper.convert("customer_name");
        file = new File(this.fileEntity.getSavePath() + fileName + ".json");
        if (!file.exists()){
            try {
                fileWriter = new FileWriter(file);
                fileWriter.write(this.fileEntity.getJsonStringBuffer());
                fileWriter.close();
            } catch (java.io.IOException e) {
                e.printStackTrace();
            }
        }
    }
}
