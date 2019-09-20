package com.jzkj.modules.shop.dao;


import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.jzkj.modules.shop.entity.CommentPictureEntity;

import java.util.List;
import java.util.Map;

/**
 * 评价图片Dao
 *
 * @author lipengjun
 * @email 939961241@qq.com
 * @date 2017-08-29 14:45:55
 */
public interface CommentPictureDao extends BaseMapper<CommentPictureEntity> {
    /**
     * 根据commentId删除
     *
     * @param commentId
     * @return
     */
    int deleteByCommentId(Integer commentId);

    CommentPictureEntity queryObject(Integer id);

    List<CommentPictureEntity> queryList(Map<String, Object> map);

    int queryTotal(Map<String, Object> map);

    int deleteBatch(Integer[] ids);

    int save(CommentPictureEntity commentPicture);
}
