package com.hsqyz.gmall.oms.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.hsqyz.gmall.common.bean.PageResultVo;
import com.hsqyz.gmall.common.bean.PageParamVo;

import com.hsqyz.gmall.oms.mapper.OrderReturnReasonMapper;
import com.hsqyz.gmall.oms.entity.OrderReturnReasonEntity;
import com.hsqyz.gmall.oms.service.OrderReturnReasonService;


@Service("orderReturnReasonService")
public class OrderReturnReasonServiceImpl extends ServiceImpl<OrderReturnReasonMapper, OrderReturnReasonEntity> implements OrderReturnReasonService {

    @Override
    public PageResultVo queryPage(PageParamVo paramVo) {
        IPage<OrderReturnReasonEntity> page = this.page(
                paramVo.getPage(),
                new QueryWrapper<OrderReturnReasonEntity>()
        );

        return new PageResultVo(page);
    }

}