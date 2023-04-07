package servlet_project.hb.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

import servlet_project.hb.vo.VCrankVO;

public class VCrankDAO {
	private DataSource dataSource;

	public VCrankDAO() {
		try {
			Context context = new InitialContext();
			dataSource = (DataSource) context.lookup("java:comp/env/jdbc/oracle");
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
			String query = "SELECT M.M_NO, M.M_NAME, COUNT(*) AS M_TOTAL FROM TBL_MEMBER_202005 M, TBL_VOTE_202005 V WHERE M.M_NO = V.M_NO AND V.V_CONFIRM = 'Y' GROUP BY M.M_NO, M.M_NAME ORDER BY M_TOTAL DESC";

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
