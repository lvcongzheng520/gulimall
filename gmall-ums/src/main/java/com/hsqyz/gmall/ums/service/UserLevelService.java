package com.hsqyz.gmall.ums.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.hsqyz.gmall.common.bean.PageResultVo;
import com.hsqyz.gmall.common.bean.PageParamVo;
import com.hsqyz.gmall.ums.entity.UserLevelEntity;

import java.util.Map;

/**
 * 会员等级表
 *
 * @author hsqyz
 * @email 1926585708@qq.com
 * @date 2022-04-30 12:31:42
 */
public interface UserLevelService extends IService<UserLevelEntity> {

    PageResultVo queryPage(PageParamVo paramVo);
}

