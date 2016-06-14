package com.walden.helper;

import org.springframework.stereotype.Component;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by walden on 16/6/14.
 */
@Component
public class DateTimerHelper {

    private DateFormat dateFormat;

    public DateTimerHelper(){

    }

    public String dateFormat(String format){
        dateFormat = new SimpleDateFormat(format);
        return dateFormat.format(new Date());

    }
}
