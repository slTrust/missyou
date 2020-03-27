package com.lin.missyou.vo;

import com.lin.missyou.model.Category;
import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.BeanUtils;

@Getter
@Setter
public class CategoriesPureVO {
    private Long id;

    private String name;

    private String description;

    private Boolean isRoot;


    private String img;

    private Long parentId;

    private Long index;

    public CategoriesPureVO(Category category) {
        BeanUtils.copyProperties(category,this);
    }
}
