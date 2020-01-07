package com.iu.b1.member;

import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.ForeignKey;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import lombok.Getter;

@Getter
@Setter
@Table(name = "memberFiles")
@Entity
public class MemberFilesVO {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int fnum;
	private String id;
	private String fname;
	private String oname;
	


}
