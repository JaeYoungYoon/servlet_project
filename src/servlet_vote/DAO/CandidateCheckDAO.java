//후보조회

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
				int cno = rs.getInt("cno");//후보번호
				String cname = rs.getString("cname");//성명
				String party = rs.getString("party");//소속정당
				String level = rs.getString("level");//학력
				String regino = rs.getString("regino");//주민번호
				String resident = rs.getString("resident");//지역구
				int keyno = rs.getInt("keyno");//대표전화

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
