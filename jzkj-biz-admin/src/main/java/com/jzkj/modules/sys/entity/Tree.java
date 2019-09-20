package com.jzkj.modules.sys.entity;

import lombok.Data;

import java.io.Serializable;
import java.util.List;
/**
 * @author zhangbin
 * @email 13141498695@163.com
 * @date 2019-7-04 11:19:31
 */
@Data
public class Tree<T> implements Serializable {
    private static final long serialVersionUID = 1L;
    /**********iview tree属性**************/
    /**
     * 标题
     */
    private String title;

    /**
     * 是否展开直子节点
     */
    private boolean expand = false;

    /**
     * 禁掉响应
     */
    private boolean disabled = false;
    /**
     * 禁掉 checkbox
     */
    private boolean disableCheckbox = false;
    /**
     * 是否选中子节点
     */
    private boolean selected = false;
    /**
     * 是否勾选(如果勾选，子节点也会全部勾选)
     */
    private boolean checked = false;

    private boolean leaf = false;
    /**
     * ztree属性
     */
    private Boolean open;

    private List<?> list;

    /**
     * 子节点属性数组
     */
    private List<?> children;
    private String value;
    private String label;
}
