//투표검수
package servlet_vote.VO;

public class VoteCheckVO {
	private String cname;// 성명
	private String birth;// 생년월일
	private String age;// 나이
	private String sex;// 성별
	private int cno;// 후보번호
	private String votetime;// 투표시간
	private String votercheck;// 유권자확인

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
