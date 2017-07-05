package com.ovp.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.ovp.daos.StateAdminDao;
import com.ovp.pojos.StateAdmin;
import com.ovp.utilities.DateUtils;
import com.ovp.utilities.GeneratePassword;
import com.ovp.utilities.GenerateUserId;
import com.ovp.utilities.Mailer;

/**
 * Servlet implementation class AddStateAdminController
 */
@WebServlet("/AddStateAdminController")
public class AddStateAdminController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public AddStateAdminController() {
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

		String adminState = new String();
		String stateAdminEmail = new String();
		if (request.getParameter("slist") != null) {
			adminState = request.getParameter("slist");
		}
	
		if (request.getParameter("stateAdminEmail") != null) {
			stateAdminEmail = request.getParameter("stateAdminEmail");
		}
		System.out.println(stateAdminEmail);
		RequestDispatcher rd = null;
		Mailer.send(stateAdminEmail, "Online Voting Portal ", "Use This Password for Login Your Account : "+ GeneratePassword.generateRandomString());
		StateAdmin sAdmin = new StateAdmin(adminState, GenerateUserId.generateUserId(stateAdminEmail),GeneratePassword.generateRandomString(),stateAdminEmail);
		StateAdminDao sadao = new StateAdminDao();
		sadao.create(sAdmin);
		rd = request.getRequestDispatcher("jsp/HeadEC.jsp");
		rd.forward(request, response);
	}

}
