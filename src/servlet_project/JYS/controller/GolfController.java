package servlet_project.JYS.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import servlet_project.JYS.command.ClassCommand;

import servlet_project.JYS.command.GolfComand;
import servlet_project.JYS.command.GolfCommand;
import servlet_project.JYS.command.TeacherCommand;
import servlet_project.JYS.command.GuestCommand;

/**
 * Servlet implementation class BoardController
 */
@WebServlet(urlPatterns = { "/JYS/list.do", "/JYS/teacher.do", "/JYS/guest.do", "/JYS/class.do" })
public class GolfController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public GolfController() {
		super();

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

		System.out.println("uri:" + uri);
		System.out.println("contextPath:" + contextPath);
		System.out.println("com:" + com);

		if (com.contains("list.do")) {
			System.out.println("uri:" + uri);
			System.out.println("contextPath:" + contextPath);
			System.out.println("com:" + com);
			command = new GolfCommand();
			command.execute(request, response);
			viewPage = "MainGolf2.jsp";

		} else if (com.contains("teacher.do")) {
			System.out.println("uri:" + uri);
			System.out.println("contextPath:" + contextPath);
			System.out.println("com:" + com);
			command = new TeacherCommand();
			command.execute(request, response);
			viewPage = "Teacher.jsp";

		} else if (com.contains("guest.do")) {
			System.out.println("uri:" + uri);
			System.out.println("contextPath:" + contextPath);
			System.out.println("com:" + com);
			command = new GuestCommand();
			command.execute(request, response);
			viewPage = "Guest.jsp";

		} else if (com.contains("class.do")) {
			System.out.println("uri:" + uri);
			System.out.println("contextPath:" + contextPath);
			System.out.println("com:" + com);
			command = new ClassCommand();
			command.execute(request, response);
			viewPage = "class_view.jsp";
		}

		RequestDispatcher dispatcher = request.getRequestDispatcher(viewPage);
		dispatcher.forward(request, response);

	}
}
