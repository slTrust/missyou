package com.lin.missyou.model;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name="banner")
public class Banner {
    @Id
    private long id;

    @Column(length = 16)
    private String name;

    @Transient // 这样 数据库就不会生成 这个字段
    private String description;
    private String img;
    private String title;

    // 对应一组 BannerItem
    @OneToMany
    private List<BannerItem> items;
}
