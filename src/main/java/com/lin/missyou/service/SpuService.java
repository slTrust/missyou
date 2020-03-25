package com.lin.missyou.service;

import com.lin.missyou.model.Spu;
import com.lin.missyou.repository.SpuRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SpuService {
    @Autowired
    SpuRepository spuRepository;

    public Spu getSpu(Long id){
        return spuRepository.findOneById(id);
    }

}
