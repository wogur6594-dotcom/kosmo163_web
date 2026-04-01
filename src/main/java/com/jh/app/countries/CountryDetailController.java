package com.jh.app.countries;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/country/detail")
public class CountryDetailController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public CountryDetailController() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		CountryDAO countryDAO = new CountryDAO();
		
		String name = request.getParameter("countryName");

		try {
			CountryDTO countryDTO = countryDAO.detail(name);
			request.setAttribute("dto", countryDTO);

		} catch (Exception e) {
			e.printStackTrace();
		}

		RequestDispatcher view = request.getRequestDispatcher("/WEB-INF/views/country/list.jsp");
		view.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}
}