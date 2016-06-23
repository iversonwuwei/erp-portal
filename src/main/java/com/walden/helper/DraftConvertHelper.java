package com.walden.helper;

import com.walden.common.IConverter;
import com.walden.common.IJsonSelect;
import com.walden.implement.common.json.JsonSelectImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by walden on 16/6/20.
 */
@Component
public class DraftConvertHelper implements IConverter {

    private IJsonSelect jsonSelect;
    @Autowired
    private DateTimerHelper dateTimerHelper;

    private String selectedString;
    private StringBuilder sb;
    private static final String DATEFORMATE = "yyyyMMddHHmmss";

    public DraftConvertHelper(){}

    public DraftConvertHelper(String jsonString){
        jsonSelect = new JsonSelectImpl(jsonString);
    }

    @Override
    public String convert(Object o) {
        selectedString = (String) jsonSelect.selectby(o);
        return DraftIdMaker();
    }

    private String DraftIdMaker(){
        dateTimerHelper = new DateTimerHelper();
        sb = new StringBuilder();
        sb.append(selectedString);
        sb.append("draft");
        sb.append(dateTimerHelper.dateFormat(DATEFORMATE));
        return sb.toString();
    }
}
