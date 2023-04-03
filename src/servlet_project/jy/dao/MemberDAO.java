package servlet_project.jy.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

import servlet_project.jy.vo.MemberVO;

public class MemberDAO {
	private DataSource dataSource;

	/* Constructor Initialize */
	public MemberDAO() {
		try {
			Context context = new InitialContext();
			dataSource = (DataSource) context.lookup("java:comp/env/jdbc/oracle");

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	/* Board List */
	public List<MemberVO> list() {
		List<MemberVO> boards = new ArrayList<MemberVO>();

		Connection connection = null;
		PreparedStatement preparedStatement = null;
		ResultSet resultSet = null;

		try {

			String query = "select * from member_tbl_02";

			connection = dataSource.getConnection();
			preparedStatement = connection.prepareStatement(query);
			resultSet = preparedStatement.executeQuery();

			while (resultSet.next()) {
	
				int custno = resultSet.getInt("custno");
				String custname = resultSet.getString("custname");
				String phone = resultSet.getString("phone");
				String address = resultSet.getString("address");
				Timestamp joindate = resultSet.getTimestamp("joindate");
				String grade = resultSet.getString("grade");
				String city = resultSet.getString("city");
				
				
				MemberVO vo = new MemberVO(custno, custname, phone, address, joindate, grade, city);
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

			} catch (Exception e) {
				e.printStackTrace();
			}

		}

		return boards;
	}
	
	
	
}
