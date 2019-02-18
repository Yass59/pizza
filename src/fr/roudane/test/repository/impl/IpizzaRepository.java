package fr.roudane.test.repository.impl;

import java.util.ArrayList;

import fr.roudane.test.bean.PizzaClass;



public interface IpizzaRepository {

	
	
	
	
	
	
	public ArrayList<PizzaClass> findAllpizza();
	
	
	
	public PizzaClass getOnePizza (int id);
	
	

	public boolean ajouterPizza(

			int numero,
			String photo,
			String libelle,
			String reference,
			int prix,
			String description
);
	
	
	
	
	public boolean modifierpizza (
			
			int id,
			int numero,
			String photo,
			String libelle,
			String reference,
			int prix,
			String description
			
			
			
			);
	
	
	public void supprimerPizza(int id);
	
	
	
	
	
	
	
}
