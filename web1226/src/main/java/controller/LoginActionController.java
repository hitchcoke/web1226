
package controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import service.MemberService;
import vo.Member;

/**
 * Servlet implementation class LoginController
 */
@WebServlet("/LoginActionController")
public class LoginActionController extends HttpServlet {
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		HttpSession session = request.getSession();
		
		
		String memberId= request.getParameter("memberId");
		String memberPw= request.getParameter("memberPw");
		
		
		MemberService memberService = new MemberService(); 
		Member paramMember = new Member();
		paramMember.setMemberId(memberId);
		paramMember.setMemberPw(memberPw);
		
		Member member= memberService.login(paramMember);
		
		if(member.getMemberId()==null) {
			response.sendRedirect(request.getContextPath()+"/LoginFormController");
			return;
		}
		session.setAttribute("loginMember", member);
		
		response.sendRedirect(request.getContextPath()+"/HomeController");
		
	}

}
