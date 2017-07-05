package com.ovp.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.ovp.daos.PartyDao;
import com.ovp.daos.StateAdminDao;
import com.ovp.pojos.Party;
import com.ovp.pojos.StateAdmin;
import com.ovp.utilities.GeneratePassword;
import com.ovp.utilities.GenerateUserId;
import com.ovp.utilities.Mailer;


/**
 * Servlet implementation class AddPartyController
 */
@WebServlet("/AddPartyController")
public class AddPartyController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public AddPartyController() {
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

		String partyName = new String();
		String partyDetails = new String();
		String partyEmail = new String();
	//	String partySymbol = new String();
		if (request.getParameter("partyName") != null) {
			partyName = request.getParameter("partyName");
		}
		if (request.getParameter("partyEmail") != null) {
			partyName = request.getParameter("partyEmail");
		}
//		if (request.getParameter("partySymbol") != null) {
//			partySymbol = request.getParameter("partySymbol");
//		}
		if (request.getParameter("partyDetails") != null) {
			partyDetails = request.getParameter("partyDetails");
		}
		RequestDispatcher rd = null;
//		HttpSession s = request.getSession();
//		String email = new String();
//		if (s.getAttribute("userName") != null) {
//			email = (String) s.getAttribute("userName");
//		}
		
		Party  part= new Party(partyName,GenerateUserId.generateUserId(partyName) , GeneratePassword.generateRandomString(),partyEmail);
		Mailer.send(partyEmail, "Online Voting Portal ", "Use This Password for Login Your Account : " + GeneratePassword.generateRandomString());
		PartyDao pdao = new PartyDao();
		pdao.create(part);
		rd = request.getRequestDispatcher("jsp/HeadEC.jsp");
		rd.forward(request, response);
	}
}
