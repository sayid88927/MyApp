package com.app.service.impl;

import com.app.mapper.TGrilimgsMapper;
import com.app.model.TGrilimgs;
import com.app.model.TGrilimgsExample;
import com.app.model.TImgurl;
import com.app.model.TImgurlExample;
import com.app.service.GrilImgsService;
import com.app.vo.GrilimgsVo;
import com.app.vo.TagsVo;
import com.bben.common.PageInfo;
import com.bben.common.util.A;
import com.bben.common.util.U;
import com.github.pagehelper.PageHelper;
import org.apache.ibatis.annotations.Select;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service(value = "GrilImgsService")
public class GrilmgsServiceImpl implements GrilImgsService {

    @Autowired
    private TGrilimgsMapper tGrilimgsMapper;

    @Override
    public List<GrilimgsVo> findAll() {
        List<TGrilimgs> tGrilimgs = tGrilimgsMapper.selectByExample(null);
        if (A.isEmpty(tGrilimgs)) {
            return null;
        }
        return assData(tGrilimgs);
//        return null;
    }

    @Override
    public PageInfo<GrilimgsVo> getTBedVoByCondition(int pageNum,int pageSize) {
        PageHelper.startPage(pageNum,pageSize);
        List<TGrilimgs> tGrilimgs = tGrilimgsMapper.selectByExample(null);
        PageInfo<TGrilimgs> tGrilimgsPageInfo = new PageInfo<>(tGrilimgs);
        List<GrilimgsVo> grilimgsVoList = assData(tGrilimgsPageInfo.getList());
        PageInfo<GrilimgsVo> grilimgsVoPageInfo = new PageInfo<>();
        grilimgsVoPageInfo.setList(grilimgsVoList);
        grilimgsVoPageInfo.setTotal(tGrilimgsPageInfo.getTotal());
        grilimgsVoPageInfo.setPageNum(tGrilimgsPageInfo.getPageNum());
        grilimgsVoPageInfo.setPages(tGrilimgsPageInfo.getPages());
        grilimgsVoPageInfo.setPageSize(tGrilimgsPageInfo.getPageSize());
        grilimgsVoPageInfo.setIsFirstPage(tGrilimgsPageInfo.isIsFirstPage());
        grilimgsVoPageInfo.setIsLastPage(tGrilimgsPageInfo.isIsLastPage());
        if (A.isEmpty(tGrilimgs)) {
            return null;
        }
        return  grilimgsVoPageInfo;
    }

    @Override
    public   List<GrilimgsVo> selectByTagId(String Id) {
        if (U.isBlank(Id)) {
            return null;
        }

//   @Select("SELECT * FROM t_grilimgs WHERE FIND_IN_SET(#{tagid},tagid)")
//    List<TGrilimgs> selectByTagId(String tagid);
        List<TGrilimgs> tGrilimgsList = tGrilimgsMapper.selectByTagId(Id);
        return assData( tGrilimgsList);
    }

    private List<GrilimgsVo> assData(List<TGrilimgs> tGrilimgs) {
        List<GrilimgsVo> grilimgsVoList = new ArrayList<>();
        for (int i = 0; i < tGrilimgs.size(); i++) {
            GrilimgsVo tHospitalVo = GrilimgsVo.assemblyData(tGrilimgs.get(i));
            String tagString = tGrilimgs.get(i).getTag();
            String tagIdString = tGrilimgs.get(i).getTagid();
            String[] arr = tagString.split(",");
            String[] arrtagId = tagIdString.split(",");
            List<TagsVo> tagsVoList = new ArrayList<>();
            for (int n = 0; n < arr.length; n++) {
                TagsVo tagsVo = new TagsVo();
                tagsVo.setTag(arr[n]);
                tagsVo.setTagid(arrtagId[n]);
                tagsVoList.add(tagsVo);
            }
            tHospitalVo.setTagsVo(tagsVoList);
            grilimgsVoList.add(tHospitalVo);
        }
        return grilimgsVoList;
    }


}
