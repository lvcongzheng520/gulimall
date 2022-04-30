package com.hsqyz.gmall.ums.mapper;

import com.hsqyz.gmall.ums.entity.UserLoginLogEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 用户登陆记录表
 * 
 * @author hsqyz
 * @email 1926585708@qq.com
 * @date 2022-04-30 12:31:42
 */
@Mapper
public interface UserLoginLogMapper extends BaseMapper<UserLoginLogEntity> {
	
}
