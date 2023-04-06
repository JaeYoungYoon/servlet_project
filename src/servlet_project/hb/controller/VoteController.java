package servlet_project.hb.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import servlet_project.hb.command.VCcheckCommand;
import servlet_project.hb.command.VCommand;
import servlet_project.hb.command.VCrankCommand;
import servlet_project.hb.command.VVcheckCommand;

/**
 * Servlet implementation class VoteController
 */
@WebServlet(urlPatterns = {"/JSP_hb/index.do", "/JSP_hb/VCcheck.do", "/JSP_hb/VVcheck.do", "/JSP_hb/VCrank.do"})
public class VoteController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public VoteController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		actionDo(request,response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		actionDo(request,response);
	}
	private void actionDo(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("actionDo() ..");
		
		request.setCharacterEncoding("UTF-8");
		
		String viewPage = null;
		VCommand command = null;
		
		String uri = request.getRequestURI();
		String contextPath = request.getContextPath();
		String com = uri.substring(contextPath.length());
		
		if(com.contains("index.do")) {
			viewPage = "index.jsp";
		}
		else if(com.contains("VCcheck.do")) {
			command = new VCcheckCommand();
			command.execute(request, response);
			viewPage = "VCcheck.jsp";
		}else if(com.contains("VVcheck.do")) {
			command = new VVcheckCommand();
			command.execute(request, response);
			viewPage = "VVcheck.jsp";
		}
		else if(com.contains("VCrank.do")) {
			command = new VCrankCommand();
			command.execute(request, response);
			viewPage = "VCrank.jsp";
		}
		RequestDispatcher dispatcher = request.getRequestDispatcher(viewPage);
		dispatcher.forward(request, response);
	}
	
}
