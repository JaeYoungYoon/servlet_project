package servlet_project.hb.command;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public interface VCommand {
	public abstract void execute(HttpServletRequest request, HttpServletResponse response);
}
