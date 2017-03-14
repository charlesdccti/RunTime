package com.lincolnluiz.exception;

import java.util.List;

public class ApiError {

	private Integer status;
	private List<String> message;
	
	public Integer getStatus() {
		return status;
	}
	public void setStatus(Integer status) {
		this.status = status;
	}
	public List<String> getMessage() {
		return message;
	}
	public void setMessage(List<String> message) {
		this.message = message;
	}
	
}
