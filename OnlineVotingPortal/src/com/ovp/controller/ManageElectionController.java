package com.ovp.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.ovp.daos.ElectionDao;
import com.ovp.pojos.Election;
import com.ovp.utilities.DateUtils;

/**
 * Servlet implementation class ManageElectionController
 */
@WebServlet("/ManageElectionController")
public class ManageElectionController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ManageElectionController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String electiontype = new String();
		java.util.Date electiondate = new java.util.Date();
		String electionstate = new String();
		if (request.getParameter("electiontype") != null) {
			electiontype = request.getParameter("electiontype");
		}
		if (request.getParameter("electionstate") != null) {
			electionstate = request.getParameter("electionstate");
		}
		if (request.getParameter("electiondate") != null) {
			electiondate = DateUtils.convertDate(request.getParameter("electiondate"));
		}
		RequestDispatcher rd = null;
		HttpSession s = request.getSession();
		String email = new String();
		if(s.getAttribute("userName") != null) {
			email = (String)s.getAttribute("userName");
		}
		Election elec = new Election(electiondate,electiontype,electionstate);
		ElectionDao edao = new ElectionDao();
		edao.create(elec);
		rd = request.getRequestDispatcher("jsp/HeadEC.jsp");
		rd.forward(request, response);
	}

}
