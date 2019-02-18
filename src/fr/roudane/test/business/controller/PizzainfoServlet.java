package fr.roudane.test.business.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import fr.roudane.test.bean.PizzaClass;
import fr.roudane.test.business.implement.PizzaBusiness;

/**
 * Servlet implementation class PizzainfoServlet
 */
@WebServlet("/PizzainfoServlet")
public class PizzainfoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       PizzaBusiness piz = new PizzaBusiness();
 
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String ID = request.getParameter("id");
		int id = Integer.parseInt(ID);
		
		PizzaClass p = piz.getOnePizza(id);
		
		
		request.setAttribute("pizza", p);
		
		
		
		
		
		
		
		
		
		

		
		this.getServletContext()

		.getRequestDispatcher("/WEB-INF/pages/pizzainfo.jsp")

		.forward(request, response);
		
	}

	
	
	
	
	
	
	
	
	
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
