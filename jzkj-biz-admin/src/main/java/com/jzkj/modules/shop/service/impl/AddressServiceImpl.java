package com.jzkj.modules.shop.service.impl;


import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.jzkj.modules.shop.dao.AddressDao;
import com.jzkj.modules.shop.entity.AddressEntity;
import com.jzkj.modules.shop.service.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * Service实现类
 *
 * @author lipengjun
 * @email 939961241@qq.com
 * @date 2017-08-16 17:22:46
 */
@Service("addressService")
public class AddressServiceImpl  extends ServiceImpl<AddressDao, AddressEntity> implements AddressService {
    @Autowired
    private AddressDao addressDao;

    @Override
    public AddressEntity queryObject(Integer id) {

        return addressDao.queryObject(id);

    }

    @Override
    public List<AddressEntity> queryList(Map<String, Object> map) {
        List<AddressEntity> list = addressDao.queryList(map);
        if (null != list && list.size() > 0) {
            for (AddressEntity addressEntity : list) {
                //翻译收货地址国家码

            }
        }
        return list;
    }

    @Override
    public int queryTotal(Map<String, Object> map) {

        return addressDao.queryTotal(map);
    }

    @Override
    public int save(AddressEntity address) {

        return addressDao.save(address);
    }

    @Override
    public int update(AddressEntity address) {

        return addressDao.updateById(address);
    }

    @Override
    public int delete(Integer id) {

        return addressDao.deleteById(id);
    }

    @Override
    public int deleteBatch(Integer[] ids) {

        return addressDao.deleteBatch(ids);
    }
}
