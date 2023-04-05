package edu.global.board.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import edu.global.board.command.ClassCommand;
import edu.global.board.command.GolfComand;
import edu.global.board.command.GolfCommand;
import edu.global.board.command.TeacherCommand;
import edu.global.board.command.GuestCommand;

/**
 * Servlet implementation class BoardController
 */
@WebServlet("*.do")
public class GolfController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public GolfController() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		actionDo(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		actionDo(request, response);
	}

	protected void actionDo(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		System.out.println("actionDo() ..");

		request.setCharacterEncoding("UTF-8");

		String viewPage = null;
		GolfComand command = null;

		String uri = request.getRequestURI();
		String contextPath = request.getContextPath();
		String com = uri.substring(contextPath.length());

//		sevlet_his_board/list.do ��Ĺ�̶�� ���������� �����ʰ� �̷� ������� ������ �����ش�.
//		contextPath:/sevlet_hjs_board
//		com:/list.do

		System.out.println("uri:" + uri);
		System.out.println("contextPath:" + contextPath);
		System.out.println("com:" + com);

		if (com.contains("/list.do")) {
			System.out.println("uri:" + uri);
			System.out.println("contextPath:" + contextPath);
			System.out.println("com:" + com);
			command = new GolfCommand();
			command.execute(request, response);
			viewPage = "/JYS/MainGolf2.jsp";

		} else if (com.contains("/Teacher.do")) {
			System.out.println("uri:" + uri);
			System.out.println("contextPath:" + contextPath);
			System.out.println("com:" + com);
			command = new TeacherCommand();
			command.execute(request, response);
			viewPage = "/JYS/Teacher.jsp";

		} else if (com.contains("/Guest.do")) {
			System.out.println("uri:" + uri);
			System.out.println("contextPath:" + contextPath);
			System.out.println("com:" + com);
			command = new GuestCommand();
			command.execute(request, response);
			viewPage = "/JYS/Guest.jsp";

		} else if (com.contains("/Class.do")) {
			System.out.println("uri:" + uri);
			System.out.println("contextPath:" + contextPath);
			System.out.println("com:" + com);
			command = new ClassCommand();
			command.execute(request, response);
			viewPage = "/JYS/class_view.jsp";

		}

		RequestDispatcher dispatcher = request.getRequestDispatcher(viewPage);
		dispatcher.forward(request, response);

	}
}
