package com.jh.app.test.departments;

import com.jh.app.departments.DepartmentDAO;

public class DepartmentTest {

	public static void main(String[] args) {
		
		DepartmentDAO dao = new DepartmentDAO();
		try {
			dao.detail(110);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}