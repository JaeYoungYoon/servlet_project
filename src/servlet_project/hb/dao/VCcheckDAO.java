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

public class VCcheckDAO {
	private DataSource dataSource;

	public VCcheckDAO() {   
	      try {
	         Context context = new InitialContext();
	         dataSource = (DataSource) context.lookup("java:comp/env/jdbc/oracle");
	      } catch (Exception e) {
	         e.printStackTrace();
	      }
	   }

	public List<VCcheckVO> list() {
		List<VCcheckVO> boards = new ArrayList<VCcheckVO>();

		Connection connection = null;
		PreparedStatement preparedStatement = null;
		ResultSet resultSet = null;

		try {
			String query = "SELECT TBL_MEMBER_202005.M_NO,M_NAME,TBL_PARTY_202005.P_CODE, DECODE(P_SCHOOL, '1', '고졸', '2', '학사', '3', '석사', '박사')P_SCHOOL ,M_JUMIN,M_CITY,P_TEL1,P_TEL2,P_TEL3 FROM TBL_MEMBER_202005, TBL_PARTY_202005 WHERE TBL_MEMBER_202005.P_CODE = TBL_PARTY_202005.P_CODE";

			connection = dataSource.getConnection();
			preparedStatement = connection.prepareStatement(query);
			resultSet = preparedStatement.executeQuery();

			while (resultSet.next()) {
				
				String m_no = resultSet.getString("m_no");
				String m_name = resultSet.getString("m_name");
				String p_code = resultSet.getString("p_code");
				String p_school = resultSet.getString("p_school");
				String m_jumin = resultSet.getString("m_jumin");
				String m_city = resultSet.getString("m_city");
				String p_tel1 = resultSet.getString("p_tel1");
				String p_tel2 = resultSet.getString("p_tel2");
				String p_tel3 = resultSet.getString("p_tel3");

				VCcheckVO vo = new VCcheckVO(m_no, m_name, p_code, p_school, m_jumin, m_city, p_tel1, p_tel2, p_tel3);
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
