/**
 * 
 */
package com.bankonet.model;

import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author ETY
 *
 */
public class Client {
	
	/**
	 * 
	 */
	int id;
	String nom;
	String prenom;
	
	@Autowired
	private Adresse adresse;
	
	/**
	 * 
	 */
	public Client() {
		// TODO Auto-generated constructor stub
	}
	
	
	
	/**
	 * @param id
	 * @param nom
	 * @param prenom
	 */
	public Client(int id, String nom, String prenom) {
		this.id = id;
		this.nom = nom;
		this.prenom = prenom;
	}



	/**
	 * @param adresse
	 */
	public Client(Adresse adresse) {
		super();
		this.adresse = adresse;
	}



	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "id : "+this.getId() + " ; " +" nom : "+this.getNom()+" ; "+ " Prenom : "+ this.getPrenom()+" ; "+" adresse : "+this.getAdresse()  ;
	}



	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}



	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}



	/**
	 * @return the nom
	 */
	public String getNom() {
		return nom;
	}



	/**
	 * @param nom the nom to set
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}



	/**
	 * @return the prenom
	 */
	public String getPrenom() {
		return prenom;
	}



	/**
	 * @param prenom the prenom to set
	 */
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}



	/**
	 * @return the adresse
	 */
	public Adresse getAdresse() {
		return adresse;
	}



	/**
	 * @param adresse the adresse to set
	 */
	public void setAdresse(Adresse adresse) {
		this.adresse = adresse;
	}
	
	
}
