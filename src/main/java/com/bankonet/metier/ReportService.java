/**
 * 
 */
package com.bankonet.metier;

import com.bankonet.report.IReportGenerator;

/**
 * @author ETY
 *
 */
public class ReportService {
	
	
	private IReportGenerator ireportGenerator = null;
	/**
	 * 
	 */
	public ReportService() {
		// TODO Auto-generated constructor stub
	}
	
	/**
	 * @param ireportgenerator
	 */
	public ReportService(IReportGenerator ireportgenerator) {
		this.ireportGenerator = ireportgenerator;
	}

	/**
	 * appel à la couche technique
	 */
	public void generateDailyReport(){
		ireportGenerator.generate();
	}
	
	
	
	
	/*
	 * 
	 * génération des getters et setters
	 * 
	 * 
	 */
	
	/**
	 * @return the ireportgenerator
	 */
	public IReportGenerator getIreportgenerator() {
		return ireportGenerator;
	}

	/**
	 * @param ireportgenerator the ireportgenerator to set
	 */
	public void setIreportgenerator(IReportGenerator ireportgenerator) {
		this.ireportGenerator = ireportgenerator;
	}

	
	
}
