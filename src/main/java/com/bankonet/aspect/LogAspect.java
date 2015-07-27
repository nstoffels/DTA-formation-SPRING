/**
 * 
 */
package com.bankonet.aspect;

import java.util.Arrays;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
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
	 * @param joinPoint
	 */
	@Before(cut)
	@Order(0)
	public void LogBefore(JoinPoint joinPoint) {
		// TODO Auto-generated constructor stub
		System.out.println("----AOP----");
		System.out.println("----Before----");
		System.out.println(" La Classe : " + joinPoint.getTarget().getClass());
		System.out.println(" La méthode : "+ joinPoint.getSignature().getName());
		System.out.println(" Les Arguments : " + Arrays.toString(joinPoint.getArgs()));
	}
	
	/**
	 * 
	 * @param joinPoint
	 */
//	@AfterReturning(pointcut=cut)
//	@Order(1)
//	public void logAfter(JoinPoint joinPoint){
//		System.out.println("----AOP----");
//		System.out.println("----AfterReturning----");
//		System.out.println(" La classe : " + joinPoint.getTarget().getClass());
//		System.out.println(" La méthode : "+ joinPoint.getSignature().getName());
//		System.out.println(" Les Arguments : " + Arrays.toString(joinPoint.getArgs()) );
//	}
	
	@AfterReturning(pointcut=cut, returning="result")
	@Order(1)
	public void logAfterDeux(JoinPoint joinPoint, Object result) throws Throwable{
		System.out.println("----AOP----");
		System.out.println("----AfterReturning----");
		System.out.println(" La classe : " + joinPoint.getTarget().getClass());
		System.out.println(" La méthode : "+ joinPoint.getSignature().getName());
		System.out.println(" Les Arguments : " + result);
	}
	
	/**
	 * 
	 * @param joinPoint
	 * @return
	 * @throws Throwable
	 */
	@Around(cut)
	@Order(2)
	public Object logAround(ProceedingJoinPoint joinPoint) throws Throwable {
		System.out.println("----AOP----");
		System.out.println("----Around----");
		System.out.println("La méthode : "+joinPoint.getSignature().getName()+"() de la classe : " + joinPoint.getTarget().getClass() + " invoqué avec : " + Arrays.toString(joinPoint.getArgs()));
		
		try{
			Object result = joinPoint.proceed();
			System.out.println("Méthode " + joinPoint.getSignature().getName() + "() terminée par : " + result);
			return result;
		}catch (IllegalArgumentException e){
			System.out.println("Arguments invalide " + Arrays.toString(joinPoint.getArgs()) + " dans " + joinPoint.getSignature().getName() + "()");
			throw e;
		}
	}

	/**
	 * 
	 */
	public LogAspect() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	private StringBuffer argsBuffer(JoinPoint point, String methodName){
		return null;
		
	}
	

}
