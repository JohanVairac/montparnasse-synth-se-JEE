package com.infotel.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import com.infotel.metier.Stagiaire;
import com.infotel.service.Iservices;
import com.infotel.service.servicesImpl;

/**
 * Servlet implementation class ServletajouterStagiaire
 */
@WebServlet("/ServletajouterStagiaire")
public class ServletajouterStagiaire extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	private Iservices service= new servicesImpl();
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServletajouterStagiaire() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String nom= null;
		String prenom= null;
		int age= 0;
		int id= 0;
		if (request.getParameter("nom")!=null) {
			age=Integer.parseInt(request.getParameter("prenom"));
			nom=request.getParameter("nom");
			prenom=request.getParameter("prenom");
		}
				 
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
