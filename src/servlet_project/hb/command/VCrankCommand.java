
package servlet_project.hb.command;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import servlet_project.hb.dao.VCrankDAO;

import servlet_project.hb.vo.VCrankVO;

public class VCrankCommand implements VCommand {

	public void execute(HttpServletRequest request, HttpServletResponse response) {

		VCrankDAO dao = new VCrankDAO();

		List<VCrankVO> vos = dao.list();

		request.setAttribute("boards", vos);
	}
}
