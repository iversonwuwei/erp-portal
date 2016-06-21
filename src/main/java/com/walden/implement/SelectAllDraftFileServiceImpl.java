package com.walden.implement;

import com.walden.common.IRead;
import com.walden.service.ISelectAllDraftFile;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by walden on 16/6/21.
 */
@Service
public class SelectAllDraftFileServiceImpl implements ISelectAllDraftFile {

    @Autowired
    private IRead readAllJsonFile;

    @Override
    public String selectAll() {
        String jsonString = (String) readAllJsonFile.readAllFiles();
        return jsonString;
    }
}
