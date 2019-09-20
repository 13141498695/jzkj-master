package com.jzkj.modules.shop.dao;


import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.jzkj.modules.shop.entity.GoodsGalleryEntity;

import java.util.List;
import java.util.Map;

/**
 * Dao
 *
 * @author lipengjun
 * @email 939961241@qq.com
 * @date 2017-08-23 14:41:43
 */
public interface GoodsGalleryDao extends BaseMapper<GoodsGalleryEntity> {
    int deleteByGoodsId(Map<String, Integer> map);

    int save(GoodsGalleryEntity galleryEntity);

    GoodsGalleryEntity queryObject(Integer id);

    List<GoodsGalleryEntity> queryList(Map<String, Object> map);

    int queryTotal(Map<String, Object> map);

    int deleteBatch(Integer[] ids);
}
