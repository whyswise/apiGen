package com.api.gen.common;

import org.springframework.http.HttpStatus;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter @AllArgsConstructor
public class Message {
	
	private HttpStatus status;
	private String message;
	private Object data;
	
	public Message() {
		this.status = HttpStatus.OK;
		this.message = null;
		this.data = null;
	}

}
