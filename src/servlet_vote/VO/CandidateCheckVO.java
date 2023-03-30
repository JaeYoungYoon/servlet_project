//후보조회

package servlet_vote.VO;

public class CandidateCheckVO {
	private int cno;//후보번호
	private String cname;//성명
	private String party;//소속정당
	private String level;//학력
	private String regino;//주민번호
	private String resident;//지역구
	private int keyno;//대표전화

	public CandidateCheckVO() {

	}

	public CandidateCheckVO(int cno, String cname, String party, String level, String regino, String resident,
			int keyno) {
		super();
		this.cno = cno;
		this.cname = cname;
		this.party = party;
		this.level = level;
		this.regino = regino;
		this.resident = resident;
		this.keyno = keyno;
	}

	public int getCno() {
		return cno;
	}

	public void setCno(int cno) {
		this.cno = cno;
	}

	public String getCname() {
		return cname;
	}

	public void setCname(String cname) {
		this.cname = cname;
	}

	public String getParty() {
		return party;
	}

	public void setParty(String party) {
		this.party = party;
	}

	public String getLevel() {
		return level;
	}

	public void setLevel(String level) {
		this.level = level;
	}

	public String getRegino() {
		return regino;
	}

	public void setRegino(String regino) {
		this.regino = regino;
	}

	public String getResident() {
		return resident;
	}

	public void setResident(String resident) {
		this.resident = resident;
	}

	public int getKeyno() {
		return keyno;
	}

	public void setKeyno(int keyno) {
		this.keyno = keyno;
	}

}
