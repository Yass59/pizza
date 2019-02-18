package fr.roudane.test.business.controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import fr.roudane.test.bean.PizzaClass;
import fr.roudane.test.business.implement.PizzaBusiness;


/**
 * Servlet implementation class PizzaServlet
 */
@WebServlet("/Pizza")
public class PizzaServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    PizzaBusiness pizzaa = new PizzaBusiness();
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		
ArrayList<PizzaClass>pizza = pizzaa.getpizza();
		
		request.setAttribute("pizza", pizza);
		
		
		
		
		
		

		this.getServletContext()

		.getRequestDispatcher("/WEB-INF/pages/pizza.jsp")

		.forward(request, response);
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
