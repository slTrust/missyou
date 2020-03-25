package com.lin.missyou.vo;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Id;

@Getter
@Setter
public class SpuSimplifyVO {
    @Id
    private Long id;
    private String title;
    private String subtitle;

    private String img;
    private String forThemeImg;
    private String price;
    private String discountPrice;

    private String description;
    private String tags;
    private Long sketchSpecId;
}
