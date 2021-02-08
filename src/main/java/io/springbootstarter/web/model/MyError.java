package io.springbootstarter.web.model;

import java.util.UUID;

public class MyError {
	
	private UUID code;
	private String msg;
	
	public MyError(UUID code, String msg) {
		super();
		this.code = code;
		this.msg = msg;
	}
	public UUID getCode() {
		return code;
	}
	public void setCode(UUID code) {
		this.code = code;
	}
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
	
	

}
