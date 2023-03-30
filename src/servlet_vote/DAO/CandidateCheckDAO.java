//�ĺ���ȸ

package servlet_vote.DAO;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

import servlet_vote.VO.CandidateCheckVO;

public class CandidateCheckDAO {

	private DataSource dataSource;

	public CandidateCheckDAO() {
		try {
			Context context = new InitialContext();
			dataSource = (DataSource) context.lookup("java:comp/env/jdbc/oracle");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public List<CandidateCheckVO> deptSelect() {
		List<CandidateCheckVO> vos = new ArrayList<CandidateCheckVO>();

		Connection con = null;
		Statement stmt = null;
		ResultSet rs = null;

		try {
			String sql = "select * from CandidateCheck";

			con = dataSource.getConnection();
			stmt = con.createStatement();
			rs = stmt.executeQuery(sql);

			while (rs.next()) {
				int cno = rs.getInt("cno");//�ĺ���ȣ
				String cname = rs.getString("cname");//����
				String party = rs.getString("party");//�Ҽ�����
				String level = rs.getString("level");//�з�
				String regino = rs.getString("regino");//�ֹι�ȣ
				String resident = rs.getString("resident");//������
				int keyno = rs.getInt("keyno");//��ǥ��ȭ

				CandidateCheckVO vo = new CandidateCheckVO(cno, cname, party, level, regino, resident, keyno);
				vos.add(vo);
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (rs != null)
					rs.close();
				if (stmt != null)
					stmt.close();
				if (con != null)
					con.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return vos;
	}

}
