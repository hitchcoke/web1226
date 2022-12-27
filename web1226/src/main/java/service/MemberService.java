package service;

import java.sql.Connection;

import dao.MemberDao;
import util.DB;
import vo.Member;

public class MemberService {
	private MemberDao memberDao;
	private DB db;
		public Member login(Member paramMember) {
			Member member= new Member();
			db = null;
			Connection conn= null;
			memberDao = new MemberDao();
			
			try {
				db=new DB();
				conn=db.getConnection();
				
				member=memberDao.selectMemberById(conn, paramMember);
				
			}catch(Exception e) {
				e.printStackTrace();
			}finally {
				try {
					db.close(null, null, conn);
				}catch(Exception e) {
					e.printStackTrace();
				}
			}
		
		return member;
		}
		
		public int signIn(String memberId, String memberPw, String memberName) {
			int result= 0;
			db= null;
			Connection conn = null;
			memberDao = new MemberDao();
			
			try {
				db=new DB();
				conn=db.getConnection();
				
				result=memberDao.insertMember(memberId, memberPw, memberName, conn);
			}catch(Exception e) {
				e.printStackTrace();
			}finally {
				try {
					db.close(null, null, conn);
				}catch(Exception e) {
					e.printStackTrace();
				}
			}
			
			return result;
		}
}
