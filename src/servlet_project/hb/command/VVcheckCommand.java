
package servlet_project.hb.command;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import servlet_project.hb.dao.VVcheckDAO;

import servlet_project.hb.vo.VVcheckVO;

public class VVcheckCommand implements VCommand {

	public void execute(HttpServletRequest request, HttpServletResponse response) {

		VVcheckDAO dao = new VVcheckDAO();

		List<VVcheckVO> vos = dao.list();

		request.setAttribute("boards", vos);
	}
}
