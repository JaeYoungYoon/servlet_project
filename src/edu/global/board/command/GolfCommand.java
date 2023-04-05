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
import edu.global.board.vo.GuestVO;
import edu.global.board.vo.TeacherVO;

public class GolfCommand implements GolfComand {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) {

		GolfDao dao = new GolfDao(); // Board DAO ȣ��

		List<ClassVO> cos = dao.BClass(); // DAO ���� list()�� ȣ���Ͽ� BoardVO�� List ��ü ����
		List<GuestVO> gos = dao.BGuest();
		List<TeacherVO> vos = dao.BTeacher();
		
		 request.setAttribute("class", vos);// ��û�Ͽ� ���� ����
		 request.setAttribute("guest",gos);
		 request.setAttribute("teacher", vos);
		 
		 
	}

}