package com.lin.missyou.util;

import com.lin.missyou.bo.PageCounter;

public class CommonUtil {
    public static PageCounter convertToPageParamter(Integer start, Integer count){
        int pageNum = start / count;

        PageCounter pageCounter = PageCounter.builder()
                .page(pageNum)
                .count(count)
                .build();
        return pageCounter;
    }
}
