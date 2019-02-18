package fr.roudane.test.business.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import fr.roudane.test.bean.PizzaClass;
import fr.roudane.test.business.implement.PizzaBusiness;





@WebServlet("/Modifie")
public class ModifieServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
	PizzaBusiness pizzabz = new PizzaBusiness();
	
	
	
	
	
	
	
	
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		String idString = request.getParameter("id");
		int id = Integer.parseInt(idString);
		
		PizzaClass pizza = pizzabz.getOnePizza(id);
		request.setAttribute("pizza", pizza);

		
		this.getServletContext()

		.getRequestDispatcher("/WEB-INF/pages/modifiepizza.jsp")

		.forward(request, response);
		
		
		
		
		
	}

	
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		
		
		
		
		
		String idString = request.getParameter("id");

		int id = Integer.parseInt(idString);


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
		{ response.sendRedirect("Modifie");
			return;
		}
			


			boolean ok =	pizzabz.modifierpizza(id, numero, photo, libelle, reference, prix, description);

		if (ok) {


			response.sendRedirect("PizzainfoServlet?id" + id);
		} 
		else {
			response.sendRedirect("Modifie?id" + id);

		}

		
		
		
		
		
		
		
		
		
		
	}

}
