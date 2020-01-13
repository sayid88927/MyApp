package com.app.controller.home;

import com.app.model.Carousels;
import com.app.model.Toolbar;
import com.app.service.CarouselsService;
import com.app.service.ToolBarService;
import com.bben.common.entity.vo.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/carousels")
public class CarouselsController {

    @Autowired
    private CarouselsService carouselsService;

    @GetMapping("/info")
    public Result<List<Carousels>> getBedInfo(){
        List<Carousels> CarouselsList = carouselsService.findAll();
        return Result.success("查询信息成功",CarouselsList);
    }



}
