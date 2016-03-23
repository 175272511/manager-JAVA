package com.nwtx.manager.common.constant;

/**
 * 基础响应类
 * 
 * @author hawk
 *
 */
public class BasicResponse {

	/**
	 * 返回码
	 */
	protected Integer code;

	/**
	 * 返回描述
	 */
	protected String desc;

	public BasicResponse() {
	}

	public BasicResponse(Integer code, String desc) {
		this.code = code;
		this.desc = desc;
	}

	public Integer getCode() {
		return code;
	}

	public void setCode(Integer code) {
		this.code = code;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

	@Override
	public String toString() {
		return "BasicResponse{" +
				"code=" + code +
				", desc='" + desc + '\'' +
				'}';
	}
}
