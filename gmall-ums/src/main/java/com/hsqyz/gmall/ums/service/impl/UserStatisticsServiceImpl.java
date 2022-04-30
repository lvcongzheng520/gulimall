package com.hsqyz.gmall.ums.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.hsqyz.gmall.common.bean.PageResultVo;
import com.hsqyz.gmall.common.bean.PageParamVo;

import com.hsqyz.gmall.ums.mapper.UserStatisticsMapper;
import com.hsqyz.gmall.ums.entity.UserStatisticsEntity;
import com.hsqyz.gmall.ums.service.UserStatisticsService;


@Service("userStatisticsService")
public class UserStatisticsServiceImpl extends ServiceImpl<UserStatisticsMapper, UserStatisticsEntity> implements UserStatisticsService {

    @Override
    public PageResultVo queryPage(PageParamVo paramVo) {
        IPage<UserStatisticsEntity> page = this.page(
                paramVo.getPage(),
                new QueryWrapper<UserStatisticsEntity>()
        );

        return new PageResultVo(page);
    }

}