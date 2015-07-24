/**
 * 
 */
package com.bankonet.test;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.bankonet.metier.BankonetMetier;
import com.bankonet.metier.IBankonetMetier;
import com.bankonet.metier.ReportService;
import com.bankonet.model.Client;

/**
 * @author ETY
 *
 */
public class Test_TP1 {

	/**
	 * 
	 */
	public Test_TP1() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		@SuppressWarnings("resource")
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		ReportService reportservice = (ReportService) context.getBean("reportservice");
		reportservice.generateDailyReport();
		
		ReportService reportservice1 = (ReportService) context.getBean("reportservice");
		ReportService reportservice2 = (ReportService) context.getBean("reportservice");
		
		reportservice1.setAuteur("toto");
		reportservice2.setAuteur("tata");
		reportservice1.generateMonthlyReport();
		reportservice2.generateMonthlyReport();
		
		Client client = (Client) context.getBean("client");
		System.out.println(""+client.toString());
		
		IBankonetMetier bankonetMetier = (IBankonetMetier) context.getBean("bankonetmetier");
		List<Client> clients = bankonetMetier.listClients();
		if(clients!=null){
			System.out.println("la liste des clients existe");
			for(Client client1 : clients){
				System.out.println("client1");
			}
		}if(clients.isEmpty()){
			System.out.println("la liste des clients est vide");
		}else{
			System.out.println("la liste des clients n'existe pas");
		}
//		System.out.println(bankonetMetier.listClients());
		
	}

}
