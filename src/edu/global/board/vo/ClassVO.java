package edu.global.board.vo;

import java.sql.Timestamp;



public class ClassVO {
	private String regist_month;
	private String c_no;
	private String class_area;
	private String tuition;
	private String teacher_code;
	

	public String getRegist_month() {
		return regist_month;
	}

	public void setRegist_month(String regist_month) {
		this.regist_month = regist_month;
	}

	public String getC_no() {
		return c_no;
	}

	public void setC_no(String c_no) {
		this.c_no = c_no;
	}

	public String getClass_area() {
		return class_area;
	}

	public void setClass_area(String class_area) {
		this.class_area = class_area;
	}

	public String getTuition() {
		return tuition;
	}

	public void setTuition(String tuition) {
		this.tuition = tuition;
	}

	public String getTeacher_code() {
		return teacher_code;
	}

	public void setTeacher_code(String teacher_code) {
		this.teacher_code = teacher_code;
	}

	public ClassVO() {}
	
	public ClassVO(String regist_month,String c_no,String class_area,String tuition,
	 String teacher_code) {
		this.regist_month=regist_month;
		this.c_no=c_no;
		this.class_area=class_area;
		this.tuition=tuition;
		this.teacher_code=teacher_code;
	}

	
	/*
	 * public String getRegist_month() { return regist_month; }
	 * 
	 * public void setbregist_month(String regist_month) { this.regist_month =
	 * regist_month; } //----------- public String getc_no() { return c_no; }
	 * 
	 * public void setc_noo(String c_no) { this.c_no = c_no; } //-------------------
	 * public String getclass_area() { return class_area; }
	 * 
	 * public void setclass_area(String class_area) { this.class_area = class_area;
	 * } //----------- public String gettuition() { return tuition; }
	 * 
	 * public void settuition(String tuition) { this.tuition = tuition; }
	 * //------------------- public String getteacher_code() { return teacher_code;
	 * }
	 * 
	 * public void setteacher_code(String teacher_code) { this.teacher_code =
	 * teacher_code; } //-------------------
	 */	
}
