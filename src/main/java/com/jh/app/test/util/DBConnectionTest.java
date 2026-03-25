package com.jh.app.test.util;

import java.sql.Connection;

import com.jh.app.departments.DepartmentDAO;
import com.jh.app.util.DBConnection;

public class DBConnectionTest {

	public static void main(String[] args) {
		DepartmentDAO dao = new DepartmentDAO();
		try {
			dao.list();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}