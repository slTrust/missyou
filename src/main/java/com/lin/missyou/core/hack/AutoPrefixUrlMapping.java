package com.lin.missyou.core.hack;

import org.springframework.web.servlet.mvc.method.RequestMappingInfo;
import org.springframework.web.servlet.mvc.method.annotation.RequestMappingHandlerMapping;

import java.lang.reflect.Method;

public class AutoPrefixUrlMapping extends RequestMappingHandlerMapping {
    @Override
    protected RequestMappingInfo getMappingForMethod(Method method, Class<?> handlerType) {
        RequestMappingInfo mappingInfo = super.getMappingForMethod(method,handlerType);
        String packageName = this.getPrefix(handlerType);
        System.out.println(packageName); // com.lin.missyou.api.v1
        if(mappingInfo != null){

        }
        return mappingInfo;
    }

    private String getPrefix(Class<?> handlerType){
        String packageName = handlerType.getPackage().getName();
        return packageName;
    }
}
