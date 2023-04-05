package edu.global.board.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

import edu.global.board.vo.ClassVO;
import edu.global.board.vo.GuestVO;
import edu.global.board.vo.TeacherVO;

public class GolfDao {
	private DataSource dataSource;

	/* Constructor Initialize */
	public GolfDao() {
		try {
			Context context = new InitialContext();
			dataSource = (DataSource) context.lookup("java:comp/env/jdbc/oracle1");

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/* Board List */

	public List<ClassVO> BClass() {
		List<ClassVO> boards = new ArrayList<ClassVO>();

		Connection connection = null;
		PreparedStatement preparedStatement = null;
		ResultSet resultSet = null;
		int rn = 0;

		try {

			// String query = "SELECT regist_month FROM TBL_CLASS_202201,SELECT c_no FROM
			// TBL_CLASS_202201"
			// + "SELECT class_area FROM TBL_CLASS_202201,SELECT tuition FROM
			// TBL_CLASS_202201,SELECT teacher_code FROM TBL_CLASS_202201";

			String query = "Select * from TBL_Class_202201";

//			쿼리는 sql에 본따서 나중에 수정하도록

			connection = dataSource.getConnection();
			preparedStatement = connection.prepareStatement(query);
			resultSet = preparedStatement.executeQuery();

			while (resultSet.next()) {

				String regist_month = resultSet.getString("regist_month");
				String c_no = resultSet.getString("c_no");
				String class_area = resultSet.getString("class_area");
				String tuition = resultSet.getString("tuition");
				String teacher_code = resultSet.getString("teacher_code");

				ClassVO vo = new ClassVO(regist_month, c_no, class_area, tuition, teacher_code);
				boards.add(vo);

				System.out.println(vo.getRegist_month());
/*				System.out.println(vo.getc_no());
				System.out.println(vo.getclass_area());
				System.out.println(vo.gettuition());
				System.out.println(vo.getteacher_code());*/
			}

		}

		catch (Exception e) {
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

//	---------------------------------------

	public List<GuestVO> BGuest() {
		List<GuestVO> boards = new ArrayList<GuestVO>();

		Connection connection = null;
		PreparedStatement preparedStatement = null;
		ResultSet resultSet = null;

		try {

			String query = "Select * from TBL_MEMBER_202201";
//			쿼리는 sql에 본따서 나중에 수정하도록

			connection = dataSource.getConnection();
			preparedStatement = connection.prepareStatement(query);
			resultSet = preparedStatement.executeQuery();

			while (resultSet.next()) {

				String c_no = resultSet.getString("c_no");
				String c_name = resultSet.getString("c_name");
				String phone = resultSet.getString("phone");
				String address = resultSet.getString("address");
				String grade = resultSet.getString("grade");

				GuestVO vo = new GuestVO(c_no, c_name, phone, address, grade);
//				System.out.println(vo.getc_no());

//				System.out.println(vo.getc_name());
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

//	----------------------------------
	public List<TeacherVO> BTeacher() {
		List<TeacherVO> boards = new ArrayList<TeacherVO>();

		Connection connection = null;
		PreparedStatement preparedStatement = null;
		ResultSet resultSet = null;
		

		try {

			String query = "select * from TBL_TEACHER_202201";
//			쿼리는 sql에 본따서 나중에 수정하도록

			connection = dataSource.getConnection();
			preparedStatement = connection.prepareStatement(query);
			resultSet = preparedStatement.executeQuery();

			while (resultSet.next()) {

				String teacher_code = resultSet.getString("teacher_code");
				String teacher_name = resultSet.getString("teacher_name");
				String class_name = resultSet.getString("class_name");
				String class_price = resultSet.getString("class_price");
				String teacher_regist_date4 = resultSet.getString("teacher_regist_date4");

				TeacherVO vo = new TeacherVO(teacher_code, teacher_name, class_name, class_price, teacher_regist_date4);
				boards.add(vo);
				
				
				
				  System.out.println(vo.getteacher_code());
				  System.out.println(vo.getteacher_name());
				  System.out.println(vo.getclass_name());
				  System.out.println(vo.getclass_price());
				  System.out.println(vo.getteacher_regist_date4());
				 
				
			}

		} catch (Exception e) {
			e.printStackTrace();
		} 
		finally {
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