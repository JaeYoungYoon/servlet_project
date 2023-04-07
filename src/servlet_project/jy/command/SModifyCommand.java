package servlet_project.jy.command;

import java.sql.Timestamp;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import servlet_project.jy.dao.MemberDAO;
import servlet_project.jy.vo.MemberVO;

public class SModifyCommand implements SCommand{

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) {
		String custno = request.getParameter("custno");
		String custname = request.getParameter("custname");
		String phone = request.getParameter("phone");
		String address = request.getParameter("address");
		String grade = request.getParameter("grade");
		String city = request.getParameter("city");
		
		
		MemberDAO dao = new MemberDAO();
		dao.modify(custno, custname, phone, address, grade, city);
	}

}