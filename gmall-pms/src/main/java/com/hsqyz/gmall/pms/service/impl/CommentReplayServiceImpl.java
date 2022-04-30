package com.hsqyz.gmall.pms.service.impl;

import org.springframework.stereotype.Service;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.hsqyz.gmall.common.bean.PageResultVo;
import com.hsqyz.gmall.common.bean.PageParamVo;

import com.hsqyz.gmall.pms.mapper.CommentReplayMapper;
import com.hsqyz.gmall.pms.entity.CommentReplayEntity;
import com.hsqyz.gmall.pms.service.CommentReplayService;


@Service("commentReplayService")
public class CommentReplayServiceImpl extends ServiceImpl<CommentReplayMapper, CommentReplayEntity> implements CommentReplayService {

    @Override
    public PageResultVo queryPage(PageParamVo paramVo) {
        IPage<CommentReplayEntity> page = this.page(
                paramVo.getPage(),
                new QueryWrapper<CommentReplayEntity>()
        );

        return new PageResultVo(page);
    }

}