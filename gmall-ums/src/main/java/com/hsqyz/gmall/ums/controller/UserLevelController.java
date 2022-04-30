package com.hsqyz.gmall.ums.controller;

import java.util.List;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.hsqyz.gmall.ums.entity.UserLevelEntity;
import com.hsqyz.gmall.ums.service.UserLevelService;
import com.hsqyz.gmall.common.bean.PageResultVo;
import com.hsqyz.gmall.common.bean.ResponseVo;
import com.hsqyz.gmall.common.bean.PageParamVo;

/**
 * 会员等级表
 *
 * @author hsqyz
 * @email 1926585708@qq.com
 * @date 2022-04-30 12:31:42
 */
@Api(tags = "会员等级表 管理")
@RestController
@RequestMapping("ums/userlevel")
public class UserLevelController {

    @Autowired
    private UserLevelService userLevelService;

    /**
     * 列表
     */
    @GetMapping
    @ApiOperation("分页查询")
    public ResponseVo<PageResultVo> queryUserLevelByPage(PageParamVo paramVo){
        PageResultVo pageResultVo = userLevelService.queryPage(paramVo);

        return ResponseVo.ok(pageResultVo);
    }


    /**
     * 信息
     */
    @GetMapping("{id}")
    @ApiOperation("详情查询")
    public ResponseVo<UserLevelEntity> queryUserLevelById(@PathVariable("id") Long id){
		UserLevelEntity userLevel = userLevelService.getById(id);

        return ResponseVo.ok(userLevel);
    }

    /**
     * 保存
     */
    @PostMapping
    @ApiOperation("保存")
    public ResponseVo<Object> save(@RequestBody UserLevelEntity userLevel){
		userLevelService.save(userLevel);

        return ResponseVo.ok();
    }

    /**
     * 修改
     */
    @PostMapping("/update")
    @ApiOperation("修改")
    public ResponseVo update(@RequestBody UserLevelEntity userLevel){
		userLevelService.updateById(userLevel);

        return ResponseVo.ok();
    }

    /**
     * 删除
     */
    @PostMapping("/delete")
    @ApiOperation("删除")
    public ResponseVo delete(@RequestBody List<Long> ids){
		userLevelService.removeByIds(ids);

        return ResponseVo.ok();
    }

}
