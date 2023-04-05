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

public class GuestCommand implements GolfComand{

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) {

		
	    GolfDao dao = new GolfDao();    
	    List<GuestVO> gos =dao.BGuest();
	    request.setAttribute("guests",gos);
	    
	
	}
}