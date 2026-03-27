package com.jh.app.countries;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import com.jh.app.util.DBConnection;

public class CountryDAO {
	private DBConnection connection;

	public CountryDAO() {
		this.connection = new DBConnection();
	}

	public int delete(CountryDTO countryDTO) throws Exception {
		Connection con = connection.getConnection();

		String sql = "DELETE COUNTRIES WHERE COUNTRY_ID=?";
		PreparedStatement st = con.prepareStatement(sql);// 미리보내기

		st.setString(1, countryDTO.getCountryId());

		int result = st.executeUpdate();

		st.close();
		con.close();

		return result;
	}

	public int create(CountryDTO countryDTO) throws Exception {
		Connection con = connection.getConnection();
		String sql = """
				INSERT INTO COUNTRIES (COUNTRY_ID, COUNTRY_NAME, REGION_ID)
				VALUES (?, ?, COUNTIRES_SEQ.NEXTVAL)
				""";
		PreparedStatement st = con.prepareStatement(sql);

		st.setString(1, countryDTO.getCountryName());
		st.setString(2, countryDTO.getCountryId());
		st.setInt(3, countryDTO.getRegionId());

		int result = st.executeUpdate();

		st.close();
		con.close();

		return result;

	}

	public CountryDTO detail(String countryId) throws Exception {

		Connection con = connection.getConnection();

		String sql = "SELECT * FROM COUNTRIES WHERE COUNTRY_ID =?";

		PreparedStatement st = con.prepareStatement(sql);

		// ? 세팅
		st.setString(1, countryId);

		ResultSet rs = st.executeQuery();
		CountryDTO dto = null;
		if (rs.next()) {
			dto = new CountryDTO();
			dto.setCountryId(rs.getString("COUNTRY_ID"));
			dto.setCountryName(rs.getString("COUNTRY_NAME"));
			dto.setRegionId(rs.getInt("REGION_ID"));

		}

		rs.close();
		st.close();
		con.close();

		return dto;

	}

	public ArrayList<CountryDTO> list() throws Exception {
		// 1. DB연결

		Connection con = connection.getConnection();

		// 2. 쿼리문 작성
		String sql = """
				SELECT * FROM COUNTRIES
				ORDER BY COUNTRY_ID DESC
				""";

		// 3. 쿼리문 미리 전송
		PreparedStatement st = con.prepareStatement(sql);

		// 4. ?값을 세팅

		// 5. 최종전송 및 결과처리
		ResultSet rs = st.executeQuery();
		ArrayList<CountryDTO> ar = new ArrayList<>();
		while (rs.next()) {
			CountryDTO dto = new CountryDTO();
			String name = rs.getString("COUNTRY_NAME");
			String id = rs.getString("COUNTRY_ID");
			int rid = rs.getInt("REGION_ID");

			dto.setCountryName(name);
			dto.setCountryId(id);
			dto.setRegionId(rid);

			ar.add(dto);

		}

		// 6. 연결 해제
		rs.close();
		st.close();
		con.close();

		return ar;

	}

}