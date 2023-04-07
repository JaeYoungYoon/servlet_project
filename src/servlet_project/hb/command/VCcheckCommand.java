package servlet_project.hb.command;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import servlet_project.hb.dao.VCcheckDAO;
import servlet_project.hb.vo.VCcheckVO;

public class VCcheckCommand implements VCommand {

	public void execute(HttpServletRequest request, HttpServletResponse response) {

		VCcheckDAO dao = new VCcheckDAO();

		List<VCcheckVO> vos = dao.list();

		request.setAttribute("boards", vos);
	}
}
