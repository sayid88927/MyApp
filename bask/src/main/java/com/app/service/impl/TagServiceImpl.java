package com.app.service.impl;

import com.app.mapper.TCarouselsMapper;
import com.app.mapper.TTagMapper;
import com.app.model.TCarousels;
import com.app.model.TTag;
import com.app.model.TToolbar;
import com.app.service.CarouselsService;
import com.app.service.TagService;
import com.app.vo.TagsVo;
import com.bben.common.util.A;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service(value = "TagService")
public class TagServiceImpl implements TagService {


    @Autowired
    private TTagMapper tagMapper;


    @Override
    public List<TagsVo> findAll() {

        List<TTag> tTagList = tagMapper.selectByExample(null);
        if (A.isEmpty(tTagList)){
            return null;
        }
        return TagsVo.assemblyDataList(tTagList);
    }

}
