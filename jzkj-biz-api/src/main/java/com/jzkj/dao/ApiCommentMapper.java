package com.jzkj.dao;


import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.jzkj.entity.CommentVo;

import java.util.Map;

/**
 * @author lipengjun
 * @email 939961241@qq.com
 * @date 2017-08-11 09:14:26
 */
public interface ApiCommentMapper extends BaseMapper<CommentVo> {
    int queryhasPicTotal(Map<String, Object> map);
}
