package com.app.controller.home;

import com.app.model.TToolbar;
import com.app.service.ToolBarService;
import com.bben.common.BaseController;
import com.bben.common.entity.vo.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/toolbar")
public class ToolBarController extends BaseController {

    @Autowired
    private ToolBarService toolBarService;

    @GetMapping("/test")
    public Result<List<TToolbar>> getBedInfo(){
        List<TToolbar> ToolbarList = toolBarService.findAll();
        return Result.success("查询信息成功",ToolbarList);
    }

}
