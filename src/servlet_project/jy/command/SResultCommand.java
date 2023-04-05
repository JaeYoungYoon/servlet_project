package servlet_project.jy.command;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import servlet_project.jy.dao.MemberDAO;
import servlet_project.jy.vo.MemberPriceVO;
import servlet_project.jy.vo.MoneyVO;

public class SResultCommand implements SCommand{

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) {

		MemberDAO dao = new MemberDAO();
		List<MemberPriceVO> vos = dao.showMoney();
		request.setAttribute("boards", vos);
	
	}

}
