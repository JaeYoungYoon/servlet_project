package edu.global.board.vo;

import java.sql.Timestamp;



public class GuestVO {
	private String c_no;
	private String c_name;
	private String phone;
	private String address;
	private String grade;

	public GuestVO() {}
	
	public GuestVO(String c_no,String c_name,String phone,String address,
	String grade) {
		this.c_no = c_no;
		this.c_name = c_name;
		this.phone = phone;
		this.address=address;
		this.grade=grade;
	}

	public String getc_no() {
		return c_no;
	}

	public void setc_no(String c_no) {
		this.c_no = c_no;
	}
//-----------------
	public String getc_name() {
		return c_name;
	}

	public void setc_name(String c_name) {
		this.c_name= c_name;
	}
//----------------
	public String getphone() {
		return phone;
	}

	public void setphone(String phone) {
		this.phone = phone;
	}
//------------------
	public String getaddress() {
		return address;
	}

	public void setaddress(String baddress) {
		this.address = address;
	}
//----------------
	public String getgrade() {
		return grade;
	}

	public void setgrade(String grade) {
		this.grade = grade;
	}
//----------------


	
}
