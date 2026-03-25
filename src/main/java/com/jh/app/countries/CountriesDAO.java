package com.jh.app.countries;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.jh.app.util.DBConnection;

public class CountriesDAO {

	public void detail() throws Exception {
		DBConnection connection = new DBConnection();
		Connection con = connection.getConnection();

		String sql = "SELECT * FROM COUNTRIES WHERE COUNTRY_ID='US'";

		PreparedStatement st = con.prepareStatement(sql);

		ResultSet rs = st.executeQuery();

		if (rs.next()) {
			String name = rs.getNString("CONTRY_NAME");
			System.out.println(name);
		} else {
			System.out.println("없음");
		}
	}

	public void list() throws Exception {

		// 기존 DBConnection 그대로 사용
		DBConnection connection = new DBConnection();
		Connection con = connection.getConnection();

		String sql = "SELECT * FROM COUNTRIES";

		PreparedStatement st = con.prepareStatement(sql);

		ResultSet rs = st.executeQuery();

		while (rs.next()) {
			String id = rs.getString("COUNTRY_ID");
			String name = rs.getString("COUNTRY_NAME");

			System.out.println(id + " : " + name);
		}

		rs.close();
		st.close();
		con.close();
	}
}