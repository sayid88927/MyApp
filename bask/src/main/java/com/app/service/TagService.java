package com.app.service;


import com.app.model.TCarousels;
import com.app.model.TTag;
import com.app.vo.TagsVo;

import java.util.List;

public interface TagService {

    List<TagsVo> findAll();

}
