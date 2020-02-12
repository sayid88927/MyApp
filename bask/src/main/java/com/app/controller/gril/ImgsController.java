package com.app.controller.gril;


import com.app.model.TGrilimgs;
import com.app.model.TToolbar;
import com.app.service.GrilImgsService;
import com.app.service.TagService;
import com.app.service.TimgurService;
import com.app.service.ToolBarService;
import com.app.vo.GrilimgsVo;
import com.app.vo.ImgurlVo;
import com.app.vo.TagsVo;
import com.bben.common.PageInfo;
import com.bben.common.entity.vo.Result;
import com.bben.common.util.A;
import com.github.pagehelper.PageHelper;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/gril")
public class ImgsController {


    @Autowired
    private GrilImgsService grilImgsService;

    @Autowired
    private TimgurService timgurService;

    @Autowired
    private TagService tagService;


    @GetMapping("/test")
    public Result<List<GrilimgsVo>> getBedInfo(){
        List<GrilimgsVo> grilimgsVoList = grilImgsService.findAll();

        return Result.success("查询信息成功",grilimgsVoList);
    }


    @GetMapping("/getGrilimgsVoByCondition")
    public  Result<PageInfo<GrilimgsVo>> getTBedVoByCondition(
                                                      @RequestParam(name = "pageNum",required = false,defaultValue = "1")int pageNum,
                                                      @RequestParam(name = "pageSize",required = false,defaultValue = "10")int pageSize){

        PageInfo<GrilimgsVo> tBedVoList = grilImgsService.getTBedVoByCondition(pageNum,pageSize);

        return Result.success("查询床位信息成功",tBedVoList);
    }


    
    @GetMapping("/selectById")
    public Result<List<ImgurlVo>> selectById(@RequestParam Integer Id){
        List<ImgurlVo> imgurlVoList = timgurService.selectByPrimaryKey(Id);
        return Result.success("查询信息成功",imgurlVoList);
    }



    @GetMapping("/selectTagId")
    public Result<List<GrilimgsVo>> selectByTagId(@RequestParam String Id){
        List<GrilimgsVo> imgurlVoList = grilImgsService.selectByTagId(Id);
        return Result.success("查询信息成功",imgurlVoList);
    }

    @GetMapping("/selectTag")
    public Result<List<TagsVo>> selectByTag(){
        List<TagsVo> tagsVoList = tagService.findAll();
        return Result.success("查询信息成功",tagsVoList);
    }



}
