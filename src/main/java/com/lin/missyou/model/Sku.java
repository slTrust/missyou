package com.lin.missyou.model;

import com.fasterxml.jackson.core.type.TypeReference;
import com.lin.missyou.util.GenericAndJson;
import com.lin.missyou.util.ListAndJson;
import com.sun.tools.javah.Gen;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Convert;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.lang.reflect.Type;
import java.math.BigDecimal;
import java.util.Collections;
import java.util.List;

@Entity
@Getter
@Setter
public class Sku extends BaseEntity{
    @Id
    private Long id;
    private BigDecimal price;
    private BigDecimal discountPrice;
    private Boolean online;
    private String img;
    private String title;

    private Long spuId;
    private Long categoryId;
    private Long rootCategoryId;

//    @Convert(converter = ListAndJson.class)
//    private List<Object> specs;

    private String specs;

    private String code;
    private Long stock;

    public List<Spec> getSpecs() {
        if(this.specs == null){
            return Collections.emptyList();
        }
        // 报错 这里是不能 List<Spec>的
        // return GenericAndJson.jsonToList(this.specs,List<Spec>.class);
        // 而是用 TypeReference<T>
        return GenericAndJson.jsonToList(this.specs, new TypeReference<List<Spec>>() {});
    }

    public void setSpecs(List<Spec> specs) {
        if(specs.isEmpty()){
            return;
        }
        this.specs = GenericAndJson.objectToJson(specs);
    }
}
