//<�닾�몴寃��닔議고쉶>
package servlet_project.hb.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

import servlet_project.hb.vo.VVcheckVO;

public class VVcheckDAO {
	private DataSource dataSource;

	public VVcheckDAO() {
		try {
			Context context = new InitialContext();
			dataSource = (DataSource) context.lookup("java:comp/env/jdbc/oracle");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public List<VVcheckVO> list() {
		List<VVcheckVO> boards = new ArrayList<VVcheckVO>();

		Connection connection = null;
		PreparedStatement preparedStatement = null;
		ResultSet resultSet = null;

		try {
			String query = "SELECT V_NAME, TO_CHAR(TO_DATE('19' || SUBSTR(V_JUMIN, 1, 6), 'YYYYMMDD'), 'YYYY\"년\" MM\"월\"DD\"일\"')AS V_BIRTH, '만' || FLOOR((SYSDATE - TO_DATE('19' || SUBSTR(V_JUMIN, 1, 6), 'YYYYMMDD'))/365.25)||'세' AS V_AGE, CASE WHEN SUBSTR(V_JUMIN, 7, 1) = 1 THEN '남' ELSE '여' END AS V_GENDER, TBL_MEMBER_202005.M_NO, SUBSTR(V_TIME,1,2)||':'||SUBSTR(V_TIME,3,2) V_TIME, DECODE(V_CONFIRM,'Y','확인','미확인') V_CONFIRM FROM TBL_VOTE_202005, TBL_MEMBER_202005, TBL_PARTY_202005 WHERE TBL_VOTE_202005.M_NO = TBL_MEMBER_202005.M_NO AND TBL_MEMBER_202005.P_CODE = TBL_PARTY_202005.P_CODE AND V_AREA='제1투표장'";

			connection = dataSource.getConnection();
			preparedStatement = connection.prepareStatement(query);
			resultSet = preparedStatement.executeQuery();

			while (resultSet.next()) {

				String v_name = resultSet.getString("v_name");
				String v_birth = resultSet.getString("v_birth");
				String v_age = resultSet.getString("v_age");
				String v_gender = resultSet.getString("v_gender");
				String m_no = resultSet.getString("m_no");
				String v_time = resultSet.getString("v_time");
				String v_confirm = resultSet.getString("v_confirm");

				VVcheckVO vo = new VVcheckVO(v_name, v_birth, v_age, v_gender, m_no, v_time, v_confirm);
				boards.add(vo);

			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {

			try {
				if (resultSet != null)
					resultSet.close();

				if (preparedStatement != null)
					preparedStatement.close();

				if (connection != null)
					connection.close();

			} catch (Exception e2) {
				// TODO: handle exception
				e2.printStackTrace();
			}
		}

		return boards;

	}
}
