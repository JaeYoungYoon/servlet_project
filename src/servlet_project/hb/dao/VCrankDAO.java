//<후보자등수>
package servlet_project.hb.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

import servlet_project.hb.vo.VCcheckVO;
import servlet_project.hb.vo.VCrankVO;
import servlet_project.hb.vo.VVcheckVO;

public class VCrankDAO {
	private DataSource dataSource;

	public VCrankDAO() {   
	      try {
	         Context context = new InitialContext();
	         dataSource = (DataSource) context.lookup("java:comp/env/jdbc/oracle1");
	      } catch (Exception e) {
	         e.printStackTrace();
	      }
	   }

	public List<VCrankVO> list() {
		List<VCrankVO> boards = new ArrayList<VCrankVO>();

		Connection connection = null;
		PreparedStatement preparedStatement = null;
		ResultSet resultSet = null;
		
		try {
			String query = "SELECT V_NAME, 19|| SUBSTR(V_JUMIN,1,2)년도, SUBSTR(V_JUMIN,4,2)월, SUBSTR(V_JUMIN,6,4)일 END AS 생년월일, CASE SUBSTR(V_JUMIN,1,2) WHEN 1 THEN YEAR(GETDATE()) - ((left(V_JUMIN,2) + 1900) ) WHEN 2 THEN YEAR(GETDATE()) - ((left(V_JUMIN,2) + 1900) ) END AS 나이,CASE SUBSTR(V_JUMIN,1,7) WHEN 1 THEN '남', WHEN 2 THEN '여'END AS 성별, TBL_MEMBER_202005.M_NO, V_TIME, V_CONFIRM FROM TBL_VOTE_202005, TBL_MEMBER_202005, TBL_PARTY_202005 WHERE TBL_VOTE_202005.M_NO = TBL_MEMBER_202005.M_NO AND TBL_MEMBER_202005.P_CODE = TBL_PARTY_202005.P_CODE";

			connection = dataSource.getConnection();
			preparedStatement = connection.prepareStatement(query);
			resultSet = preparedStatement.executeQuery();

			while (resultSet.next()) {
				
				
				String m_no = resultSet.getString("m_no");
				String m_name = resultSet.getString("m_name");
				String m_total = resultSet.getString("m_total");
				
				VCrankVO vo = new VCrankVO(m_no, m_name, m_total);
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
