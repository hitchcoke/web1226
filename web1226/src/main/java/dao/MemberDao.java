package dao;

import vo.Member;
import java.sql.*;

public class MemberDao {
	public int insertMember(String memberId, String memberPw, String memberName, Connection conn)throws Exception {
		
		String sql = "INSERT INTO member(member_id, member_pw, member_name, createdate) values (?, PASSWORD(?), ?, curdate());";
				
		PreparedStatement stmt = conn.prepareStatement(sql);
		stmt.setString(1, memberId);
		stmt.setString(2, memberPw);
		stmt.setString(3, memberName);
		
		int result=stmt.executeUpdate();
		
		stmt.close();
		
		return result;
	}
	
	public Member selectMemberById(Connection conn, Member paramMember )throws Exception {
		Member member= new Member();
		
		String sql="SELECT * FROM member WHERE member_id= ? AND member_pw= PASSWORD(?) ";
		PreparedStatement stmt= conn.prepareStatement(sql);
		stmt.setString(1, paramMember.getMemberId());
		stmt.setString(2, paramMember.getMemberPw());
		
		ResultSet rs = stmt.executeQuery();
		
		if(rs.next()) {
			member.setMemberId(rs.getString("member_id"));
			member.setMemberName(rs.getString("member_name"));
			member.setCreatedate(rs.getString("createdate"));
		
		}
		rs.close();
		stmt.close();
		
		return member;
	}
}
