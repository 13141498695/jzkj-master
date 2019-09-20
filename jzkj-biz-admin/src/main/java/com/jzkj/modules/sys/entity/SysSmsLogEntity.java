package com.jzkj.modules.sys.entity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.jzkj.common.annotation.Phone;
import lombok.Data;

import javax.validation.constraints.NotBlank;
import java.io.Serializable;
import java.util.Date;

/**
 * 发送短信日志
 * 表名 sys_sms_log
 *
 * @author lipengjun
 * @email 939961241@qq.com
 * @date 2017-12-16 23:38:05
 */
@Data
@TableName("sys_sms_log")
public class SysSmsLogEntity implements Serializable {
    private static final long serialVersionUID = 1L;

    /**
     * 主键
     */
    private String id;
    /**
     * 操作人
     */
    private Long userId;
    /**
     * 必填参数。发送内容（1-500 个汉字）UTF-8编码
     */
    @NotBlank(message="发送内容不能为空")
    private String content;
    /**
     * 必填参数。手机号码。多个以英文逗号隔开
     */
    @NotBlank(message="手机号不能为空")
    @Phone
    private String mobile;
    /**
     * 可选参数。发送时间，填写时已填写的时间发送，不填时为当前时间发送
     */
      @NotBlank(message="发送内容不能为空")
      @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date stime;
    /**
     * 必填参数。用户签名
     */
    private String sign;
    /**
     * 必填参数。固定值 pt
     */
    private String type;
    /**
     * 可选参数。扩展码，用户定义扩展码，只能为数字
     */
    private String extno;
    /**
     * 1成功 0失败
     */
    private Integer sendStatus;
    /**
     * 发送编号
     */
    private String sendId;
    /**
     * 无效号码数
     */
    private Integer invalidNum;
    /**
     * 成功提交数
     */
    private Integer successNum;
    /**
     * 黑名单数
     */
    private Integer blackNum;
    /**
     * 返回消息
     */
    private String returnMsg;

    //翻译
    /**
     * 操作人
     */
    private String userName;

}
