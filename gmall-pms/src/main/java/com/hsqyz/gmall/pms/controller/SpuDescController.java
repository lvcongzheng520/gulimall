package com.hsqyz.gmall.pms.controller;

import com.hsqyz.gmall.common.bean.PageParamVo;
import com.hsqyz.gmall.common.bean.PageResultVo;
import com.hsqyz.gmall.common.bean.ResponseVo;
import com.hsqyz.gmall.pms.entity.SpuDescEntity;
import com.hsqyz.gmall.pms.service.SpuDescService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * spu信息介绍
 *
 * @author hsqyz
 * @email 1926585708@qq.com
 * @date 2022-04-30 01:55:25
 */
@Api(tags = "spu信息介绍 管理")
@RestController
@RequestMapping("pms/spudesc")
public class SpuDescController {

    @Autowired
    private SpuDescService spuDescService;

    /**
     * 列表
     */
    @GetMapping
    @ApiOperation("分页查询")
    public ResponseVo<PageResultVo> querySpuDescByPage(PageParamVo paramVo){
        PageResultVo pageResultVo = spuDescService.queryPage(paramVo);

        return ResponseVo.ok(pageResultVo);
    }


    /**
     * 信息
     */
    @GetMapping("{spuId}")
    @ApiOperation("详情查询")
    public ResponseVo<SpuDescEntity> querySpuDescById(@PathVariable("spuId") Long spuId){
		SpuDescEntity spuDesc = spuDescService.getById(spuId);

        return ResponseVo.ok(spuDesc);
    }

    /**
     * 保存
     */
    @PostMapping
    @ApiOperation("保存")
    public ResponseVo<Object> save(@RequestBody SpuDescEntity spuDesc){
		spuDescService.save(spuDesc);

        return ResponseVo.ok();
    }

    /**
     * 修改
     */
    @PostMapping("/update")
    @ApiOperation("修改")
    public ResponseVo update(@RequestBody SpuDescEntity spuDesc){
		spuDescService.updateById(spuDesc);

        return ResponseVo.ok();
    }

    /**
     * 删除
     */
    @PostMapping("/delete")
    @ApiOperation("删除")
    public ResponseVo delete(@RequestBody List<Long> spuIds){
		spuDescService.removeByIds(spuIds);

        return ResponseVo.ok();
    }

}
