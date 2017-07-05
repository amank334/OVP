package com.ovp.controller;

import java.io.File;
import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.servlet.http.Part;

import com.ovp.daos.PartyDao;


/**
 * Servlet implementation class UploadServlet
 */
@WebServlet("/UploadServlet")
@MultipartConfig(fileSizeThreshold = 1024 * 1024 * 2, // 2MB
		maxFileSize = 1024 * 1024 * 10, // 10MB
		maxRequestSize = 1024 * 1024 * 50) // 50MB
public class UploadServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private static final String SAVE_DIR = "InstitutionProfile";

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public UploadServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doPost(request,response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// gets absolute path of the web application
		//String appPath = request.getServletContext().getRealPath("");
		// constructs path of the directory to save uploaded file
		String appPath = "C:\\Users\\AMAN\\workspace1\\OnlineVotingPortal\\WebContent";
		String savePath = appPath + File.separator + SAVE_DIR;
		System.out.println("Path : " + savePath);
		// creates the save directory if it does not exists
		File fileSaveDir = new File(savePath);
		if (!fileSaveDir.exists()) {
			fileSaveDir.mkdir();
		}
		String fileName = new String();
		for (Part part : request.getParts()) {
			fileName = extractFileName(part);
			part.write(savePath + File.separator + fileName);
		}
		String path = appPath + File.separator + SAVE_DIR + File.separator + fileName;
		System.out.println(path);
		HttpSession session = request.getSession();
		PartyDao.renam((String) session.getAttribute("PartyName"),fileName);
		RequestDispatcher rd = request.getRequestDispatcher("AddPartyController");
		rd.forward(request, response);
		//request.setAttribute("message", "Upload has been done successfully!");
		//getServletContext().getRequestDispatcher("/UploadResult.jsp").forward(request, response);
	}

	/**
	 * Extracts file name from HTTP header content-disposition
	 */
	private String extractFileName(Part part) {
		String contentDisp = part.getHeader("content-disposition");
		String[] items = contentDisp.split(";");
		for (String s : items) {
			if (s.trim().startsWith("filename")) {
				return s.substring(s.indexOf("=") + 2, s.length() - 1);
			}
		}
		return "";
	}

}
