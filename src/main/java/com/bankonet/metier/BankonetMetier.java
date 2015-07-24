/**
 * 
 */
package com.bankonet.metier;

import java.util.List;

import javax.annotation.*;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import com.bankonet.dao.IClientDao;
import com.bankonet.model.Client;

/**
 * @author Admin Stoffels
 *
 */
@Service("bankonetmetier") 
@Scope("prototype")
public class BankonetMetier implements IBankonetMetier {

	public IClientDao clientdao;
	
	/**
	 * 
	 */
	public BankonetMetier() {
		// TODO Auto-generated constructor stub
		
	}

	public void addClient(Client c) {
		// TODO Auto-generated method stub
		clientdao.addClient(c);
	}

	public List<Client> listClients() {
		// TODO Auto-generated method stub
		return clientdao.listClients();
	}

	public void deleteClient(int idClient) {
		// TODO Auto-generated method stub
		clientdao.deleteClient(idClient);
	}

	public Client editClient(int idClient) {
		// TODO Auto-generated method stub
		
		return clientdao.editClient(idClient);
	}

	public void updateClient(Client c) {
		// TODO Auto-generated method stub
		clientdao.updateClient(c);
	}

	public List<Client> chercherClients(String motCle) {
		// TODO Auto-generated method stub
		
		return clientdao.chercherClients(motCle);
	}
	
	public List<Client> SupprimerClientDontLeNomContient(String motCle){
		
		for(Client client : clientdao.chercherClients(motCle)){
			clientdao.deleteClient(client.getId());
		}
		return listClients();
		
	}

	/**
	 * @return the clientdao
	 */
	public IClientDao getClientdao() {
		return clientdao;
	}

	/**
	 * @param clientdao the clientdao to set
	 */
	public void setClientdao(IClientDao clientdao) {
		this.clientdao = clientdao;
	}
	
	
}
