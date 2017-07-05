package com.ovp.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.ovp.daos.VoterDao;

/**
 * Servlet implementation class VoterLoginController
 */
@WebServlet("/VoterLoginServlet")
public class VoterLoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public VoterLoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doPost(request, response);
		}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		String email = request.getParameter("voterEmail");
		String password = request.getParameter("voterPassword");
		System.out.println(email);
		System.out.println(password);
		
		if (password == null && email == null)
			response.sendRedirect("jsp/VoterLogin.jsp");
		int voterId = VoterDao.verify(email, password);
		System.out.println(voterId);
		if (voterId != -1) {
			HttpSession session = request.getSession();
			session.setAttribute("voterId", new Integer(voterId));
			session.setAttribute("voterEmail", email);
			session.setAttribute("voterPassword", password);
			response.sendRedirect("jsp/Vinpage.jsp");
		} else {
			response.sendRedirect("jsp/VoterLogin.jsp");
		}
	}



		
		
	}


