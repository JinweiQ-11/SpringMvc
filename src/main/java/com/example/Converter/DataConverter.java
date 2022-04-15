package com.example.Converter;

import org.springframework.core.convert.converter.Converter;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;


/**
 * @author ：qinjinwei
 * @date ：Created in 2022/4/14 21:35
 * @description：
 * @modified By：
 * @version: $
 */
public class DataConverter implements Converter<String, Date> {

    @Override
    public Date convert(String source) {
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        try {
            Date date = format.parse(source);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return null;
    }
}
