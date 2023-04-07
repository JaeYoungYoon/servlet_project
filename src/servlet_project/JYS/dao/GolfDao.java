package servlet_project.JYS.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

import servlet_project.JYS.vo.ClassVO;
import servlet_project.JYS.vo.GuestVO;
import servlet_project.JYS.vo.TeacherVO;

public class GolfDao {
	private DataSource dataSource;

	/* Constructor Initialize */
	public GolfDao() {
		try {
			Context context = new InitialContext();
			dataSource = (DataSource) context.lookup("java:comp/env/jdbc/oracle");

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

		try {

			String query = "select DISTINCT tbl_teacher_202201.teacher_code,class_name,teacher_name,tuition  "
					+ "from TBL_class_202201,tbl_teacher_202201 "
					+ "where tbl_class_202201.teacher_code=tbl_teacher_202201.teacher_code"
					+ " ORDER by tbl_teacher_202201.teacher_code asc";

			connection = dataSource.getConnection();
			preparedStatement = connection.prepareStatement(query);
			resultSet = preparedStatement.executeQuery();

			while (resultSet.next()) {

				String teacher_code = resultSet.getString("teacher_code");
				String class_name = resultSet.getString("class_name");
				String teacher_name = resultSet.getString("teacher_name");
				String tuition = resultSet.getString("tuition");

				ClassVO vo = new ClassVO(teacher_code, class_name, teacher_name, tuition);
				boards.add(vo);

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

			String query = "select regist_month,tbl_member_202201.c_no,c_name,class_name,class_area,tuition,grade from tbl_member_202201,tbl_class_202201,tbl_teacher_202201 where tbl_class_202201.teacher_code=tbl_teacher_202201.teacher_code and tbl_class_202201.c_no=tbl_member_202201.c_no";

			connection = dataSource.getConnection();
			preparedStatement = connection.prepareStatement(query);
			resultSet = preparedStatement.executeQuery();

			while (resultSet.next()) {

				String regist_month = resultSet.getString("regist_month");
				String c_no = resultSet.getString("c_no");
				String c_name = resultSet.getString("c_name");
				String class_name = resultSet.getString("class_name");
				String class_area = resultSet.getString("class_area");
				String tuition = resultSet.getString("tuition");
				String grade = resultSet.getString("grade");

				GuestVO vo = new GuestVO(regist_month, c_no, c_name, class_name, class_area, tuition, grade);

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

			String query = "select TEACHER_CODE,TEACHER_NAME,CLASS_NAME,CLASS_PRICE,TEACHER_REGIST_DATE4 FROM TBL_TEACHER_202201";

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