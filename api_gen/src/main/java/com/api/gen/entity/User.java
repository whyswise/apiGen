package com.api.gen.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;

import java.time.LocalDateTime;
import java.util.Date;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import jakarta.persistence.Column;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Builder
public class User {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	@Column(length = 100, name = "user_id")
	private String userId;
	
	@Column(length = 100)
	private String password;
	
	@Column(length = 100, name = "user_name")
	private String userName;
	
	private Boolean gender;
	
	@Column(length = 100)
	private String phone;
	
	@Column(length = 2, name = "tel_com")
	private String telCom;

	@Temporal(TemporalType.DATE)
	private Date birth;
	
	@Column(length = 32, nullable = true)
	private String token;
	
	@Column(name = "created_at")
	@Temporal(TemporalType.TIMESTAMP)
	@CreationTimestamp
	private LocalDateTime createdAt;

	@Column(name = "updated_at")
	@Temporal(TemporalType.TIMESTAMP)
	@UpdateTimestamp
	private LocalDateTime updateAt;

}
