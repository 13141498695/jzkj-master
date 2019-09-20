package com.jzkj.modules.shop.service.impl;

import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.jzkj.modules.shop.dao.FeedbackDao;
import com.jzkj.modules.shop.entity.FeedbackEntity;
import com.jzkj.modules.shop.service.FeedbackService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;


/**
 * Service实现类
 *
 * @author lipengjun
 * @email 939961241@qq.com
 * @date 2017-08-23 15:03:25
 */
@Service("feedbackService")
public class FeedbackServiceImpl  extends ServiceImpl<FeedbackDao, FeedbackEntity> implements FeedbackService {
    @Autowired
    private FeedbackDao feedbackDao;

    @Override
    public FeedbackEntity queryObject(Integer msgId) {
        return feedbackDao.queryObject(msgId);
    }

    @Override
    public List<FeedbackEntity> queryList(Map<String, Object> map) {
        return feedbackDao.queryList(map);
    }

    @Override
    public int queryTotal(Map<String, Object> map) {
        return feedbackDao.queryTotal(map);
    }

    @Override
    public int save(FeedbackEntity feedback) {
        return feedbackDao.save(feedback);
    }

    @Override
    public int update(FeedbackEntity feedback) {
        return feedbackDao.updateById(feedback);
    }

    @Override
    public int delete(Integer msgId) {
        return feedbackDao.deleteById(msgId);
    }

    @Override
    public int deleteBatch(Integer[]msgIds) {
        return feedbackDao.deleteBatch(msgIds);
    }
}
