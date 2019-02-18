package fr.roudane.test.business.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import fr.roudane.test.business.implement.PizzaBusiness;

/**
 * Servlet implementation class SupprimerServlet
 */
@WebServlet("/Supprimer")
public class SupprimerServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
     PizzaBusiness pizza = new PizzaBusiness();
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		
		String idString = request.getParameter("id");

		int id = Integer.parseInt(idString);

		pizza.supprimerpizza(id);
		
		response.sendRedirect("Pizza");
		
		
		
		
		
		
		
		
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
