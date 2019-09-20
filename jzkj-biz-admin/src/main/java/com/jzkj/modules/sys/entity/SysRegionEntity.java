package com.jzkj.modules.sys.entity;

import lombok.Data;

/**
 * @author zhangbin
 * @email 13141498695@163.com
 * @date 2019-7-04 11:19:31
 */
@Data
public class SysRegionEntity extends Tree<SysRegionEntity> {

    //主键
    private Integer id;
    //父节点
    private Integer parentId;
    //区域名称
    private String name;
    //类型 0国家 1省份 2地市 3区县
    private Integer type;
    //区域代理Id
    private Integer agencyId;

    /**
     * 翻译用字段
     */
    //父级名称
    private String parentName;


}
