//후보자등수

package servlet_vote.DAO;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

import servlet_vote.VO.CandidateRankVO;

public class CandidateRankDAO {
	private DataSource dataSource;

	public CandidateRankDAO() {
		try {
	          Context context = new InitialContext();
	          dataSource = (DataSource)context.lookup("java:comp/env/jdbc/oracle");
	       } catch (Exception e) {
	          e.printStackTrace();
	       }
	}

	public List<CandidateRankVO> deptSelect() {
		List<CandidateRankVO> vos = new ArrayList<CandidateRankVO>();

		Connection con = null;
		Statement stmt = null;
		ResultSet rs = null;

		try {
			String sql = "select * from CandidateRank";
			// con = DriverManager.getConnection(url, uid, upw);
			con = dataSource.getConnection();
			stmt = con.createStatement();
			rs = stmt.executeQuery(sql);

			while (rs.next()) {
				int cno = rs.getInt("cno");
				String cname = rs.getString("cname");
				int total = rs.getInt("total");

				CandidateRankVO vo = new CandidateRankVO(cno, cname, total);
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
