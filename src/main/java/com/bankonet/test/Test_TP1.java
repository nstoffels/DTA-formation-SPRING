/**
 * 
 */
package com.bankonet.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.bankonet.metier.ReportService;
import com.bankonet.model.Adresse;
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
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		ReportService reportservice = (ReportService) context.getBean("reportservice");
		reportservice.generateDailyReport();
		
		ReportService reportservice1 = (ReportService) context.getBean("reportservice");
		ReportService reportservice2 = (ReportService) context.getBean("reportservice");
		
		reportservice1.setAuteur("toto");
		reportservice2.setAuteur("tata");
		reportservice1.generateMonthlyReport();
		reportservice2.generateMonthlyReport();
		
		Adresse adresse = (Adresse) context.getBean("adresse");
		Client client = (Client) context.getBean("client");
		System.out.println(""+client.toString()+" \\n" + "\n" + adresse.toString());
	}

}
