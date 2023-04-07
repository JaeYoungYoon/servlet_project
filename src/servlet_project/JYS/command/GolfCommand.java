package servlet_project.JYS.command;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import servlet_project.JYS.dao.GolfDao;

import servlet_project.JYS.vo.ClassVO;
import servlet_project.JYS.vo.GuestVO;
import servlet_project.JYS.vo.TeacherVO;

public class GolfCommand implements GolfComand {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) {

		GolfDao dao = new GolfDao();

		List<ClassVO> cos = dao.BClass();
		List<GuestVO> gos = dao.BGuest();
		List<TeacherVO> vos = dao.BTeacher();

		request.setAttribute("class", cos);
		request.setAttribute("guest", gos);
		request.setAttribute("teacher", vos);

	}

}