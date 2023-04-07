package servlet_project.JYS.command;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import servlet_project.JYS.dao.GolfDao;
import servlet_project.JYS.vo.ClassVO;

public class ClassCommand implements GolfComand {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) {

		GolfDao dao = new GolfDao();
		List<ClassVO> vos = dao.BClass();
		request.setAttribute("boards", vos);

	}
}