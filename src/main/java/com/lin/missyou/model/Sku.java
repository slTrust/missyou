package com.lin.missyou.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.math.BigDecimal;
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

    private String specs;
    private String code;
    private Long stock;


    public List<Spec> getSpecs(){
        String specs = this.specs;
        // Jackson 等序列化库
        return null;
    }

    public void setSpecs(List<Spec> data){
        String str = "data序列化后的字符串";
        this.specs = str;
    }

}
