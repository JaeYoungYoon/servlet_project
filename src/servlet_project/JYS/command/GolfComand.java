package servlet_project.JYS.command;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class BoardController
 */
public interface GolfComand {
	public abstract void execute(HttpServletRequest request, HttpServletResponse response);
}
