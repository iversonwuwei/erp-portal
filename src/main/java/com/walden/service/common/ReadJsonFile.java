package com.walden.service.common;

import com.walden.common.IDelete;
import com.walden.common.IRead;
import net.sf.json.JSONArray;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.io.*;
import java.util.HashMap;
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
    @Autowired
    private IDelete deleteDraft;


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
    public String readAllFiles() {
        file = new File(DEFAULT_PATH);
        String[] strings = file.list();
        File[] files = file.listFiles();
        String json;
        String id;
        Map<String, String> maps = new HashMap<>();
        for (int i=1; i< strings.length; i++){
            id = strings[i].substring(0, strings[i].indexOf("."));
            json = (String) read(files[i]);
            maps.put(id, json);
        }
        JSONArray jsonArray = JSONArray.fromObject(maps);
        System.out.println(jsonArray.toString());
        return jsonArray.toString();
    }
}
