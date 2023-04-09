package servlet_project.jy.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

import servlet_project.jy.vo.MemberPriceVO;
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

			String query = "SELECT custno, custname, phone, address, TO_CHAR(joindate,'YYYY-MM-DD') joindate, DECODE(grade,'A','VIP','B','老馆','流盔') grade, city FROM member_tbl_02 ORDER BY custno";

			connection = dataSource.getConnection();
			preparedStatement = connection.prepareStatement(query);
			resultSet = preparedStatement.executeQuery();

			while (resultSet.next()) {

				int custno = resultSet.getInt("custno");
				String custname = resultSet.getString("custname");
				String phone = resultSet.getString("phone");
				String address = resultSet.getString("address");
				String joindate = resultSet.getString("joindate");
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

	/* Show Money */
	public List<MemberPriceVO> showMoney() {
		List<MemberPriceVO> boards = new ArrayList<MemberPriceVO>();

		Connection connection = null;
		PreparedStatement preparedStatement = null;
		ResultSet resultSet = null;

		try {

			String query = "SELECT mem.custno, mem.custname, mem.grade, sum(mon.price) price FROM member_tbl_02 mem, money_tbl_02 mon WHERE mem.custno = mon.custno GROUP BY mem.custno, mem.custname, mem.grade ORDER BY price DESC";

			connection = dataSource.getConnection();
			preparedStatement = connection.prepareStatement(query);
			resultSet = preparedStatement.executeQuery();

			while (resultSet.next()) {

				int custno = resultSet.getInt("custno");
				String custname = resultSet.getString("custname");
				String grade = resultSet.getString("grade");
				if (grade.equals("A")) {
					grade = "VIP";
				} else if (grade.equals("B")) {
					grade = "老馆";
				} else if (grade.equals("C")) {
					grade = "流盔";
				}
				int price = resultSet.getInt("price");

				MemberPriceVO vo = new MemberPriceVO(custno, custname, grade, price);
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

	/* Member Insert */
	public int insert(String custname, String phone, String address, String grade, String city) {

		Connection connection = null;
		PreparedStatement preparedStatement = null;
		int rn = 0;

		try {
			String query = "INSERT INTO member_tbl_02 VALUES(membernum_seq.nextval,?,?,?,TO_DATE(SYSDATE,'YYYY-MM-DD'),?,?)";

			connection = dataSource.getConnection();
			preparedStatement = connection.prepareStatement(query);

			preparedStatement.setString(1, custname);
			preparedStatement.setString(2, phone);
			preparedStatement.setString(3, address);
			preparedStatement.setString(4, grade);
			preparedStatement.setString(5, city);

			rn = preparedStatement.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {

				if (preparedStatement != null)
					preparedStatement.close();
				if (connection != null)
					connection.close();

			} catch (Exception e) {
				e.printStackTrace();
			}

		}
		return rn;
	}

	/* modify view */
	public MemberVO view(String strno) {
		MemberVO member = null;

		Connection connection = null;
		PreparedStatement preparedStatement = null;
		ResultSet resultSet = null;

		try {

			String query = "select * from member_tbl_02 where custno = ?";

			connection = dataSource.getConnection();
			preparedStatement = connection.prepareStatement(query);
			preparedStatement.setInt(1, Integer.valueOf(strno));
			resultSet = preparedStatement.executeQuery();

			while (resultSet.next()) {
				int custno = resultSet.getInt("custno");
				String custname = resultSet.getString("custname");
				String phone = resultSet.getString("phone");
				String address = resultSet.getString("address");
				String joindate = resultSet.getString("joindate");
				String grade = resultSet.getString("grade");
				String city = resultSet.getString("city");

				member = new MemberVO(custno, custname, phone, address, joindate, grade, city);

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

		return member;
	}

	/* modify */
	public int modify(String custno, String custname, String phone, String address, String grade, String city) {
		Connection connection = null;
		PreparedStatement preparedStatement = null;
		int rn = 0;

		try {
			String query = "UPDATE member_tbl_02 set custname=?, phone=?, address=?, grade=?, city=? where custno=?";

			connection = dataSource.getConnection();
			preparedStatement = connection.prepareStatement(query);

			preparedStatement.setString(1, custname);
			preparedStatement.setString(2, phone);
			preparedStatement.setString(3, address);
			preparedStatement.setString(4, grade);
			preparedStatement.setString(5, city);
			preparedStatement.setInt(6, Integer.valueOf(custno));

			rn = preparedStatement.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {

				if (preparedStatement != null)
					preparedStatement.close();
				if (connection != null)
					connection.close();

			} catch (Exception e) {
				e.printStackTrace();
			}

		}
		return rn;

	}

}
