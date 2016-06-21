package com.walden.test;

import com.walden.common.IConverter;
import com.walden.common.IDelete;
import com.walden.common.IRead;
import com.walden.common.ISave;
import com.walden.entity.FileEntity;
import com.walden.helper.DraftConvertHelper;
import com.walden.service.common.DeleteJsonFile;
import com.walden.service.common.ReadJsonFile;
import com.walden.service.common.SaveAndCreateJsonFile;
import net.sf.json.JSONObject;

import java.io.File;

/**
 * Created by walden on 16/6/20.
 */
public class JsonTest {

    public static void main(String[] args){
        String jsonStiring = "{order_id: '1',owner: 'a',customer_name: 'aa',customer_contact: '111',turf_varity: 'A',turf_quanutity: '10',cutter: 'ss',driver: 'ss',layer: 'ss',total_price: '200',address_detail: 'assas',delivery_date_time: '2016-06-15T15',submitted_date_time: '2016-06-15T15',order_status: 'new',customer_email:'aa@aa.com',last_modified: '',modifier: '',turf_type: '',is_delete: ''}";
        JSONObject jsonObject = JSONObject.fromObject(jsonStiring);
        String testCustomerName = jsonObject.getString("customer_name");
        //System.out.println(testCustomerName);

        IConverter converter = new DraftConvertHelper(jsonStiring);
        String convertedString = (String) converter.convert("customer_name");
        System.out.println(convertedString);

        FileEntity fileEntity = new FileEntity();
        fileEntity.setJsonStringBuffer(jsonStiring);
        fileEntity.setSavePath("/Users/walden/Desktop/save/");

        IRead read = new ReadJsonFile();
        //ISave save = new SaveAndCreateJsonFile();
        //save.save(fileEntity);
        //File file = new File("/Users/walden/Desktop/save/aadraft20160620153930.json");
        IDelete delete = new DeleteJsonFile();
        delete.delete("aadraft20160621163052.json");
        //String jsonString = (String) read.read(file);
        //System.out.println(jsonString);

        read.readAllFiles();

    }
}
