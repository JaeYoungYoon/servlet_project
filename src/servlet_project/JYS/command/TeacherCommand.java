package servlet_project.JYS.command;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import servlet_project.JYS.dao.GolfDao;
import servlet_project.JYS.vo.TeacherVO;

public class TeacherCommand implements GolfComand {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) {

		GolfDao dao = new GolfDao();
		List<TeacherVO> vos = dao.BTeacher();
		request.setAttribute("teachers", vos);
	}
}