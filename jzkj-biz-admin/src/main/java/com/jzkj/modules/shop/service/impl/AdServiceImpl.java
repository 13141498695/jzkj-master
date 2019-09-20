package com.jzkj.modules.shop.service.impl;

import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.jzkj.modules.shop.dao.AdDao;
import com.jzkj.modules.shop.entity.AdEntity;
import com.jzkj.modules.shop.service.AdService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;


/**
 * Service实现类
 *
 * @author lipengjun
 * @email 939961241@qq.com
 * @date 2017-08-19 09:37:35
 */
@Service("adService")
public class AdServiceImpl   extends ServiceImpl<AdDao, AdEntity> implements AdService {
    @Autowired
    private AdDao adDao;

    @Override
    public AdEntity queryObject(Integer id) {
        return adDao.queryObject(id);
    }


    @Override
    public List<AdEntity> queryList(Map<String, Object> map) {
        return adDao.queryList(map);
    }

    @Override
    public int queryTotal(Map<String, Object> map) {
        return adDao.queryTotal(map);
    }

    @Override
    public int save(AdEntity ad) {
        return adDao.save(ad);
    }

    @Override
    public int update(AdEntity ad) {

        return adDao.updateById(ad);
    }

    @Override
    public int delete(Integer id) {

        return adDao.deleteById(id);
    }

    @Override
    public int deleteBatch(Integer[]ids) {
        return adDao.deleteBatch(ids);
    }
}
