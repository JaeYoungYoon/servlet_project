package servlet_project.jy.command;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import servlet_project.jy.dao.MemberDAO;
import servlet_project.jy.vo.MemberVO;

public class SViewCommand implements SCommand {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) {
		String custno = request.getParameter("custno");
	
		MemberDAO dao = new MemberDAO();
		MemberVO vo = dao.view(custno);
		
		request.setAttribute("board", vo);
	}

}
