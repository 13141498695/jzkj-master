package com.jzkj.modules.shop.dao;


import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.jzkj.modules.shop.entity.HelpIssueEntity;

import java.util.List;
import java.util.Map;

/**
 * Dao
 *
 * @author lipengjun
 * @email 939961241@qq.com
 * @date 2018-11-07 10:09:54
 */
public interface HelpIssueDao extends BaseMapper<HelpIssueEntity> {

    HelpIssueEntity queryObject(Integer id);

    List<HelpIssueEntity> queryList(Map<String, Object> map);

    int queryTotal(Map<String, Object> map);

    int save(HelpIssueEntity helpIssue);

    int deleteBatch(Integer[] ids);
}
