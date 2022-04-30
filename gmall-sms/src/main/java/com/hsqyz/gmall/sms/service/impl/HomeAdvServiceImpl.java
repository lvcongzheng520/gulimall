package com.hsqyz.gmall.sms.service.impl;

import org.springframework.stereotype.Service;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.hsqyz.gmall.common.bean.PageResultVo;
import com.hsqyz.gmall.common.bean.PageParamVo;

import com.hsqyz.gmall.sms.mapper.HomeAdvMapper;
import com.hsqyz.gmall.sms.entity.HomeAdvEntity;
import com.hsqyz.gmall.sms.service.HomeAdvService;


@Service("homeAdvService")
public class HomeAdvServiceImpl extends ServiceImpl<HomeAdvMapper, HomeAdvEntity> implements HomeAdvService {

    @Override
    public PageResultVo queryPage(PageParamVo paramVo) {
        IPage<HomeAdvEntity> page = this.page(
                paramVo.getPage(),
                new QueryWrapper<HomeAdvEntity>()
        );

        return new PageResultVo(page);
    }

}