package servlet_project.jy.command;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import servlet_project.jy.dao.MemberDAO;
import servlet_project.jy.vo.MemberVO;

public class SListCommand implements SCommand {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) {

		MemberDAO dao = new MemberDAO();
		List<MemberVO> vos = dao.list();
		request.setAttribute("boards", vos);
	}

}
