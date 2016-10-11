/**
 * 
 */
package com.airbnb.web.domains;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.stereotype.Component;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

/**
 * @date  : 2016. 10. 11.
 * @author: choi inchul
 * @file  : Member.java
 * @story :
 */
@Component
@Data
public class MemberDTO implements Serializable{
	private static final long serialVersionUID = 1L;
	@Getter @Setter private String id;
	//@Getter @Setter private String mem_id;
	@Getter @Setter private String pw;
	@Getter @Setter private String name;
	@Getter @Setter private String regDate;
	@Getter @Setter private String gender;
	@Getter @Setter private String profileImg;
	@Getter @Setter private String email;
	@Getter @Setter private String birth;
	@Getter @Setter private String phone;
	

	
	
	
	}

