//��ǥ�˼�
package servlet_vote.VO;

public class VoteCheckVO {
	private String cname;// ����
	private String birth;// �������
	private String age;// ����
	private String sex;// ����
	private int cno;// �ĺ���ȣ
	private String votetime;// ��ǥ�ð�
	private String votercheck;// ������Ȯ��

	public VoteCheckVO() {

	}

	public VoteCheckVO(String cname, String birth, String age, String sex, int cno, String votetime,
			String votercheck) {
		super();
		this.cname = cname;
		this.birth = birth;
		this.age = age;
		this.sex = sex;
		this.cno = cno;
		this.votetime = votetime;
		this.votercheck = votercheck;
	}

	public String getCname() {
		return cname;
	}

	public void setCname(String cname) {
		this.cname = cname;
	}

	public String getBirth() {
		return birth;
	}

	public void setBirth(String birth) {
		this.birth = birth;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public int getCno() {
		return cno;
	}

	public void setCno(int cno) {
		this.cno = cno;
	}

	public String getVotetime() {
		return votetime;
	}

	public void setVotetime(String votetime) {
		this.votetime = votetime;
	}

	public String getVotercheck() {
		return votercheck;
	}

	public void setVotercheck(String votercheck) {
		this.votercheck = votercheck;
	}

}
