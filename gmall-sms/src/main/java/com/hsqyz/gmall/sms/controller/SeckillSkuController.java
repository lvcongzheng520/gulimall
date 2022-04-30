package com.hsqyz.gmall.sms.controller;

import java.util.List;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hsqyz.gmall.sms.entity.SeckillSkuEntity;
import com.hsqyz.gmall.sms.service.SeckillSkuService;
import com.hsqyz.gmall.common.bean.PageResultVo;
import com.hsqyz.gmall.common.bean.ResponseVo;
import com.hsqyz.gmall.common.bean.PageParamVo;

/**
 * 秒杀活动商品关联
 *
 * @author hsqyz
 * @email 1926585708@qq.com
 * @date 2022-04-30 03:02:04
 */
@Api(tags = "秒杀活动商品关联 管理")
@RestController
@RequestMapping("sms/seckillsku")
public class SeckillSkuController {

    @Autowired
    private SeckillSkuService seckillSkuService;

    /**
     * 列表
     */
    @GetMapping
    @ApiOperation("分页查询")
    public ResponseVo<PageResultVo> querySeckillSkuByPage(PageParamVo paramVo){
        PageResultVo pageResultVo = seckillSkuService.queryPage(paramVo);

        return ResponseVo.ok(pageResultVo);
    }


    /**
     * 信息
     */
    @GetMapping("{id}")
    @ApiOperation("详情查询")
    public ResponseVo<SeckillSkuEntity> querySeckillSkuById(@PathVariable("id") Long id){
		SeckillSkuEntity seckillSku = seckillSkuService.getById(id);

        return ResponseVo.ok(seckillSku);
    }

    /**
     * 保存
     */
    @PostMapping
    @ApiOperation("保存")
    public ResponseVo<Object> save(@RequestBody SeckillSkuEntity seckillSku){
		seckillSkuService.save(seckillSku);

        return ResponseVo.ok();
    }

    /**
     * 修改
     */
    @PostMapping("/update")
    @ApiOperation("修改")
    public ResponseVo update(@RequestBody SeckillSkuEntity seckillSku){
		seckillSkuService.updateById(seckillSku);

        return ResponseVo.ok();
    }

    /**
     * 删除
     */
    @PostMapping("/delete")
    @ApiOperation("删除")
    public ResponseVo delete(@RequestBody List<Long> ids){
		seckillSkuService.removeByIds(ids);

        return ResponseVo.ok();
    }

}
