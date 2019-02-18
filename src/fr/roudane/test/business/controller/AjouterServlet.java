package fr.roudane.test.business.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import fr.roudane.test.business.implement.PizzaBusiness;


@WebServlet("/AjouterPizza")
public class AjouterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	 PizzaBusiness piza = new PizzaBusiness();
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		

		
		this.getServletContext()

		.getRequestDispatcher("/WEB-INF/pages/ajouterpizza.jsp")

		.forward(request, response);
		
		
	}

	
	 
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		 
		
		
		

		

		String numeroString = request.getParameter("numero");

		int numero = Integer.parseInt(numeroString);

		String photo = request.getParameter("photo");
		String libelle = request.getParameter("libelle");
		String reference = request.getParameter("reference");
		String description = request.getParameter("description");
		String prixString = request.getParameter("prix");
		int prix = Integer.parseInt(prixString);


		if(
				photo.equals("")
				|| libelle.equals("")
				|| reference.equals("")
				|| description.equals("")
				|| prixString.equals("")
				|| numeroString.equals("")

				)
		{ response.sendRedirect("AjouterPizza");
			return;
		}
			


			boolean ok =	piza.ajouterpizza(numero, photo, libelle, reference, prix, description);

		if (ok) {


			response.sendRedirect("Pizza");
		} 
		else {
			response.sendRedirect("AjouterPizza");

		}




	}
}
