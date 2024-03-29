package com.jzkj.modules.sys.dao;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.jzkj.modules.sys.entity.SysConfigEntity;
import com.jzkj.modules.sys.entity.SysSMSConfigEntity;
import org.apache.ibatis.annotations.Param;

/**
 * 系统配置信息
 *
 * @author
 * @email
 * @date 2016年12月4日 下午6:46:16
 */
public interface SysSMSConfigDao extends BaseMapper<SysSMSConfigEntity> {

	/**
	 * 根据key，查询value
	 */
	SysConfigEntity queryByKey(String paramKey);

	/**
	 * 根据key，更新value
	 */
	int updateValueByKey(@Param("paramKey") String paramKey, @Param("paramValue") String paramValue);

}
