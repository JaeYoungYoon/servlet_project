//투표검수조회
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
				String cname = rs.getString("cname");// 성명
				String birth = rs.getString("birth");// 생년월일
				String age = rs.getString("age");// 나이
				String sex = rs.getString("sex");// 성별
				int cno = rs.getInt("cno");// 후보번호
				String votetime = rs.getString("votetime");// 투표시간
				String votercheck = rs.getString("votercheck");// 유권자확인

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
