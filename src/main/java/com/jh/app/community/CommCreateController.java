package com.jh.app.community;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Servlet implementation class CommCreateController
 */
@WebServlet("/comm/create")
public class CommCreateController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public CommCreateController() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		RequestDispatcher view = request.getRequestDispatcher("/WEB-INF/views/comm/list.jsp");
		view.forward(request, response);

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		String title = request.getParameter("commTitle");
		String name = request.getParameter("commName");
		String contents = request.getParameter("commContents");
		String star = request.getParameter("commStar");

		CommDTO commDTO = new CommDTO();
		commDTO.setCommTitle(title);
		commDTO.setCommName(name);
		commDTO.setCommContents(contents);
		commDTO.setCommStar(Integer.parseInt(star));

		CommDAO commDAO = new CommDAO();

		try {
			int result = commDAO.create(commDTO);
			if (result > 0) {
				response.sendRedirect("/comm/list");

			} else {
				RequestDispatcher view = request.getRequestDispatcher("/WEB-INF/views/comm/list.jsp");
				view.forward(request, response);
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();

		}

	}
}
