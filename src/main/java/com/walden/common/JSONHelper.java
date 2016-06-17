package com.walden.common;

import net.sf.json.JSONArray;
import org.springframework.stereotype.Component;

/**
 * Created by walden on 16/6/16.
 */
@Component
public class JSONHelper {

    private String jsonString;

    public JSONHelper() {
    }

    public String getJsonString() {
        return jsonString;
    }

    public void setJsonString(String jsonString) {
        this.jsonString = jsonString;
    }

    public JSONArray jsonToArray(){
        return JSONArray
    }
}
