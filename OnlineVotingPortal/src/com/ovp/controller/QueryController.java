package com.ovp.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ovp.utilities.Mailer;

/**
 * Servlet implementation class QueryController
 */
@WebServlet("/QueryController")
public class QueryController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public QueryController() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String name = request.getParameter("name");
		System.out.println("helloooo");
		String email = request.getParameter("email");
		String subject = request.getParameter("subject");
		String message = request.getParameter("message");

		if (email != null && message != null) {
			System.out.println("fasfaf");
			String msg1 = "Name :" + name + "\nEmail : " + email + "\nSubject :" + subject + "\nQuery : " + message;
			Mailer.send("onlinevotinghelpdesk@gmail.com", "User Query", msg1);
			Mailer.send(email, "Online Voting Portal Reply", "Thank you for your query we will reply you soon");
			RequestDispatcher rd = request.getRequestDispatcher("IndexController");
			rd.forward(request, response);
		} else {
			RequestDispatcher rd = request.getRequestDispatcher("jsp/Index.jsp");
			rd.forward(request, response);
		}
	}

}
