package com.hsqyz.gmall.pms.service.impl;

import org.springframework.stereotype.Service;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.hsqyz.gmall.common.bean.PageResultVo;
import com.hsqyz.gmall.common.bean.PageParamVo;

import com.hsqyz.gmall.pms.mapper.BrandMapper;
import com.hsqyz.gmall.pms.entity.BrandEntity;
import com.hsqyz.gmall.pms.service.BrandService;


@Service("brandService")
public class BrandServiceImpl extends ServiceImpl<BrandMapper, BrandEntity> implements BrandService {

    @Override
    public PageResultVo queryPage(PageParamVo paramVo) {
        IPage<BrandEntity> page = this.page(
                paramVo.getPage(),
                new QueryWrapper<BrandEntity>()
        );

        return new PageResultVo(page);
    }

}