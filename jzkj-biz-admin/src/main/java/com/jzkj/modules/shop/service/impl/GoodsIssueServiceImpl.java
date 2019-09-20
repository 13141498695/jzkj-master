package com.jzkj.modules.shop.service.impl;


import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.jzkj.modules.shop.dao.GoodsIssueDao;
import com.jzkj.modules.shop.entity.GoodsIssueEntity;
import com.jzkj.modules.shop.service.GoodsIssueService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * Service实现类
 *
 * @author lipengjun
 * @email 939961241@qq.com
 * @date 2017-08-23 14:12:34
 */
@Service("goodsIssueService")
public class GoodsIssueServiceImpl  extends ServiceImpl<GoodsIssueDao, GoodsIssueEntity> implements GoodsIssueService {
    @Autowired
    private GoodsIssueDao goodsIssueDao;

    @Override
    public GoodsIssueEntity queryObject(Integer id) {
        return goodsIssueDao.queryObject(id);
    }

    @Override
    public List<GoodsIssueEntity> queryList(Map<String, Object> map) {
        return goodsIssueDao.queryList(map);
    }

    @Override
    public int queryTotal(Map<String, Object> map) {
        return goodsIssueDao.queryTotal(map);
    }

    @Override
    public int save(GoodsIssueEntity goodsIssue) {
        return goodsIssueDao.save(goodsIssue);
    }

    @Override
    public int update(GoodsIssueEntity goodsIssue) {
        return goodsIssueDao.updateById(goodsIssue);
    }

    @Override
    public int delete(Integer id) {
        return goodsIssueDao.deleteById(id);
    }

    @Override
    public int deleteBatch(Integer[] ids) {
        return goodsIssueDao.deleteBatch(ids);
    }
}
