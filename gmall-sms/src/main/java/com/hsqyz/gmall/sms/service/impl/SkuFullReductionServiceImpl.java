package com.hsqyz.gmall.sms.service.impl;

import org.springframework.stereotype.Service;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.hsqyz.gmall.common.bean.PageResultVo;
import com.hsqyz.gmall.common.bean.PageParamVo;

import com.hsqyz.gmall.sms.mapper.SkuFullReductionMapper;
import com.hsqyz.gmall.sms.entity.SkuFullReductionEntity;
import com.hsqyz.gmall.sms.service.SkuFullReductionService;


@Service("skuFullReductionService")
public class SkuFullReductionServiceImpl extends ServiceImpl<SkuFullReductionMapper, SkuFullReductionEntity> implements SkuFullReductionService {

    @Override
    public PageResultVo queryPage(PageParamVo paramVo) {
        IPage<SkuFullReductionEntity> page = this.page(
                paramVo.getPage(),
                new QueryWrapper<SkuFullReductionEntity>()
        );

        return new PageResultVo(page);
    }

}