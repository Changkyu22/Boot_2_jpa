package com.iu.b1.member;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "members")
public class MemberVO {
	
	@Id
	private String id;
	// @Column(name = "password") 테이블과 변수명이 틀릴경우 사용
	private String pw;
	private String name;
	private String email;
	
}
