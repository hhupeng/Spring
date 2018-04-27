package com.imooc.aop.schema.advice;

import org.aspectj.lang.ProceedingJoinPoint;

public class MoocAspect {
   public void before(){
	   System.out.println("AOP的前置通知");
   }
   
   public void after(){
	   System.out.println("AOP的后置置通知");
   }
   
   public Object around(ProceedingJoinPoint pjp) throws Throwable{
	   Object obj = null;
	   System.out.println("AOP的环绕通知1");
	   obj = pjp.proceed();
	   System.out.println("AOP的环绕通知2");
	return obj;
   }
   
   public Object aroundInit(ProceedingJoinPoint pjp,String bizName,int times) throws Throwable{
	   Object obj = null;
	   System.out.println("切面类的输出："+bizName+" "+times);//核心
	   System.out.println("AOP的环绕通知1");
	   obj = pjp.proceed();
	   System.out.println("AOP的环绕通知2");
	  return obj;
   }
}

