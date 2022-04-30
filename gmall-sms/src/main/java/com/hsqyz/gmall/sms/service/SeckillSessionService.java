package com.hsqyz.gmall.sms.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.hsqyz.gmall.common.bean.PageResultVo;
import com.hsqyz.gmall.common.bean.PageParamVo;
import com.hsqyz.gmall.sms.entity.SeckillSessionEntity;

/**
 * 秒杀活动场次
 *
 * @author hsqyz
 * @email 1926585708@qq.com
 * @date 2022-04-30 03:02:04
 */
public interface SeckillSessionService extends IService<SeckillSessionEntity> {

    PageResultVo queryPage(PageParamVo paramVo);
}

