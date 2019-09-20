package com.jzkj.modules.shop.service.impl;

import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.jzkj.modules.shop.dao.AdPositionDao;
import com.jzkj.modules.shop.entity.AdPositionEntity;
import com.jzkj.modules.shop.service.AdPositionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;


/**
 * Service实现类
 *
 * @author lipengjun
 * @email 939961241@qq.com
 * @date 2017-08-19 12:02:42
 */
@Service("adPositionService")
public class AdPositionServiceImpl extends ServiceImpl<AdPositionDao, AdPositionEntity>  implements AdPositionService {
    @Autowired
    private AdPositionDao adPositionDao;

    @Override
    public AdPositionEntity queryObject(Integer id) {
        return adPositionDao.queryObject(id);
    }

    @Override
    public List<AdPositionEntity> queryList(Map<String, Object> map) {
        return adPositionDao.queryList(map);
    }

    @Override
    public int queryTotal(Map<String, Object> map) {
        return adPositionDao.queryTotal(map);
    }

    @Override
    public int save(AdPositionEntity adPosition) {
        return adPositionDao.insert(adPosition);
    }

    @Override
    public int update(AdPositionEntity adPosition) {
        return adPositionDao.updateById(adPosition);
    }

    @Override
    public int delete(Integer id) {
        return adPositionDao.deleteById(id);
    }

    @Override
    public int deleteBatch(Integer[] ids) {
        return adPositionDao.deleteBatch(ids);
    }
}
