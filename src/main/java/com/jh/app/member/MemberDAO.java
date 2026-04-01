package com.jh.app.member;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import com.jh.app.util.DBConnection;

public class MemberDAO {

	private DBConnection connection;

	public MemberDAO() {
		this.connection = new DBConnection();
	}

	// 회원가입
	public int join(MemberDTO memberDTO) throws Exception {
		Connection con = connection.getConnection();
		String sql = """
					INSERT INTO MEMBER
					VALUES (?, ?, ?, ?)
				""";
		// 미리보내기
		PreparedStatement st = con.prepareStatement(sql);

		st.setString(1, memberDTO.getMemberId());
		st.setString(2, memberDTO.getMemberPw());
		st.setString(3, memberDTO.getMemberName());
		st.setString(4, memberDTO.getMemberEmail());

		int result = st.executeUpdate();

		st.close();
		con.close();

		return result;

	}

	// 로그인
	public MemberDTO login(MemberDTO memberDTO) throws Exception {
		Connection con = connection.getConnection();
		String sql = """
				SELECT * FROM MEMBER
				WHERE MEMBER_ID=? AND MEMBER_PW=?
				""";
		// 미리보내기
		PreparedStatement st = con.prepareStatement(sql);

		st.setString(1, memberDTO.getMemberId());
		st.setString(2, memberDTO.getMemberPw());

		ResultSet rs = st.executeQuery();

		if (rs.next()) {
			memberDTO.setMemberId(rs.getString("MEMBER_ID"));
			memberDTO.setMemberPw(rs.getString("MEMBER_PW"));
			memberDTO.setMemberName(rs.getString("MEMBER_NAME"));
			memberDTO.setMemberEmail(rs.getString("MEMBER_EMAIL"));

			return memberDTO;

		}
		return null;

	}

	public ArrayList<MemberDTO> list() throws Exception {
		Connection con = connection.getConnection();

		String sql = """
				SELECT * FROM MEMBER
				ORDER BY MEMBER_ID ASC
				""";
		PreparedStatement st = con.prepareStatement(sql);
		ResultSet rs = st.executeQuery();
		
		ArrayList<MemberDTO> list = new ArrayList<>();

		while (rs.next()) {
			MemberDTO memberDTO = new MemberDTO();
			
			memberDTO.setMemberId(rs.getString("MEMBER_ID"));
			memberDTO.setMemberPw(rs.getString("MEMBER_PW"));
			memberDTO.setMemberName(rs.getString("MEMBER_NAME"));
			memberDTO.setMemberEmail(rs.getString("MEMBER_EMAIL"));

			list.add(memberDTO);

		}
		rs.close();
		st.close();
		con.close();
		
		return list;

	}

}
