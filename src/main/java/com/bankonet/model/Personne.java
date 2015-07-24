/**
 * 
 */
package com.bankonet.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.validation.constraints.Size;

/**
 * @author ETY
 *
 */
@Entity
@Inheritance(strategy=InheritanceType.SINGLE_TABLE)
public class Personne {
	  @Id
	  @GeneratedValue
	  private int ID;
	
	
	int id;
	@Size(min=3, max=60)
	String nom ;
	@Size(min=3, max=60)
	String prenom;
	/**
	 * 
	 */
	public Personne() {
		// TODO Auto-generated constructor stub
	}
	/**
	 * @param id
	 * @param nom
	 * @param prenom
	 */
	public Personne(int id, String nom, String prenom) {
		this.id = id;
		this.nom = nom;
		this.prenom = prenom;
	}




	/**
	 * 
	 * @return
	 */
	public int getId() {
		return id;
	}
	/**
	 * 
	 * @param id
	 */
	public void setId(int id) {
		this.id = id;
	}
	/**
	 * 
	 * @return
	 */
	public String getNom() {
		return nom;
	}
	/**
	 * 
	 * @param nom
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}
	/**
	 * 
	 * @return
	 */
	public String getPrenom() {
		return prenom;
	}
	/**
	 * 
	 * @param prenom
	 */
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	
	
	
	
	

}
