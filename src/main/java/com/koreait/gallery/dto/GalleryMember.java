package com.koreait.gallery.dto;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class GalleryMember {
	private int no;
	private String id;
	private String pw;
	private String name;
	private String phone;
	private String addr;
	private String email;
	private Date regDate;
	private int status;
}
