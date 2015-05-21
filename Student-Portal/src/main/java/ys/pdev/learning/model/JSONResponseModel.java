package ys.pdev.learning.model;

import java.util.Map;

public class JSONResponseModel<T> {
	private T data;
	private String status;
	private Map<String,String> errors;
	
	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}

	public Map<String, String> getErrors() {
		return errors;
	}

	public void setErrors(Map<String, String> errors) {
		this.errors = errors;
	}
	
	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
}	
