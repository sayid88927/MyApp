package com.app.service.impl;

import com.app.mapper.CarouselsMapper;
import com.app.mapper.ToolbarMapper;
import com.app.model.Carousels;
import com.app.model.Toolbar;
import com.app.service.CarouselsService;
import com.bben.common.util.A;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service(value = "CarouselsService")
public class CarouselsServiceImpl implements CarouselsService {


    @Autowired
    private CarouselsMapper carouselsMapper;


    @Override
    public List<Carousels> findAll() {
        List<Carousels> tCarouselsList = carouselsMapper.selectByExample(null);
        if (A.isEmpty(tCarouselsList)){
            return null;
        }
        return tCarouselsList;
    }
}
