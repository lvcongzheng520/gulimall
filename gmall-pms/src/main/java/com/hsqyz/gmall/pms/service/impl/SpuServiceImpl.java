package com.hsqyz.gmall.pms.service.impl;

import com.baomidou.mybatisplus.core.toolkit.StringUtils;
import org.springframework.stereotype.Service;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.hsqyz.gmall.common.bean.PageResultVo;
import com.hsqyz.gmall.common.bean.PageParamVo;

import com.hsqyz.gmall.pms.mapper.SpuMapper;
import com.hsqyz.gmall.pms.entity.SpuEntity;
import com.hsqyz.gmall.pms.service.SpuService;


@Service("spuService")
public class SpuServiceImpl extends ServiceImpl<SpuMapper, SpuEntity> implements SpuService {

    @Override
    public PageResultVo queryPage(PageParamVo paramVo) {
        IPage<SpuEntity> page = this.page(
                paramVo.getPage(),
                new QueryWrapper<SpuEntity>()
        );

        return new PageResultVo(page);
    }

    @Override
    public PageResultVo querySpuByCidAndPage(Long cid, PageParamVo paramVo) {
        QueryWrapper<SpuEntity> wrapper = new QueryWrapper<>();

        //判断cid是否为0,如果不为0则查本类
        if (cid != 0){
            wrapper.eq("category_id",cid);
        }

        //关键字查询
        String key = paramVo.getKey();
        if (StringUtils.isNotBlank(key)){
            wrapper.and(t->{
                t.eq("id",key).or().like("name",key);
            });
        }

        IPage<SpuEntity> page = this.page(paramVo.getPage(), wrapper);

        return new PageResultVo(page);
    }

}