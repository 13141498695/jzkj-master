package com.jzkj.modules.shop.service.impl;


import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.jzkj.modules.shop.dao.TopicDao;
import com.jzkj.modules.shop.entity.TopicEntity;
import com.jzkj.modules.shop.service.TopicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * Service实现类
 *
 * @author lipengjun
 * @email 939961241@qq.com
 * @date 2017-08-20 14:10:08
 */
@Service("topicService")
public class TopicServiceImpl  extends ServiceImpl<TopicDao, TopicEntity> implements TopicService {
    @Autowired
    private TopicDao topicDao;

    @Override
    public TopicEntity queryObject(Integer id) {
        return topicDao.queryObject(id);
    }

    @Override
    public List<TopicEntity> queryList(Map<String, Object> map) {
        return topicDao.queryList(map);
    }

    @Override
    public int queryTotal(Map<String, Object> map) {
        return topicDao.queryTotal(map);
    }

    @Override
    public int save(TopicEntity topic) {
        return topicDao.save(topic);
    }

    @Override
    public int update(TopicEntity topic) {
        return topicDao.updateById(topic);
    }

    @Override
    public int delete(Integer id) {
        return topicDao.deleteById(id);
    }

    @Override
    public int deleteBatch(Integer[] ids) {
        return topicDao.deleteBatch(ids);
    }
}
