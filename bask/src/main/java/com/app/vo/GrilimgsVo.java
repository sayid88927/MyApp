package com.app.vo;

import com.app.model.TGrilimgs;
import com.bben.common.util.JsonUtil;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
public class GrilimgsVo {

    private Integer id;

    private String href;

    private String title;

    private String imgurl;

    private Integer num;

    private String detail;

    private String detailupdatetime;


    private  List<TagsVo> tagsVo;


    public void setTagsVo(List<TagsVo> tagsVo) {
        this.tagsVo = tagsVo;
    }

    public List<TagsVo> getTagsVo() {
        return tagsVo;
    }

    public static GrilimgsVo assemblyData(TGrilimgs tGrilimgs){
        return JsonUtil.convert(tGrilimgs,GrilimgsVo.class);
    }

    public static List<GrilimgsVo> assemblyDataList(List<TGrilimgs> tGrilimgsList){
        return JsonUtil.convertList(tGrilimgsList,GrilimgsVo.class);
    }




}
