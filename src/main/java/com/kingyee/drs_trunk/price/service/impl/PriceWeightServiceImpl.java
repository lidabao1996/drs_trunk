package com.kingyee.drs_trunk.price.service.impl;

import com.kingyee.drs_trunk.price.entity.DrugWeightEntity;
import com.kingyee.drs_trunk.price.mapper.DrugWeightMapper;
import com.kingyee.drs_trunk.price.service.PriceWeightService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class PriceWeightServiceImpl implements PriceWeightService {
    @Resource
    private DrugWeightMapper drugWeightMapper;


    @Override
    public void drugWeightSave(DrugWeightEntity drugWeightEntity) {
        drugWeightMapper.drugWeightSave(drugWeightEntity);
    }
}
