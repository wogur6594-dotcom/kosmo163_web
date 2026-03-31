package com.jh.app.member;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;

/**
 * Servlet implementation class MemberLoginController
 */
@WebServlet("/mem/login")
public class MemberLoginController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MemberLoginController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//f, r
		RequestDispatcher view = request.getRequestDispatcher("/WEB-INF/views/mem/login.jsp");
		view.forward(request, response);
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String id= request.getParameter("memberId");
		String pw = request.getParameter("memberPw");

		
		MemberDTO memberDTO = new MemberDTO();
		memberDTO.setMemberId(id);
		memberDTO.setMemberPw(pw);
		
		MemberDAO memberDAO = new MemberDAO();
		try {
			memberDTO = memberDAO.login(memberDTO);
			
			if(memberDTO != null) {
			    System.out.println("ok");
			    
			    HttpSession session = request.getSession();
			    session.setAttribute("dto", memberDTO);
			    
			}else {
			    System.out.println("fail");
			}
			
			
			response.sendRedirect("/home");
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}