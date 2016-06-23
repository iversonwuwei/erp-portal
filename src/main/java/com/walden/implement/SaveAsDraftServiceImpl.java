package com.walden.implement;

import com.walden.common.IRead;
import com.walden.common.ISave;
import com.walden.entity.FileEntity;
import com.walden.service.ISaveAsDraft;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.File;

/**
 * Created by walden on 16/6/21.
 */
@Service
public class SaveAsDraftServiceImpl implements ISaveAsDraft {
    @Autowired
    private ISave saveAsDraft;
    @Autowired
    private IRead readJsonFile;

    private FileEntity fileEntity;
    private File file;

    @Override
    public void saveAsDraft(Object o) {
        this.fileEntity = (FileEntity) o;
        saveAsDraft.save(this.fileEntity);
    }

    @Override
    public String recoverFromDraft(Object o) {
        this.file = (File) o;
        String jsonString = (String) readJsonFile.read(this.file);
        return jsonString;
    }
}
