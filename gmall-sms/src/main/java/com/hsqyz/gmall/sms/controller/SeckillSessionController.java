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

import com.hsqyz.gmall.sms.entity.SeckillSessionEntity;
import com.hsqyz.gmall.sms.service.SeckillSessionService;
import com.hsqyz.gmall.common.bean.PageResultVo;
import com.hsqyz.gmall.common.bean.ResponseVo;
import com.hsqyz.gmall.common.bean.PageParamVo;

/**
 * 秒杀活动场次
 *
 * @author hsqyz
 * @email 1926585708@qq.com
 * @date 2022-04-30 03:02:04
 */
@Api(tags = "秒杀活动场次 管理")
@RestController
@RequestMapping("sms/seckillsession")
public class SeckillSessionController {

    @Autowired
    private SeckillSessionService seckillSessionService;

    /**
     * 列表
     */
    @GetMapping
    @ApiOperation("分页查询")
    public ResponseVo<PageResultVo> querySeckillSessionByPage(PageParamVo paramVo){
        PageResultVo pageResultVo = seckillSessionService.queryPage(paramVo);

        return ResponseVo.ok(pageResultVo);
    }


    /**
     * 信息
     */
    @GetMapping("{id}")
    @ApiOperation("详情查询")
    public ResponseVo<SeckillSessionEntity> querySeckillSessionById(@PathVariable("id") Long id){
		SeckillSessionEntity seckillSession = seckillSessionService.getById(id);

        return ResponseVo.ok(seckillSession);
    }

    /**
     * 保存
     */
    @PostMapping
    @ApiOperation("保存")
    public ResponseVo<Object> save(@RequestBody SeckillSessionEntity seckillSession){
		seckillSessionService.save(seckillSession);

        return ResponseVo.ok();
    }

    /**
     * 修改
     */
    @PostMapping("/update")
    @ApiOperation("修改")
    public ResponseVo update(@RequestBody SeckillSessionEntity seckillSession){
		seckillSessionService.updateById(seckillSession);

        return ResponseVo.ok();
    }

    /**
     * 删除
     */
    @PostMapping("/delete")
    @ApiOperation("删除")
    public ResponseVo delete(@RequestBody List<Long> ids){
		seckillSessionService.removeByIds(ids);

        return ResponseVo.ok();
    }

}
