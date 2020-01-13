package com.app.service.impl;

import com.app.mapper.ToolbarMapper;
import com.app.model.Toolbar;
import com.app.service.ToolBarService;
import com.bben.common.util.A;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service(value = "ToolBarService")
public class ToolBarServiceImpl implements ToolBarService {

    @Autowired
    private ToolbarMapper toolbarMapper;

    @Override
    public List<Toolbar> findAll() {

        List<Toolbar> tBedList = toolbarMapper.selectByExample(null);
        if (A.isEmpty(tBedList)){
            return null;
        }
        return tBedList;
    }
}
