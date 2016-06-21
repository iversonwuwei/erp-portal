package com.walden.entity;

import org.springframework.stereotype.Component;

/**
 * Created by walden on 16/6/20.
 */
@Component
public class FileEntity {

    private String fileName;
    private String savePath;
    private boolean canRead;
    private boolean canDelete;
    private String jsonStringBuffer;

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public String getSavePath() {
        return savePath;
    }

    public void setSavePath(String savePath) {
        this.savePath = savePath;
    }

    public boolean isCanRead() {
        return canRead;
    }

    public void setCanRead(boolean canRead) {
        this.canRead = canRead;
    }

    public boolean isCanDelete() {
        return canDelete;
    }

    public void setCanDelete(boolean canDelete) {
        this.canDelete = canDelete;
    }

    public String getJsonStringBuffer() {
        return jsonStringBuffer;
    }

    public void setJsonStringBuffer(String jsonStringBuffer) {
        this.jsonStringBuffer = jsonStringBuffer;
    }
}
