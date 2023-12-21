package com.api.gen.dto;

import java.util.Date;

import lombok.Getter;
import lombok.NonNull;
import lombok.Setter;

@Getter
@Setter
public class UserDto {
	
	@NonNull
	private String userId;
	@NonNull
	private String password;
	@NonNull
	private String userName;
	@NonNull
	private Boolean gender;
	@NonNull
	private String phone;
	@NonNull
	private String telCom;
	@NonNull
	private Date birth;

}
