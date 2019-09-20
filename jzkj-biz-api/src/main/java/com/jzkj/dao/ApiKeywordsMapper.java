package com.jzkj.dao;


import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.jzkj.entity.KeywordsVo;

import java.util.List;
import java.util.Map;

/**
 * 热闹关键词表
 *
 * @author lipengjun
 * @email 939961241@qq.com
 * @date 2017-08-11 09:16:46
 */
public interface ApiKeywordsMapper extends BaseMapper<KeywordsVo> {
    List<Map> hotKeywordList(Map param);
}
