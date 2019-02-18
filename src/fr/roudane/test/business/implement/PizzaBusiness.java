package fr.roudane.test.business.implement;

import java.util.ArrayList;

import fr.roudane.test.bean.PizzaClass;
import fr.roudane.test.repository.impl.PizzaRepository;



public class PizzaBusiness implements Ipizzabusiness {
	PizzaRepository pizza = new PizzaRepository();
	@Override
	public ArrayList<PizzaClass> getpizza() {
		ArrayList<PizzaClass>liste=pizza.findAllpizza();
		return liste;



	}
	@Override
	public boolean ajouterpizza(int numero, String photo, String libelle, String reference, int prix,
			String description) {

		boolean pi = pizza.ajouterPizza(numero, photo, libelle, reference, prix, description);
		return pi;


	}











	@Override
	public PizzaClass getOnePizza(int id) {

		PizzaClass pizzz = pizza.getOnePizza(id);







		return pizzz;
	}







	@Override
	public boolean modifierpizza(int id, int numero, String photo, String libelle, String reference, int prix,
			String description) {


		boolean m = pizza.modifierpizza(id, numero, photo, libelle, reference, prix, description);
		return m;



	}
	@Override
	public void supprimerpizza(int id) {
		pizza.supprimerPizza(id);

	}











	
	
	
	
	
	
	
	
	
}
