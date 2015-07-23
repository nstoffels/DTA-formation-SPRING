/**
 * 
 */
package com.bankonet.dao;

import java.util.List;

import org.springframework.stereotype.Component;

import com.bankonet.model.Client;

/**
 * @author Admin Stoffels
 *
 */
@Component("clientdao")
public class ClientDaoImpl implements IClientDao {

	/**
	 * 
	 */
	public ClientDaoImpl() {
		// TODO Auto-generated constructor stub
	}

	/* (non-Javadoc)
	 * @see com.bankonet.dao.IClientDao#addClient(com.bankonet.model.Client)
	 */
	public void addClient(Client c) {
		// TODO Auto-generated method stub
		System.out.println("dans ClientDaoImpl.addClient --> client ajouté !");

	}

	/* (non-Javadoc)
	 * @see com.bankonet.dao.IClientDao#listClients()
	 */
	public List<Client> listClients() {
		// TODO Auto-generated method stub
		System.out.println("dans ClientDaoImpl.List<Client> --> liste client !");
		 
		//connection à la base
		//requête
		//List<Client> listClient = getResult();
		
		return null;//return listClient;
	}

	/* (non-Javadoc)
	 * @see com.bankonet.dao.IClientDao#deleteClient(int)
	 */
	public void deleteClient(int idClient) {
		// TODO Auto-generated method stub
		System.out.println("dans ClientDaoImpl.deleteClient --> client ajouté !");
	}

	/* (non-Javadoc)
	 * @see com.bankonet.dao.IClientDao#editClient(int)
	 */
	public Client editClient(int idClient) {
		// TODO Auto-generated method stub
		System.out.println("dans ClientDaoImpl.editClient --> client édité !");
		return null;
	}

	/* (non-Javadoc)
	 * @see com.bankonet.dao.IClientDao#updateClient(com.bankonet.model.Client)
	 */
	public void updateClient(Client c) {
		// TODO Auto-generated method stub
		System.out.println("dans ClientDaoImpl.updateClient --> client MàJ !");
	}

	/* (non-Javadoc)
	 * @see com.bankonet.dao.IClientDao#chercherClients(java.lang.String)
	 */
	public List<Client> chercherClients(String motCle) {
		// TODO Auto-generated method stub
		System.out.println("dans ClientDaoImpl.updateClient --> client MàJ !");
		return null;
	}

}