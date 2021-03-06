package com.lin.missyou.model_EntityCreateTable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import java.util.List;

//@Entity
public class Spu {
    @Id
    private Long id;
    private String title;
    private String subtitle;

    @ManyToMany(mappedBy = "spuList") //
    private List<Theme> themeList;
}
