package com.jzkj.modules.cooperative.servlce.impl;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.jzkj.common.utils.PageUtils;
import com.jzkj.common.utils.Query;
import com.jzkj.modules.cooperative.dao.CooperativeDao;
import com.jzkj.modules.cooperative.entity.CooperativeEntity;
import com.jzkj.modules.cooperative.servlce.CooperativeServlce;
import com.jzkj.modules.farm.entity.SysFarmEntity;
import org.apache.commons.lang.StringUtils;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service("CooperativeServlce")
public class CooperativeservlceImpl extends ServiceImpl<CooperativeDao, CooperativeEntity>  implements CooperativeServlce {
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        String cooperativename = (String)params.get("cooperativename");
        Page<CooperativeEntity> page = this.selectPage(
                new Query<CooperativeEntity>(params).getPage(),
                new EntityWrapper<CooperativeEntity>()
                        .like(StringUtils.isNotBlank(cooperativename),"cooperativename", cooperativename)
        );
        return new PageUtils(page);
    }
}
