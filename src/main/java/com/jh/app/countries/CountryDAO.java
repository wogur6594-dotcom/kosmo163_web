package com.jh.app.countries;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import com.jh.app.departments.DepartmentDTO;
import com.jh.app.util.DBConnection;

public class CountryDAO {
	
	public void detail()throws Exception{
		DBConnection connection = new DBConnection();
		Connection con = connection.getConnection();
		
		String sql = "SELECT * FROM COUNTRIES WHERE COUNTRY_ID='US'";
		
		PreparedStatement st = con.prepareStatement(sql);
		
		ResultSet rs = st.executeQuery();
		
		if(rs.next()) {
			String name = rs.getString("COUNTRY_NAME");
			System.out.println(name);
		}else {
			System.out.println("없다");
		}
		
		rs.close();
		st.close();
		con.close();
	}
	
	
	public ArrayList<CountryDTO> list() throws Exception {
		DBConnection connection = new DBConnection();
		Connection con = connection.getConnection();
		
		String sql = "SELECT * FROM COUNTRIES";
		
		PreparedStatement st = con.prepareStatement(sql);
		
		ResultSet rs = st.executeQuery();
		
		while(rs.next()) {
			CountryDTO dto = new CountryDTO();
			String name = rs.getString("COUNTRY_NAME");
			int id= rs.getInt("COUNTRY_ID");

			
			dto.setCountryName(name);
			dto.setCountryId(id);

			
			ar.add(dto);
			
		}
		
		rs.close();
		st.close();
		con.close();
		
		return ar;
	}

}