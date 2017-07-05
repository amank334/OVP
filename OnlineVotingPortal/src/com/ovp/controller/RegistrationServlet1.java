package com.ovp.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.ovp.daos.VoterDao;
import com.ovp.pojos.Voter;

/**
 * Servlet implementation class RegistrationServlet1
 */
@WebServlet("/RegistrationServlet1")
public class RegistrationServlet1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RegistrationServlet1() {
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
		
		
		String vcardno = request.getParameter("voterVcardNo");
		String adharNo = request.getParameter("voterAdharNo");
		String name = request.getParameter("voterName");
			System.out.println(vcardno);			
		if (vcardno != null && adharNo != null && name != null)
		{
			
			request.setAttribute("voterVcardNo", vcardno);
			request.setAttribute("voterAdharNo", adharNo);
			request.setAttribute("voterName", name);
			
			RequestDispatcher rd = request.getRequestDispatcher("jsp/VoterRegistration2.jsp");
			rd.forward(request, response);
			
			
			}
			else 
			{
		response.sendRedirect("jsp/VoterRegistration1.jsp");
			}
		}
			
			}
