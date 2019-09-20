package com.jzkj.service;

import com.jzkj.dao.ApiAddressMapper;
import com.jzkj.entity.AddressVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;


@Service
public class ApiAddressService {
    @Autowired
    private ApiAddressMapper addressDao;


    public AddressVo queryObject(Integer id) {
        return addressDao.selectById(id);
    }


    public List<AddressVo> queryList(Map<String, Object> map) {
        return addressDao.selectByMap(map);
    }


    public int queryTotal(Map<String, Object> map) {
        return  0;
        //addressDao.selectCount(map);
    }


    public void save(AddressVo address) {
        addressDao.insertAllColumn(address);
    }


    public void update(AddressVo address) {
        addressDao.updateById(address);
    }


    public void delete(Integer id) {
        addressDao.deleteById(id);
    }


    public void deleteBatch(Integer[] ids) {
       // addressDao.deleteBatchIds(ids);
    }

}
