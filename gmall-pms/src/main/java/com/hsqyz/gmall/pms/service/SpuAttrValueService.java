package com.hsqyz.gmall.pms.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.hsqyz.gmall.common.bean.PageResultVo;
import com.hsqyz.gmall.common.bean.PageParamVo;
import com.hsqyz.gmall.pms.entity.SpuAttrValueEntity;

/**
 * spu属性值
 *
 * @author hsqyz
 * @email 1926585708@qq.com
 * @date 2022-04-30 01:55:26
 */
public interface SpuAttrValueService extends IService<SpuAttrValueEntity> {

    PageResultVo queryPage(PageParamVo paramVo);
}

