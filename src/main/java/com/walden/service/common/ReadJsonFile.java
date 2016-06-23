package com.walden.service.common;

import com.walden.common.IDelete;
import com.walden.common.IRead;
import net.sf.json.JSONArray;
import net.sf.json.JSONObject;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by walden on 16/6/21.
 */
@Component
public class ReadJsonFile implements IRead {

    private static final Logger logger = LogManager.getLogger(ReadJsonFile.class);
    private File file;
    private static final String DEFAULT_PATH = "/Users/walden/Desktop/save/";
    private FileReader fileReader;
    private BufferedReader bufferedReader;
    private String containString;


    public ReadJsonFile(){

    }

    @Override
    public Object read(Object file) {
        this.file = (File) file;
        try {
            if (this.file.exists()) {
                fileReader = new FileReader(this.file);
                bufferedReader = new BufferedReader(fileReader);
                while (bufferedReader.ready()){
                    containString = bufferedReader.readLine();
                }
            }
            fileReader.close();
            bufferedReader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return containString;
    }

    @Override
    public Object readAllFiles() {
        file = new File(DEFAULT_PATH);
        String[] strings = file.list();
        File[] files = file.listFiles();
        String json;
        String id;
        List drafts = new ArrayList();
        for (int i=1; i< strings.length; i++){
            id = strings[i].substring(0, strings[i].indexOf("."));
            json = (String) read(files[i]);
            drafts.add(getJSONObject(json, "draft_id", id));
        }
        JSONArray jsonArray = JSONArray.fromObject(drafts);
        System.out.println(jsonArray.toString());
        return jsonArray;
    }

    protected JSONObject getJSONObject(String target, String id, String value){
        JSONObject jsonObject = null;

        if (target != null || !target.equals("")){
            try{
                jsonObject = JSONObject.fromObject(target);
                jsonObject.put(id, value);
            }catch (Exception e){
                e.getMessage();
            }
        }
        return jsonObject;
    }
}
