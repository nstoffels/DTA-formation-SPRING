/**
 * 
 */
package com.bankonet.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;



/**
 * @author ETY
 *
 */
@Aspect
@Component("logaspect")
public class LogAspect {

	final String cut="(execution(* com.bankonet.dao.*.*(..))||execution(* com.bankonet.metier.*.*(..)))";
	/**
	 * 
	 */
	@Before(cut)
	public void LogBefore() {
		// TODO Auto-generated constructor stub
		System.out.println("----AOP----");
		System.out.println("lancement d'une métode dao ou métier");
	}

}
