package com.jzkj.modules.sys.service.impl;

import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.jzkj.modules.sys.dao.SysMenuDao;
import com.jzkj.modules.sys.dao.SysRegionDao;
import com.jzkj.modules.sys.entity.SysMenuEntity;
import com.jzkj.modules.sys.entity.SysRegionEntity;
import com.jzkj.modules.sys.service.SysRegionService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * Service实现类
 *
 * @author lipengjun
 * @email 939961241@qq.com
 * @date 2017-11-04 11:19:31
 */
@Service("regionService")
public class   SysRegionServiceImpl extends ServiceImpl<SysRegionDao, SysRegionEntity> implements SysRegionService {
    @Autowired
    private SysRegionDao sysRegionDao;

    @Override
    public SysRegionEntity queryObject(Integer id) {
        return sysRegionDao.selectById(id);
    }

    @Override
    public List<SysRegionEntity> queryList(Map<String, Object> map) {
        return sysRegionDao.queryList(map);
    }

    @Override
    public int queryTotal(Map<String, Object> map) {
        return 0;
    }

    @Override
    public int save(SysRegionEntity region) {
        return sysRegionDao.insertAllColumn(region);
    }

    @Override
    public int update(SysRegionEntity region) {
        return sysRegionDao.updateById(region);
    }

    @Override
    public int delete(Integer id) {
       return sysRegionDao.deleteById(id);
    }

    @Override
    public int deleteBatch(Integer[] ids) {
        //return sysRegionDao.(ids);
        return sysRegionDao.deleteById(ids);
    }
}
