package com.hsqyz.gmall.oms.mapper;

import com.hsqyz.gmall.oms.entity.OrderOperateHistoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单操作历史记录
 * 
 * @author hsqyz
 * @email 1926585708@qq.com
 * @date 2022-04-30 12:26:43
 */
@Mapper
public interface OrderOperateHistoryMapper extends BaseMapper<OrderOperateHistoryEntity> {
	
}
