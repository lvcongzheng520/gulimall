package com.hsqyz.gmall.ums.mapper;

import com.hsqyz.gmall.ums.entity.UserEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 用户表
 * 
 * @author hsqyz
 * @email 1926585708@qq.com
 * @date 2022-04-30 12:31:42
 */
@Mapper
public interface UserMapper extends BaseMapper<UserEntity> {
	
}
