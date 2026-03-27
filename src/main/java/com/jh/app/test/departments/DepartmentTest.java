package com.jh.app.test.departments;

import com.jh.app.departments.DepartmentDAO;
import com.jh.app.departments.DepartmentDTO;

public class DepartmentTest {

	public static void main(String[] args) {

		DepartmentDAO dao = new DepartmentDAO();
		try {
			DepartmentDTO departmentDTO = new DepartmentDTO();
			departmentDTO.setDepartmentName("class3");
			departmentDTO.setManagerId(null);
			departmentDTO.setLocationId(null);

			dao.create(departmentDTO);

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}