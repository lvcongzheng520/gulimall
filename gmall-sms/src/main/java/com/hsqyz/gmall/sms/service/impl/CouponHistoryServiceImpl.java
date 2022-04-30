package com.hsqyz.gmall.sms.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.hsqyz.gmall.common.bean.PageParamVo;
import com.hsqyz.gmall.common.bean.PageResultVo;
import com.hsqyz.gmall.sms.entity.CouponHistoryEntity;
import com.hsqyz.gmall.sms.mapper.CouponHistoryMapper;
import com.hsqyz.gmall.sms.service.CouponHistoryService;
import org.springframework.stereotype.Service;


@Service("couponHistoryService")
public class CouponHistoryServiceImpl extends ServiceImpl<CouponHistoryMapper, CouponHistoryEntity> implements CouponHistoryService {

    @Override
    public PageResultVo queryPage(PageParamVo paramVo) {
        IPage<CouponHistoryEntity> page = this.page(
                paramVo.getPage(),
                new QueryWrapper<CouponHistoryEntity>()
        );

        return new PageResultVo(page);
    }

}