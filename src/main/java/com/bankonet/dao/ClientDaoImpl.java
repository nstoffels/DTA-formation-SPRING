/**
 * 
 */
package com.bankonet.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.bankonet.model.Client;

/**
 * @author Admin Stoffels
 *
 */
@Repository("clientdao")
@Scope("prototype")
public class ClientDaoImpl implements IClientDao {

	/**
	 * 
	 */
	@PersistenceContext
	private EntityManager em;
	
	

	public ClientDaoImpl() {
		// TODO Auto-generated constructor stub
	}

	/* (non-Javadoc)
	 * @see com.bankonet.dao.IClientDao#addClient(com.bankonet.model.Client)
	 */
	@Transactional
	public void addClient(Client c) {
		// TODO Auto-generated method stub
		System.out.println("dans ClientDaoImpl.addClient --> client ajouté !");
		em.persist(c);
		
	}

	/* (non-Javadoc)
	 * @see com.bankonet.dao.IClientDao#listClients()
	 */
	public List<Client> listClients() {
		// TODO Auto-generated method stub
		System.out.println("dans ClientDaoImpl.List<Client> --> liste client !");
		Query req=em.createQuery("select c from Client c");

		return req.getResultList();
	}

	/* (non-Javadoc)
	 * @see com.bankonet.dao.IClientDao#deleteClient(int)
	 */
	@Transactional
	public void deleteClient(int idClient) {
		// TODO Auto-generated method stub
		System.out.println("dans ClientDaoImpl.deleteClient --> client ajouté !");
		Client c=em.find(Client.class, idClient);
		em.remove(c);
		// ou em.remove(idClient);
		
	}

	/* (non-Javadoc)
	 * @see com.bankonet.dao.IClientDao#editClient(int)
	 */
	@Transactional
	public Client editClient(int idClient) {
		// TODO Auto-generated method stub
		System.out.println("dans ClientDaoImpl.editClient --> client édité !");
		Client client=em.find(Client.class, idClient);
		//em.merge(client);
		return client;
	}

	/* (non-Javadoc)
	 * @see com.bankonet.dao.IClientDao#updateClient(com.bankonet.model.Client)
	 */
	@Transactional
	public void updateClient(Client c) {
		// TODO Auto-generated method stub
		System.out.println("dans ClientDaoImpl.updateClient --> client MàJ !");
		//Client client=em.find(Client.class, c);
		em.merge(c);
		
	}

	/* (non-Javadoc)
	 * @see com.bankonet.dao.IClientDao#chercherClients(java.lang.String)
	 */
	public List<Client> chercherClients(String motCle) {
		// TODO Auto-generated method stub
		System.out.println("dans ClientDaoImpl.chercherClient --> client MàJ !");
		Query req=em.createQuery("select c from Client c where c.nom like :x or c.prenom like :x");
		req.setParameter("x", "%"+motCle+"%");
		return req.getResultList();
	}

	/**
	 * @return the em
	 */
	public EntityManager getEm() {
		return em;
	}

	/**
	 * @param em the em to set
	 */
	public void setEm(EntityManager em) {
		this.em = em;
	}
	
	

}
