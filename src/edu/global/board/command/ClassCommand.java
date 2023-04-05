package edu.global.board.command;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import edu.global.board.dao.GolfDao;
import edu.global.board.vo.ClassVO;

public class ClassCommand implements GolfComand {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) {

		GolfDao dao = new GolfDao();
		List<ClassVO> vos = dao.BClass();
		request.setAttribute("classes", vos);

	}
}