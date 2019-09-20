package com.jzkj.modules.until;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author zhangbin
 * @date 2019-05-10
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ResultCode {

    private int code;
    private Object data;
}
