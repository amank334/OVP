package com.ovp.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ovp.daos.VoterDao;
import com.ovp.pojos.Voter;


/**
 * Servlet implementation class RegistrationServlet2
 */
@WebServlet("/RegistrationServlet2")
public class RegistrationServlet2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RegistrationServlet2() {
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
		String mob = request.getParameter("voterMob");
		String email = request.getParameter("voterEmail");
		String password = request.getParameter("voterPassword");
		String confirm = request.getParameter("confirm");
		String add = request.getParameter("voterAddress");
		
				
		if (vcardno != null && adharNo != null && name != null && password!=null && add!=null && confirm!=null && mob!=null && email!=null)
		{
			
			
			Voter c = new Voter(vcardno,adharNo,name,mob,email,password,add);
			VoterDao cd = new VoterDao();
			cd.create(c);
			response.sendRedirect("jsp/VoterLogin.jsp");
			}
			else 
			{
		response.sendRedirect("jsp/VoterRegistrationForm2.jsp");
			}
		}
			
			}
			
		

	

