package com.lin.missyou.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Date;
import java.util.Objects;

@Entity
@Getter
@Setter
public class BannerItem {
    @Id
    private Long id;
    private String img;
    private String keyword;
    private Short type;
    private Date createTime;
    private Date updateTime;
    private Date deleteTime;
    private Long bannerId;
    private String name;
}
