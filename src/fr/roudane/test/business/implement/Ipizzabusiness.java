package fr.roudane.test.business.implement;

import java.util.ArrayList;

import fr.roudane.test.bean.PizzaClass;



public interface Ipizzabusiness {

	
	
	public ArrayList<PizzaClass>getpizza();

	public boolean ajouterpizza(

			int numero,
			String photo,
			String libelle,
			String reference,
			int prix,
			String description
			);


	public PizzaClass getOnePizza (int id);




	public boolean modifierpizza (
			
			int id,
			int numero,
			String photo,
			String libelle,
			String reference,
			int prix,
			String description );
	
	public void supprimerpizza(int id);

}
