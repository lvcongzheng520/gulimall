package com.hsqyz.gmall.pms.service.impl;

import org.springframework.stereotype.Service;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.hsqyz.gmall.common.bean.PageResultVo;
import com.hsqyz.gmall.common.bean.PageParamVo;

import com.hsqyz.gmall.pms.mapper.CommentMapper;
import com.hsqyz.gmall.pms.entity.CommentEntity;
import com.hsqyz.gmall.pms.service.CommentService;


@Service("commentService")
public class CommentServiceImpl extends ServiceImpl<CommentMapper, CommentEntity> implements CommentService {

    @Override
    public PageResultVo queryPage(PageParamVo paramVo) {
        IPage<CommentEntity> page = this.page(
                paramVo.getPage(),
                new QueryWrapper<CommentEntity>()
        );

        return new PageResultVo(page);
    }

}