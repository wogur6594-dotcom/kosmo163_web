package com.jh.app.test.countries;

import java.sql.PreparedStatement;

import com.jh.app.countries.CountriesDAO;


public class CountryTest {

	public static void main(String[] args) {

		CountriesDAO dao = new CountriesDAO();
		try {
			dao.detail();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}