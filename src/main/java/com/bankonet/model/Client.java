/**
 * 
 */
package com.bankonet.model;

import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author ETY
 *
 */
public class Client extends Personne {

	/**
	 * @param id
	 * @param nom
	 * @param prenom
	 */
	

	/**
	 * 
	 */
	String login;
	String motDePasse;

	@Autowired
	private Adresse adresse;

	/*
	 * 
	 * Génération des constructeurs
	 * 
	 */

	/**
	 * 
	 */
	public Client() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param ids
	 * @param nom
	 * @param prenom
	 */
	public Client(int id, String nom, String prenom,String login, String motDePasse, Adresse adresse) {
		super(id, nom, prenom);
		this.login=login;
		this.motDePasse=motDePasse;
		this.adresse=adresse;
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param adresse
	 */
	public Client(Adresse adresse) {
		super();
		this.adresse = adresse;
	}

	/*
	 * Méthodes
	 * (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "id : "+this.getId() + " ; " +" nom : "+this.getNom()+" ; "+ " Prenom : "+ this.getPrenom()+" ; "+" adresse : "+this.getAdresse()+" ; "+" a comme login :" + this.getLogin() ;
	}

	/*
	 * 
	 * Génération des getters/setters
	 * 
	 */
	
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

	/**
	 * @return the login
	 */
	public String getLogin() {
		return login;
	}

	/**
	 * @param login the login to set
	 */
	public void setLogin(String login) {
		this.login = login;
	}

	/**
	 * @return the motDePasse
	 */
	public String getMotDePasse() {
		return motDePasse;
	}

	/**
	 * @param motDePasse the motDePasse to set
	 */
	public void setMotDePasse(String motDePasse) {
		this.motDePasse = motDePasse;
	}
}
