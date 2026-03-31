package com.jh.app.community;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Servlet implementation class CommUpdateController
 */
@WebServlet("/comm/update")
public class CommUpdateController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CommUpdateController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String num = request.getParameter("commNum");
		int n = Integer.parseInt(num);
		
		CommDAO dao = new CommDAO();
		
		RequestDispatcher view = request.getRequestDispatcher("/WEB-INF/views/comm/update.jsp");
		view.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		CommDTO commDTO = new CommDTO();
		String title = request.getParameter("commTitle");
		String name = request.getParameter("commName");
		String contents = request.getParameter("commContents");
		String s = request.getParameter("commStar");
		int star = Integer.parseInt(s);
		
		commDTO.setCommTitle(title);
		commDTO.setCommName(name);
		commDTO.setCommContents(contents);
		commDTO.setCommStar(star);
		
		CommDAO commDAO = new CommDAO();
		
	}

}
