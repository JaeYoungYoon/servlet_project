//<투표검수조회>
package servlet_project.hb.vo;

public class VVcheckVO {
	private String v_name;
	private String v_birth;
	private String v_age;
	private String v_gender;
	private String m_no;
	private String v_time;
	private String v_confirm;
	
	public VVcheckVO() {
		
	}

	public VVcheckVO(String v_name, String v_birth, String v_age, String v_gender, String m_no, String v_time,
			String v_confirm) {
		super();
		this.v_name = v_name;
		this.v_birth = v_birth;
		this.v_age = v_age;
		this.v_gender = v_gender;
		this.m_no = m_no;
		this.v_time = v_time;
		this.v_confirm = v_confirm;
	}

	public String getV_name() {
		return v_name;
	}

	public void setV_name(String v_name) {
		this.v_name = v_name;
	}

	public String getV_birth() {
		return v_birth;
	}

	public void setV_birth(String v_birth) {
		this.v_birth = v_birth;
	}

	public String getV_age() {
		return v_age;
	}

	public void setV_age(String v_age) {
		this.v_age = v_age;
	}

	public String getV_gender() {
		return v_gender;
	}

	public void setV_gender(String v_gender) {
		this.v_gender = v_gender;
	}

	public String getM_no() {
		return m_no;
	}

	public void setM_no(String m_no) {
		this.m_no = m_no;
	}

	public String getV_time() {
		return v_time;
	}

	public void setV_time(String v_time) {
		this.v_time = v_time;
	}

	public String getV_confirm() {
		return v_confirm;
	}

	public void setV_confirm(String v_confirm) {
		this.v_confirm = v_confirm;
	}

	

}