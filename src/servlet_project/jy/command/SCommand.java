package servlet_project.jy.command;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public abstract interface SCommand {
	void execute(HttpServletRequest request, HttpServletResponse response);
}
