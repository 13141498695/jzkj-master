package com.jzkj.modules.tree.service.impl;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.jzkj.common.utils.PageUtils;
import com.jzkj.common.utils.Query;
import com.jzkj.modules.sys.entity.SysDictEntity;
import com.jzkj.modules.sys.entity.SysFruitTreeEntity;
import com.jzkj.modules.tree.dao.SysfruitTreeDao;
import com.jzkj.modules.tree.service.Systreefruitservice;
import org.apache.commons.lang.StringUtils;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Map;

@Service("Systreefruitservice")
public class SystreefruitServlceImpl extends ServiceImpl<SysfruitTreeDao, SysFruitTreeEntity> implements Systreefruitservice {
  @Resource
  private SysfruitTreeDao sysfruitTreeDao;
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
      String treename = (String)params.get("treename");
      Page<SysFruitTreeEntity> page = this.selectPage(
              new Query<SysFruitTreeEntity>(params).getPage(),
              new EntityWrapper<SysFruitTreeEntity>()
                      .like(StringUtils.isNotBlank(treename),"treename", treename)
      );
      return new PageUtils(page);
    }
}
