package com.jzkj.common.utils;

import java.util.HashMap;
import java.util.Map;

/**
 * 返回数据
 * 
 * @author 
 * @email 
 * @date 
 */
public class ReturnResult extends HashMap<String, Object> {
	private static final long serialVersionUID = 1L;
	
	public ReturnResult() {
		put("code", 0);
		put("msg", "success");
	}

	public static ReturnResult error() {
		return error(500, "未知异常，请联系管理员");
	}
	
	public static ReturnResult error(String msg) {
		return error(500, msg);
	}
	
	public static ReturnResult error(int code, String msg) {
		ReturnResult returnResult = new ReturnResult();
		returnResult.put("code", code);
		returnResult.put("msg", msg);
		return returnResult;
	}
	/*code (integer, optional): 编码：0表示成功，其他值表示失败 ,
	data (object, optional): 响应数据 ,
	msg (string, optional): 消息内容*/
	/**
	 * 相应返回数据集
	 * @param code 指定编码：200表示成功，其他值表示对应状态
	 * @param msg 消息内容
	 * @param map 响应数据json格式返回接口
	 * @return
	 */
	public static ReturnResult ResultData(int code, String msg,Map<String, Object> jsondata) {
		ReturnResult returnResult = new ReturnResult();
		returnResult.put("code", code);		
		returnResult.put("msg", msg);
		returnResult.put("data", jsondata);
		return returnResult;
	}
	public static ReturnResult ok(String msg) {
		ReturnResult returnResult = new ReturnResult();
		returnResult.put("msg", msg);
		return returnResult;
	}
	
	public static ReturnResult ok(Map<String, Object> map) {
		ReturnResult returnResult = new ReturnResult();
		returnResult.putAll(map);
		return returnResult;
	}
	
	public static ReturnResult ok() {
		return new ReturnResult();
	}

	@Override
	public ReturnResult put(String key, Object value) {
		super.put(key, value);
		return this;
	}
}
