package servlet_project.JYS.vo;

public class TeacherVO {
	private String teacher_code;
	private String teacher_name;
	private String class_name;
	private String class_price;
	private String teacher_regist_date4;

	public TeacherVO() {
	}

	public TeacherVO(String teacher_code, String teacher_name, String class_name, String class_price,
			String teacher_regist_date4) {
		this.teacher_code = teacher_code;
		this.teacher_name = teacher_name;
		this.class_name = class_name;
		this.class_price = class_price;
		this.teacher_regist_date4 = teacher_regist_date4;
	}

	public String getTeacher_code() {
		return teacher_code;
	}

	public void setTeacher_code(String teacher_code) {
		this.teacher_code = teacher_code;
	}

	public String getTeacher_name() {
		return teacher_name;
	}

	public void setTeacher_name(String teacher_name) {
		this.teacher_name = teacher_name;
	}

	public String getClass_name() {
		return class_name;
	}

	public void setClass_name(String class_name) {
		this.class_name = class_name;
	}

	public String getClass_price() {
		return class_price;
	}

	public void setClass_price(String class_price) {
		this.class_price = class_price;
	}

	public String getTeacher_regist_date4() {
		return teacher_regist_date4;
	}

	public void setTeacher_regist_date4(String teacher_regist_date4) {
		this.teacher_regist_date4 = teacher_regist_date4;
	}

}
