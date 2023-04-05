//<후보검수조회>
package servlet_project.hb.command;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import servlet_project.hb.dao.VCcheckDAO;
import servlet_project.hb.dao.VVcheckDAO;
import servlet_project.hb.vo.VCcheckVO;
import servlet_project.hb.vo.VVcheckVO;


public class VVcheckCommand implements VCommand {

	public void execute(HttpServletRequest request, HttpServletResponse response) {
		
		VVcheckDAO dao = new VVcheckDAO(); // Board DAO 호출
	      
	      List<VVcheckVO> vos = dao.list(); // DAO 안의 list()를 호출하여 BoardVO의 List 객체 생성
	      
	      request.setAttribute("boards", vos); // 요청하여 갖고 오기
	   }
}
