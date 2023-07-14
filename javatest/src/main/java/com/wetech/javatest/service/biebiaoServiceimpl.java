package com.wetech.javatest.service;

import com.wetech.javatest.entity.biebiao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.wetech.javatest.mapper.biebiaoMapper;
@Service
public class biebiaoServiceimpl implements biebiaoService{
    private final biebiaoMapper biebiaoMapper;

    @Autowired
    public biebiaoServiceimpl(biebiaoMapper biebiaoMapper) {
        this.biebiaoMapper = biebiaoMapper;
    }
    @Override
    public void saveBiebiao(biebiao biebiao) {
           biebiaoMapper.insert(biebiao);
    }
}
