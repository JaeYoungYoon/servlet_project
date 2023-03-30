//��ǥ�˼���ȸ
package servlet_vote.DAO;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

import servlet_vote.VO.VoteCheckVO;

public class VoteCheckDAO {

	private DataSource dataSource;

	public VoteCheckDAO() {
		try {
			Context context = new InitialContext();
			dataSource = (DataSource) context.lookup("java:comp/env/jdbc/oracle");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public List<VoteCheckVO> deptSelect() {
		List<VoteCheckVO> vos = new ArrayList<VoteCheckVO>();

		Connection con = null;
		Statement stmt = null;
		ResultSet rs = null;

		try {
			String sql = "select * from VoteCheck";
			// con = DriverManager.getConnection(url, uid, upw);
			con = dataSource.getConnection();
			stmt = con.createStatement();
			rs = stmt.executeQuery(sql);

			while (rs.next()) {
				String cname = rs.getString("cname");// ����
				String birth = rs.getString("birth");// �������
				String age = rs.getString("age");// ����
				String sex = rs.getString("sex");// ����
				int cno = rs.getInt("cno");// �ĺ���ȣ
				String votetime = rs.getString("votetime");// ��ǥ�ð�
				String votercheck = rs.getString("votercheck");// ������Ȯ��

				VoteCheckVO vo = new VoteCheckVO(cname, birth, age, sex, cno, votetime, votercheck);
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
