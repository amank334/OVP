package com.ovp.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.ovp.daos.MainAdminDao;
import com.ovp.daos.StateAdminDao;


/**
 * Servlet implementation class AdminLoginController
 */
@WebServlet("/AdminLoginController")
public class AdminLoginController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public AdminLoginController() {
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
		String userName = new String();
		String password = new String();
		String userType = new String();

		userType = request.getParameter("usertype");
		userName = request.getParameter("username");
		password = request.getParameter("password");

		RequestDispatcher rd = null;
		if (userType != null) {
			if (userName != null && password != null && userType.equals("mainadmin")) {
				int adminId = MainAdminDao.verify(userName, password);
				if (adminId != -1) {
					HttpSession session = request.getSession();
					session.setAttribute("adminId", adminId);
					session.setAttribute("userName", userName);
					session.setAttribute("password", password);
					response.sendRedirect("ManageElectionController");
				} else {
					if (userName != null && password != null)
						request.setAttribute("msg", "no");
					rd = request.getRequestDispatcher("jsp/Admin.jsp");
					rd.forward(request, response);
				}
			} else if (userName != null && password != null && userType.equals("stateadmin")) {
				int stateAdminId = StateAdminDao.verify(userName, password);
				if (stateAdminId != 0) {
					HttpSession session = request.getSession();
					session.setAttribute("stateAdmin", stateAdminId);
					session.setAttribute("stateAdminUserName", userName);
					session.setAttribute("stateAdminPassword", password);
					response.sendRedirect("DoctorHomeController");
				}
			} else {
				if (userName != null && password != null)
					request.setAttribute("msg", "no");
				rd = request.getRequestDispatcher("jsp/Admin.jsp");
				rd.forward(request, response);
			}

		} else {
			if (userName != null && password != null)
				request.setAttribute("msg", "no");
			rd = request.getRequestDispatcher("jsp/Admin.jsp");
			rd.forward(request, response);
		}
	}

}
