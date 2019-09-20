package com.jzkj.modules.sys.dao;


import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.jzkj.modules.sys.entity.SysSmsLogEntity;

import java.util.List;
import java.util.Map;

/**
 * 发送短信日志Dao
 *
 * @author lipengjun
 * @email 939961241@qq.com
 * @date 2017-12-16 23:38:05
 */
public interface SysSmsLogDao extends BaseMapper<SysSmsLogEntity> {
    List<SysSmsLogEntity> queryList(Map<String, Object> map);
}
