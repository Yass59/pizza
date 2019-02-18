package fr.roudane.test.bean;

public class PizzaClass {

	private int id;
	private int numero;	
	private String photo;
	private String libelle;
	private String reference;
	private int prix;
	private String description;
	public PizzaClass(int id, int numero, String photo, String libelle, String reference, int prix,
			String description) {
		super();
		this.id = id;
		this.numero = numero;
		this.photo = photo;
		this.libelle = libelle;
		this.reference = reference;
		this.prix = prix;
		this.description = description;
	}
	public PizzaClass() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public String getPhoto() {
		return photo;
	}
	public void setPhoto(String photo) {
		this.photo = photo;
	}
	public String getLibelle() {
		return libelle;
	}
	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}
	public String getReference() {
		return reference;
	}
	public void setReference(String reference) {
		this.reference = reference;
	}
	public int getPrix() {
		return prix;
	}
	public void setPrix(int prix) {
		this.prix = prix;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
}
