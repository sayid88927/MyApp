package com.app.service.impl;

import com.app.mapper.TToolbarMapper;
import com.app.model.TToolbar;
import com.app.service.ToolBarService;
import com.bben.common.util.A;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service(value = "ToolBarService")
public class ToolBarServiceImpl implements ToolBarService {

    @Autowired
    private TToolbarMapper toolbarMapper;

    @Override
    public List<TToolbar> findAll() {

        List<TToolbar> tBedList = toolbarMapper.selectByExample(null);
        if (A.isEmpty(tBedList)){
            return null;
        }
        return tBedList;
    }
}
