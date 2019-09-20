package com.jzkj.modules.shop.service.impl;


import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.jzkj.modules.shop.dao.GoodsGalleryDao;
import com.jzkj.modules.shop.entity.GoodsGalleryEntity;
import com.jzkj.modules.shop.service.GoodsGalleryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * Service实现类
 *
 * @author lipengjun
 * @email 939961241@qq.com
 * @date 2017-08-23 14:41:43
 */
@Service("goodsGalleryService")
public class GoodsGalleryServiceImpl   extends ServiceImpl<GoodsGalleryDao, GoodsGalleryEntity> implements GoodsGalleryService {
    @Autowired
    private GoodsGalleryDao goodsGalleryDao;

    @Override
    public GoodsGalleryEntity queryObject(Integer id) {

        return goodsGalleryDao.queryObject(id);
    }

    @Override
    public List<GoodsGalleryEntity> queryList(Map<String, Object> map)
    {
        return goodsGalleryDao.queryList(map);
    }

    @Override
    public int queryTotal(Map<String, Object> map)
    {
        return goodsGalleryDao.queryTotal(map);
    }

    @Override
    public int save(GoodsGalleryEntity goodsGallery) {

        return goodsGalleryDao.save(goodsGallery);
    }

    @Override
    public int update(GoodsGalleryEntity goodsGallery) {

        return goodsGalleryDao.updateById(goodsGallery);
    }

    @Override
    public int delete(Integer id) {

        return goodsGalleryDao.deleteById(id);
    }

    @Override
    public int deleteBatch(Integer[] ids) {

        return goodsGalleryDao.deleteBatch(ids);
    }
}
