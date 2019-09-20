package com.jzkj.modules.sys.service.impl;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.jzkj.common.utils.PageUtils;
import com.jzkj.common.utils.Query;
import com.jzkj.modules.sys.dao.SysDictDao;
import com.jzkj.modules.sys.entity.SysDictEntity;
import com.jzkj.modules.sys.service.SysDictService;

import org.apache.commons.lang.StringUtils;
import org.springframework.stereotype.Service;

import java.util.Map;


@Service("sysDictService")
public class SysDictServiceImpl extends ServiceImpl<SysDictDao, SysDictEntity> implements SysDictService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        String name = (String)params.get("name");

        Page<SysDictEntity> page = this.selectPage(
                new Query<SysDictEntity>(params).getPage(),
                new EntityWrapper<SysDictEntity>()
                    .like(StringUtils.isNotBlank(name),"name", name)
        );

        return new PageUtils(page);
    }

}
