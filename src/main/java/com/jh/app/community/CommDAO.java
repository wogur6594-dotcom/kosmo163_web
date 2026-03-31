package com.jh.app.community;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.jh.app.util.DBConnection;

public class CommDAO {
	private DBConnection connection;

	public CommDAO() {
		this.connection = new DBConnection();
	}

	public int update(CommDTO commDTO) throws Exception {
		Connection con = connection.getConnection();
		String sql = """
					UPDATE COMMUNITY
					SET
						COMMUNITY_TITLE=?,
						COMMUNITY_NAME=?,
						COMMUNITY_CONTENTS=?,
						COMMUNITY_STAR=?
						WHERE COMMUNITY_NUM=?

				""";

		PreparedStatement st = con.prepareStatement(sql);
		st.setString(1, commDTO.getCommTitle());
		st.setString(2, commDTO.getCommName());
		st.setString(3, commDTO.getCommContents());
		st.setInt(4, commDTO.getCommStar());
		st.setInt(5, commDTO.getCommNum());

		int result = st.executeUpdate();

		st.close();
		con.close();

		return result;
	}

	public int delete(CommDTO commDTO) throws Exception {
		Connection con = connection.getConnection();

		String sql = "DELETE COMMUNITY WHERE COMMUNITY_NUM=?";

		PreparedStatement st = con.prepareStatement(sql);

		st.setInt(1, commDTO.getCommNum());

		int result = st.executeUpdate();

		st.close();
		con.close();

		return result;

	}

	public int create(CommDTO commDTO) throws Exception {
		Connection con = connection.getConnection();
		String sql = """
				INSERT INTO COMMUNITY_(COMMUNITY_NUM, COMMUNITY_TITLE, COMMUNITY_NAME
				COMMUNITY_CONTENTS, COMMUNITY_TIME, COMMUNITY_STAR)
				VALUES (COMMUNITY_SEQ.NEXTVAL, ?, ?, ?,SYSDATE , ?)

				""";

		PreparedStatement st = con.prepareStatement(sql);

		st.setString(1, commDTO.getCommTitle());
		st.setString(2, commDTO.getCommName());
		st.setString(3, commDTO.getCommContents());
		st.setInt(4, commDTO.getCommStar());

		int result = st.executeUpdate();

		st.close();
		con.close();

		return result;

	}

	public CommDTO detail(int commNum) throws Exception {
		
		Connection con = connection.getConnection();
		
		String sql="SELECT * FROM COMMUNITY WHERE COMMUNITY_NUM=?";
		
		PreparedStatement st = con.prepareStatement(sql);
		
		st.setInt(1, commNum);
		
		ResultSet rs = st.executeQuery();
		CommDTO dto = null;
		
		if (rs.next()) {
			dto = new CommDTO();
			dto.setCommNum(rs.getInt("CommNum"));
			dto.setCommTitle(rs.getString("CommTitle"));
			dto.setCommName(rs.getString("CommName"));
			dto.setCommContents(rs.getString("CommContents"));
			dto.setCommTime(rs.getDate("CommTime"));
			dto.setCommStar(rs.getInt("CommStar"));
			
		}
		
		rs.close();
		st.close();
		con.close();
		
		return dto;
		
		
		
	}

}




















