package com.hsqyz.gmall.sms.service.impl;

import org.springframework.stereotype.Service;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.hsqyz.gmall.common.bean.PageResultVo;
import com.hsqyz.gmall.common.bean.PageParamVo;

import com.hsqyz.gmall.sms.mapper.CouponSpuMapper;
import com.hsqyz.gmall.sms.entity.CouponSpuEntity;
import com.hsqyz.gmall.sms.service.CouponSpuService;


@Service("couponSpuService")
public class CouponSpuServiceImpl extends ServiceImpl<CouponSpuMapper, CouponSpuEntity> implements CouponSpuService {

    @Override
    public PageResultVo queryPage(PageParamVo paramVo) {
        IPage<CouponSpuEntity> page = this.page(
                paramVo.getPage(),
                new QueryWrapper<CouponSpuEntity>()
        );

        return new PageResultVo(page);
    }

}