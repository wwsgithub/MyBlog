package com.example.common.entity;

/**
 * 通用的数据返回格式
 * @author 26046
 *
 */
public class DataResult {

	private Integer code;
	private Boolean isSuccess;
	private String message;
	private Object data;
	
	public Integer getCode() {
		return code;
	}
	public void setCode(Integer code) {
		this.code = code;
	}
	public Boolean getIsSuccess() {
		return isSuccess;
	}
	public void setIsSuccess(Boolean isSuccess) {
		this.isSuccess = isSuccess;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public Object getData() {
		return data;
	}
	public void setData(Object data) {
		this.data = data;
	}
	
	@Override
	public String toString() {
		return "DataResult [code=" + code + ", isSuccess=" + isSuccess + ", message=" + message + ", data=" + data
				+ "]";
	}
}
