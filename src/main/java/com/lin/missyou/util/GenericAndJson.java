package com.lin.missyou.util;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.lin.missyou.exception.http.ServerErrorException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class GenericAndJson {

    private static ObjectMapper mapper;

    @Autowired
    public void setMapper(ObjectMapper mapper){
        GenericAndJson.mapper = mapper;
    }

    public static <T> String objectToJson(T o){
        try {
            return GenericAndJson.mapper.writeValueAsString(o);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
            // 要向前端反馈没意义， 应该返回错误,记录日志
            throw new ServerErrorException(9999);
        }
    }

   public static <T> T jsonToObject(String s, TypeReference<T> tr){
       try {
           if(s==null){
               return null;
           }
           T o = GenericAndJson.mapper.readValue(s, tr);
           return o;
       } catch (JsonProcessingException e) {
           e.printStackTrace();
           throw new ServerErrorException(9999);
       }
   }
    /*
    public static <T> List<T> jsonToList(String s){
        try {
            if(s==null){
                return null;
            }
            List<T> list = GenericAndJson.mapper.readValue(s, new TypeReference<List<T>>() {});
            return list;
        } catch (JsonProcessingException e) {
            e.printStackTrace();
            throw new ServerErrorException(9999);
        }
    }

    public static <T> T jsonToList(String s, TypeReference<T> tr){
       try {
           if(s==null){
               return null;
           }
           T list = GenericAndJson.mapper.readValue(s, tr);
           return list;
       } catch (JsonProcessingException e) {
           e.printStackTrace();
           throw new ServerErrorException(9999);
        }
    }
    */


}
