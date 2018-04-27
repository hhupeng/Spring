package com.imooc.aop.schema.advisors;

import org.aspectj.lang.ProceedingJoinPoint;
import org.springframework.dao.PessimisticLockingFailureException;

public class OptionTry {
	private int maxTrys = 2;
	private int order = 1;
	public void setMaxTrys(int maxTrys) {
		this.maxTrys = maxTrys;
	}
	public void setOrder(int order) {
		this.order = order;
	}
	public Object trys(ProceedingJoinPoint pjp) throws Throwable{
		PessimisticLockingFailureException lockingFailureException = null;
		int trys = 0;
		do{
			try {
				trys++;
				System.out.println("进行了第"+trys+"次尝试");
				return pjp.proceed();
			} catch (PessimisticLockingFailureException ex) {
				lockingFailureException = ex;
			}
		}while(trys<=this.maxTrys);
		
		throw lockingFailureException;
		
	}
}
