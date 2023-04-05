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
import servlet_project.jy.vo.MoneyVO;

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

			String query = "SELECT custno, custname, phone, address, TO_CHAR(joindate,'YYYY-MM-DD') joindate, DECODE(grade,'A','VIP','B','일반','직원') grade, city FROM member_tbl_02 ORDER BY custno";

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
	public List<MoneyVO> showMoney() {
		List<MoneyVO> boards = new ArrayList<MoneyVO>();

		Connection connection = null;
		PreparedStatement preparedStatement = null;
		ResultSet resultSet = null;

		try {

			String query = "SELECT A.CUSTNO, A.CUSTNAME, A.GRADE, SUM(B.PRICE) AS TOTAL FROM MEMBER_TBL_02 A JOIN MONEY_TBL_02 B ON A.CUSTNO = B.CUSTNO GROUP BY(A.CUSTNO, A.CUSTNAME, A.GRADE) ORDER BY TOTAL DESC";

			connection = dataSource.getConnection();
			preparedStatement = connection.prepareStatement(query);
			resultSet = preparedStatement.executeQuery();

			while (resultSet.next()) {

				int custno = resultSet.getInt("custno");
				int salenol = resultSet.getInt("salenol");
				int pcost = resultSet.getInt("pcost");
				int amount = resultSet.getInt("amount");
				int price = resultSet.getInt("price");
				String pcode = resultSet.getString("pcode");
				Timestamp sdate = resultSet.getTimestamp("sdate");

				MoneyVO vo = new MoneyVO(custno, salenol, pcost, amount, price, pcode, sdate);
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

}
