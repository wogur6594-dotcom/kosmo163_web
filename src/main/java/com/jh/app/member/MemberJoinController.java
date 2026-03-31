package com.jh.app.member;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Servlet implementation class MemberJoinController
 */
@WebServlet("/mem/join")
public class MemberJoinController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public MemberJoinController() {
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
		RequestDispatcher view = request.getRequestDispatcher("/WEB-INF/views/mem/join.jsp");
		view.forward(request, response);

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		String id = request.getParameter("memberId");
		String pw = request.getParameter("memberPw");
		String name = request.getParameter("memberName");
		String email = request.getParameter("memberEmail");

		MemberDTO memberDTO = new MemberDTO();
		memberDTO.setMemberId(id);
		memberDTO.setMemberPw(pw);
		memberDTO.setMemberName(name);
		memberDTO.setMemberEmail(email);

		MemberDAO memberDAO = new MemberDAO();

		try {
			int result = memberDAO.join(memberDTO);
			if (result > 0) {
				response.sendRedirect("/mem/join");

			} else {
				RequestDispatcher view = request.getRequestDispatcher("/WEB-INF/views/mem/join.jsp");
				view.forward(request, response);
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();

		}

	}
}
