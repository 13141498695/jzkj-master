package com.jzkj.modules.farm.service.impl;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.jzkj.common.utils.PageUtils;
import com.jzkj.common.utils.Query;
import com.jzkj.modules.farm.dao.SysfarmingDao;
import com.jzkj.modules.farm.entity.SysFarmEntity;
import com.jzkj.modules.farm.service.SysFarmingServlce;
import org.apache.commons.lang.StringUtils;
import org.springframework.stereotype.Service;
import java.util.Map;

/**
 * 农户相关
 *
 * @author 张宾
 * @Servlce
 * @Email 13141498685@163.com
 */
@Service("SysFarmingServlce")
public class SysFarmingServlceImpl extends ServiceImpl<SysfarmingDao, SysFarmEntity> implements SysFarmingServlce {
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        String farmingname = (String)params.get("farmingname");
        Page<SysFarmEntity> page = this.selectPage(
                new Query<SysFarmEntity>(params).getPage(),
                new EntityWrapper<SysFarmEntity>()
                        .like(StringUtils.isNotBlank(farmingname),"farmingname", farmingname)
        );
        return new PageUtils(page);
    }
}
