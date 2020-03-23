package com.lin.missyou.repository;

import com.lin.missyou.model.Banner;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BannerRepository extends JpaRepository<Banner, Long> {
    /*
    继承 JpaRepository<Banner, Long>
    第一个参数是 操作的实体类
    第二个参数是 实体类的主键
    */

    Banner findOneById(Long id);

    Banner findOneByName(String name);
}
