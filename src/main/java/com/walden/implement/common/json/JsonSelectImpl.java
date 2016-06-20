package com.walden.implement.common.json;

import com.walden.common.IJsonSelect;
import net.sf.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by walden on 16/6/20.
 */
public class JsonSelectImpl implements IJsonSelect{
    private String jsonString;
    private String searchString;
    private String selectedName;

    public void setJsonString(String jsonString) {
        this.jsonString = jsonString;
    }

    public JsonSelectImpl(String jsonString){
        this.jsonString = jsonString;
    }

    @Override
    public String selectby(Object o) {
        searchString = (String) o;
        selectedName = JSONObject.fromObject(jsonString).getString(searchString);
        return selectedName;
    }
}
