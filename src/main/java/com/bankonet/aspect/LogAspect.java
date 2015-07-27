/**
 * 
 */
package com.bankonet.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

import com.mysql.jdbc.log.Log;
import com.mysql.jdbc.log.LogFactory;



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
	public void LogBefore(JoinPoint joinPoint) {
		// TODO Auto-generated constructor stub
		System.out.println("----AOP----");
		System.out.println(" " + joinPoint.getTarget().getClass());
		System.out.println(" "+ joinPoint.getSignature().getName());
		System.out.println(" " + joinPoint.getArgs());
	}

	/**
	 * 
	 */
	public LogAspect() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	

}
