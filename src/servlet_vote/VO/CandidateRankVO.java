//�ĺ��ڵ��

package servlet_vote.VO;

public class CandidateRankVO {
	private int cno;// �ĺ���ȣ
	private String cname;// ����
	private int total;// ����ǥ�Ǽ�

	public CandidateRankVO() {

	}

	public CandidateRankVO(int cno, String cname, int total) {
		super();
		this.cno = cno;
		this.cname = cname;
		this.total = total;
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

	public int getTotal() {
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
	}

}
