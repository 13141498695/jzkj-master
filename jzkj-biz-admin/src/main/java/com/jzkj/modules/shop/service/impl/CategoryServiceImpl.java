package com.jzkj.modules.shop.service.impl;

import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.jzkj.modules.shop.dao.CartDao;
import com.jzkj.modules.shop.dao.CategoryDao;
import com.jzkj.modules.shop.entity.CartEntity;
import com.jzkj.modules.shop.entity.CategoryEntity;
import com.jzkj.modules.shop.service.CategoryService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Map;

/**
 * Service实现类
 *
 * @author lipengjun
 * @email 939961241@qq.com
 * @date 2017-08-21 15:32:31
 */
@Service("categoryService")
public class CategoryServiceImpl extends ServiceImpl<CategoryDao, CategoryEntity> implements CategoryService {
    @Autowired
    private CategoryDao categoryDao;

    @Override
    public CategoryEntity queryObject(Integer id) {
        return categoryDao.queryObject(id);
    }

    @Override
    public List<CategoryEntity> queryList(Map<String, Object> map) {
        return categoryDao.queryList(map);
    }

    @Override
    public int queryTotal(Map<String, Object> map) {
        return categoryDao.queryTotal(map);
    }

    @Override
    public int save(CategoryEntity category) {
        if ("L1".equals(category.getLevel())) {
            category.setParentId(0);
        }
        return categoryDao.insertAllColumn(category);
    }

    @Override
    public int update(CategoryEntity category) {
        if ("L1".equals(category.getLevel())) {
            category.setParentId(0);
        }
        return categoryDao.updateById(category);
    }

    @Override
    public int delete(Integer id) {

        return categoryDao.deleteById(id);
    }

    @Override
    @Transactional
    public int deleteBatch(Integer[] ids) {
      //  categoryDao.deleteByParentBatch(ids);
        return categoryDao.deleteBatch(ids);
    }
}
