package servlet_project.jy.command;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import servlet_project.jy.dao.MemberDAO;

public class SInsertCommand implements SCommand {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) {

		String custname = request.getParameter("custname");
		String phone = request.getParameter("phone");
		String address = request.getParameter("address");
		String grade = request.getParameter("grade");
		String city = request.getParameter("city");

		MemberDAO dao = new MemberDAO();
		dao.insert(custname, phone, address, grade, city);
	}

}
