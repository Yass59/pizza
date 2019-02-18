package fr.roudane.test.repository.impl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import fr.roudane.test.bean.PizzaClass;



public class PizzaRepository implements IpizzaRepository{

	@Override
	public ArrayList<PizzaClass> findAllpizza() {
		
		
		ArrayList<PizzaClass>liste1  = new ArrayList<>();
		try {
			Class.forName("org.mariadb.jdbc.Driver");
			Connection cnx = DriverManager.getConnection("jdbc:mariadb://localhost:3306/pizzeria", "root", "");
					
					
				Statement sm = cnx.createStatement();
				
			
	
					ResultSet resultat =
							sm.executeQuery("select id, numero, photo,libelle, reference, prix, description from pizza");
					
					
					while (resultat.next()) {
					
						int idpizza = resultat.getInt("id");
						
						
						int numeropizza = resultat.getInt("numero");

						String photopizza = resultat.getString("photo");

						String libellepizza = resultat.getString("libelle");

						String referencepizza = resultat.getString("reference");

						int prixpizza = resultat.getInt("prix");
						
						String descriptionpizza = resultat.getString("description");
					
					
					PizzaClass pi = new PizzaClass(idpizza, numeropizza, photopizza, libellepizza, referencepizza, prixpizza, descriptionpizza);
					
					liste1.add(pi);
					}
					
					}catch (Exception e) {
						e.printStackTrace();
					}
					
					
					
					
					
					
					
					
					
					return liste1;
				}

	@Override
	public PizzaClass getOnePizza(int id) {
	
		
		
		

		try {
			Class.forName("org.mariadb.jdbc.Driver");
			Connection cnx = DriverManager.getConnection("jdbc:mariadb://localhost:3306/pizzeria", "root", "");
					
					
				Statement sm = cnx.createStatement();
				
				ResultSet resultat =
						sm.executeQuery("select id, numero, photo, numero, reference, prix, libelle description from pizza where id = " + id);
				
				
				while (resultat.next()) {
				
					
					int numero1 = resultat.getInt("numero");

					String photo1 = resultat.getString("photo");

					String libelle1 = resultat.getString("libelle");

					String reference1 = resultat.getString("reference");

					int prix1 = resultat.getInt("prix");
					
					String description1 = resultat.getString("description");
					
					int id1 = resultat.getInt("id");

		
					
					PizzaClass P = new PizzaClass(id1, numero1, photo1, libelle1, reference1, prix1, description1);

				return P;

					
				}
				
				
				
				
				
		}catch (Exception e) {
			e.printStackTrace();
		}
		
		
		
		
		
		
		
		
		
		return null;
	}

	@Override
	public boolean ajouterPizza(int numero, String photo, String libelle, String reference, int prix,
			String description) {

		
try {
			
			
			Class.forName("org.mariadb.jdbc.Driver");
			Connection cnx = DriverManager.getConnection("jdbc:mariadb://localhost:3306/pizzeria", "root", "");
					
					
			PreparedStatement ps = cnx.prepareStatement("INSERT INTO pizza (numero,photo,libelle,reference,prix,description) VALUES(?,?,?,?,?,?)");
			
				ps.setInt(1, numero);
				ps.setString(2, photo);
				ps.setString(3, libelle);
				ps.setString(4, reference);
				ps.setInt(5, prix);
				ps.setString(6, description);
			
			
			
			ps.executeUpdate();
			
				
				return true;
				
		} catch (Exception e) {
			
			e.printStackTrace();
			return false;
		
			
			
			
			
			
			
			
		
		
	}

		
	}

	@Override
	public boolean modifierpizza(int id, int numero, String photo, String libelle, String reference, int prix,
			String description) {
	
		
		
try {
			
			
			Class.forName("org.mariadb.jdbc.Driver");
			Connection cnx = DriverManager.getConnection("jdbc:mariadb://localhost:3306/pizzeria", "root", "");
					
					
			PreparedStatement ps = cnx.prepareStatement("UPDATE pizza SET numero = ?  ,  photo = ?, libelle = ? , reference = ? , prix = ? , description =  ? WHERE id = ?");
		
		
		
		
			ps.setInt(1, numero);
			ps.setString(2, photo);
			ps.setString(3, libelle);
			ps.setString(4, reference);
			ps.setInt(5, prix);
			ps.setString(6, description);
			ps.setInt(7, id);
		
		
		ps.executeUpdate();
		
		
		
		
		
		return true;
		
} catch (Exception e) {
	
	e.printStackTrace();
	return false;

		
		
		
		
		
		
	
	}
		
		
}

	@Override
	public void supprimerPizza(int id) {

		
try {
			
			
			Class.forName("org.mariadb.jdbc.Driver");
			Connection cnx = DriverManager.getConnection("jdbc:mariadb://localhost:3306/pizzeria", "root", "");
					
					
				Statement sm = cnx.createStatement();
			
			
				
				ResultSet resultat =
						sm.executeQuery("delete from pizza where id = " + id);
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
		
		
	}	
		
		
		
	
				
				
				
				


