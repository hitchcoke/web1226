package controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import service.MemberService;

/**
 * Servlet implementation class InsertMemberAction
 */
@WebServlet("/InsertMemberAction")
public class InsertMemberAction extends HttpServlet {
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		request.setCharacterEncoding("utf-8");
		String memberId = request.getParameter("memberId");
		String memberPw = request.getParameter("memberPw");
		String memberName = request.getParameter("memberName");
		
		MemberService memberservice = new MemberService();
		
		int result=memberservice.signIn(memberId, memberPw, memberName);
		
		if(result==0) {
			response.sendRedirect(request.getContextPath()+"/insertMemberForm");
			return;
		}else {
			response.sendRedirect(request.getContextPath()+"/LoginFormController");
			
		}
		
		
	}

}
