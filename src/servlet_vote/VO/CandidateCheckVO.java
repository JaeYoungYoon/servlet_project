//�ĺ���ȸ

package servlet_vote.VO;

public class CandidateCheckVO {
	private int cno;//�ĺ���ȣ
	private String cname;//����
	private String party;//�Ҽ�����
	private String level;//�з�
	private String regino;//�ֹι�ȣ
	private String resident;//������
	private int keyno;//��ǥ��ȭ

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
