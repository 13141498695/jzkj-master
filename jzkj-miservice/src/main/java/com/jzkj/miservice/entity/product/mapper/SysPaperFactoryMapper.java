package com.jzkj.miservice.entity.product.mapper;

import com.jzkj.miservice.entity.SysPaperFactory;
import com.jzkj.miservice.entity.SysPaperFactoryExample;
import java.util.List;

public interface SysPaperFactoryMapper {
    int insert(SysPaperFactory record);

    int insertSelective(SysPaperFactory record);

    List<SysPaperFactory> selectByExample(SysPaperFactoryExample example);
}