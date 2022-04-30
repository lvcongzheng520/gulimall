package com.hsqyz.gmall.pms.controller;

import com.hsqyz.gmall.common.bean.PageParamVo;
import com.hsqyz.gmall.common.bean.PageResultVo;
import com.hsqyz.gmall.common.bean.ResponseVo;
import com.hsqyz.gmall.pms.entity.CommentEntity;
import com.hsqyz.gmall.pms.service.CommentService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * 商品评价
 *
 * @author hsqyz
 * @email 1926585708@qq.com
 * @date 2022-04-30 01:55:25
 */
@Api(tags = "商品评价 管理")
@RestController
@RequestMapping("pms/comment")
public class CommentController {

    @Autowired
    private CommentService commentService;

    /**
     * 列表
     */
    @GetMapping
    @ApiOperation("分页查询")
    public ResponseVo<PageResultVo> queryCommentByPage(PageParamVo paramVo){
        PageResultVo pageResultVo = commentService.queryPage(paramVo);

        return ResponseVo.ok(pageResultVo);
    }


    /**
     * 信息
     */
    @GetMapping("{id}")
    @ApiOperation("详情查询")
    public ResponseVo<CommentEntity> queryCommentById(@PathVariable("id") Long id){
		CommentEntity comment = commentService.getById(id);

        return ResponseVo.ok(comment);
    }

    /**
     * 保存
     */
    @PostMapping
    @ApiOperation("保存")
    public ResponseVo<Object> save(@RequestBody CommentEntity comment){
		commentService.save(comment);

        return ResponseVo.ok();
    }

    /**
     * 修改
     */
    @PostMapping("/update")
    @ApiOperation("修改")
    public ResponseVo update(@RequestBody CommentEntity comment){
		commentService.updateById(comment);

        return ResponseVo.ok();
    }

    /**
     * 删除
     */
    @PostMapping("/delete")
    @ApiOperation("删除")
    public ResponseVo delete(@RequestBody List<Long> ids){
		commentService.removeByIds(ids);

        return ResponseVo.ok();
    }

}
