//<�닾�몴�븯湲�>
package servlet_project.hb.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

public class VoteDAO {
	private DataSource dataSource;

	public VoteDAO() {   
	      try {
	         Context context = new InitialContext();
	         dataSource = (DataSource) context.lookup("java:comp/env/jdbc/oracle");
	      } catch (Exception e) {
	         e.printStackTrace();
	      }
	   }

	public int list(String v_jumin, String v_name, String m_no, String v_time, String v_area, String v_confirm) {

		Connection connection = null;
		PreparedStatement preparedStatement = null;
		int rn = 0;
		
		try {
			String query = "INSERT INTO TBL_VOTE_202005(V_JUMIN, V_NAME, M_NO, V_TIME, V_AREA, V_CONFIRM) VALUES(?, ?, ?, ?, ?, ?)";

			connection = dataSource.getConnection();
			preparedStatement = connection.prepareStatement(query);

			preparedStatement.setString(1, v_jumin);
			preparedStatement.setString(2, v_name);
			preparedStatement.setString(3, m_no);
			preparedStatement.setString(4, v_time);
			preparedStatement.setString(5, v_area);
			preparedStatement.setString(6, v_confirm);
			
			rn = preparedStatement.executeUpdate();

		} catch (Exception e) {
			e.printStackTrace();
		} finally {

			try {
				if (preparedStatement != null)
					preparedStatement.close();

				if (connection != null)
					connection.close();

			} catch (Exception e2) {
				// TODO: handle exception
				e2.printStackTrace();
			}
		}

		return rn;

	}
}
