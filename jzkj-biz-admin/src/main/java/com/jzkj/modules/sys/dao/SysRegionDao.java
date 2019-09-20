package com.jzkj.modules.sys.dao;


import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.jzkj.modules.sys.entity.SysRegionEntity;

import java.util.List;
import java.util.Map;

/**
 * @author lipengjun
 * @email 939961241@qq.com
 * @date 2017-11-04 11:19:31
 */
public interface SysRegionDao extends BaseMapper<SysRegionEntity> {

    List<SysRegionEntity> queryList(Map<String, Object> map);
}
