package com.lin.missyou.model_EntityCreateTable;

import javax.persistence.*;

@Entity
public class BannerItem {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // id自增长
    private long id;
    private String img;
    private String keyword;
    private String type;
    private String name;

    private Long bannerId;

    @ManyToOne
    @JoinColumn(foreignKey = @ForeignKey(value= ConstraintMode.NO_CONSTRAINT), insertable = false,updatable = false,name="bannerId")
    private Banner banner;
}
