package com.walden.implement;

import com.walden.common.IRead;
import com.walden.service.ISelectAllDraftFile;
import net.sf.json.JSONArray;
import net.sf.json.JSONObject;
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
    public Object selectAll() {
        JSONArray jsonString = (JSONArray) readAllJsonFile.readAllFiles();
        return jsonString;
    }
}
