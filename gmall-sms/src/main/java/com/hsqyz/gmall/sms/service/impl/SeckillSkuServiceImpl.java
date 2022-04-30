package com.hsqyz.gmall.sms.service.impl;

import org.springframework.stereotype.Service;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.hsqyz.gmall.common.bean.PageResultVo;
import com.hsqyz.gmall.common.bean.PageParamVo;

import com.hsqyz.gmall.sms.mapper.SeckillSkuMapper;
import com.hsqyz.gmall.sms.entity.SeckillSkuEntity;
import com.hsqyz.gmall.sms.service.SeckillSkuService;


@Service("seckillSkuService")
public class SeckillSkuServiceImpl extends ServiceImpl<SeckillSkuMapper, SeckillSkuEntity> implements SeckillSkuService {

    @Override
    public PageResultVo queryPage(PageParamVo paramVo) {
        IPage<SeckillSkuEntity> page = this.page(
                paramVo.getPage(),
                new QueryWrapper<SeckillSkuEntity>()
        );

        return new PageResultVo(page);
    }

}