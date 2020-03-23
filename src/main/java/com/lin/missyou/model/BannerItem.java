package com.lin.missyou.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class BannerItem {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // id自增长
    private long id;
    private String img;
    private String keyword; // 跳转spu 需要携带一个 id 如果是 专题 则是 专题的标识
    private String type; // 首页banner 点击可能是 商品详情 可能是其他 专题
    private String name;

    private Long bannerId;
}
