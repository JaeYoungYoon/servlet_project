//<투표하기>
package servlet_project.hb.vo;

public class VoteVO {
	
	private String v_jumin;
	private String v_name;
	private String m_no;//투표번호
	private String v_tiime;
	private String v_area;
	private String v_confirm;
	
	public VoteVO() {
		
	}

	public VoteVO(String v_jumin, String v_name, String m_no, String v_tiime, String v_area, String v_confirm) {
		super();
		this.v_jumin = v_jumin;
		this.v_name = v_name;
		this.m_no = m_no;
		this.v_tiime = v_tiime;
		this.v_area = v_area;
		this.v_confirm = v_confirm;
	}

	public String getV_jumin() {
		return v_jumin;
	}

	public void setV_jumin(String v_jumin) {
		this.v_jumin = v_jumin;
	}

	public String getV_name() {
		return v_name;
	}

	public void setV_name(String v_name) {
		this.v_name = v_name;
	}

	public String getM_no() {
		return m_no;
	}

	public void setM_no(String m_no) {
		this.m_no = m_no;
	}

	public String getV_tiime() {
		return v_tiime;
	}

	public void setV_tiime(String v_tiime) {
		this.v_tiime = v_tiime;
	}

	public String getV_area() {
		return v_area;
	}

	public void setV_area(String v_area) {
		this.v_area = v_area;
	}

	public String getV_confirm() {
		return v_confirm;
	}

	public void setV_confirm(String v_confirm) {
		this.v_confirm = v_confirm;
	}

	
}