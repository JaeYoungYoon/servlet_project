package servlet_project.jy.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import servlet_project.jy.command.SCommand;
import servlet_project.jy.command.SInsertCommand;
import servlet_project.jy.command.SListCommand;
import servlet_project.jy.command.SResultCommand;

/**
 * Servlet implementation class ShoppingController
 */
@WebServlet(urlPatterns = {"/JSP_jy/main.do", "/JSP_jy/list.do", "/JSP_jy/writer_view.do", "/JSP_jy/result.do", "/JSP_jy/insert.do"})
public class ShoppingController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public ShoppingController() {
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

	private void actionDo(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");

		String viewPage = null;
		SCommand command = null;

		String uri = request.getRequestURI();
		String contextPath = request.getContextPath();
		String com = uri.substring(contextPath.length());

		if (com.contains("main.do")) {
			System.out.println("uri : " + uri);
			System.out.println("contextPath : " + contextPath);
			System.out.println("command : " + com);
			viewPage = "main.jsp";
		} else if (com.contains("list.do")) {
			System.out.println("uri : " + uri);
			System.out.println("contextPath : " + contextPath);
			System.out.println("command : " + com);

			command = new SListCommand();
			command.execute(request, response);
			viewPage = "list.jsp";
		} else if (com.contains("writer_view.do")) {
			System.out.println("uri : " + uri);
			System.out.println("contextPath : " + contextPath);
			System.out.println("command : " + com);

			viewPage = "add.jsp";
		} else if (com.contains("result.do")) {
			System.out.println("uri : " + uri);
			System.out.println("contextPath : " + contextPath);
			System.out.println("command : " + com);

			command = new SResultCommand();
			command.execute(request, response);
			viewPage = "result.jsp";
		} else if (com.contains("insert.do")) {
			System.out.println("uri : " + uri);
			System.out.println("contextPath : " + contextPath);
			System.out.println("command : " + com);

			command = new SInsertCommand();
			command.execute(request, response);
			viewPage = "list.do";
		}
		RequestDispatcher dispatcher = request.getRequestDispatcher(viewPage);
		dispatcher.forward(request, response);
	}

}