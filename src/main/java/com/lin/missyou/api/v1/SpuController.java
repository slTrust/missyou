package com.lin.missyou.api.v1;

import com.github.dozermapper.core.DozerBeanMapperBuilder;
import com.github.dozermapper.core.Mapper;
import com.lin.missyou.bo.PageCounter;
import com.lin.missyou.exception.http.NotFoundException;
import com.lin.missyou.model.Sku;
import com.lin.missyou.model.Spu;
import com.lin.missyou.service.SpuService;
import com.lin.missyou.util.CommonUtil;
import com.lin.missyou.vo.Paging;
import com.lin.missyou.vo.PagingDozer;
import com.lin.missyou.vo.SpuSimplifyVO;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.validation.constraints.Positive;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/spu")
@Validated
public class SpuController {
    @Autowired
    private SpuService spuService;

    @GetMapping("/id/{id}/detail")
    public Spu getDetail(@PathVariable @Positive Long id){
        Spu spu = spuService.getSpu(id);
        if(spu == null){
            throw new NotFoundException(30003);
        }
        return spu;
    }

    @GetMapping("/id/{id}/simplify")
    public SpuSimplifyVO getSimplifySpu(@PathVariable @Positive Long id){
        Spu spu = spuService.getSpu(id);
        SpuSimplifyVO vo = new SpuSimplifyVO();
        BeanUtils.copyProperties(spu,vo);
        return vo;
    }

    @GetMapping("/latest")
    public PagingDozer<Spu,SpuSimplifyVO> getLatestSpuList(@RequestParam(defaultValue = "0") Integer start,
                                                @RequestParam(defaultValue = "10") Integer count){
        PageCounter pageCounter = CommonUtil.convertToPageParamter(start,count);
        Page<Spu> page = this.spuService.getLatestPagingSpu(pageCounter.getPage(),pageCounter.getCount());

        return new PagingDozer<>(page,SpuSimplifyVO.class);
    }
}
