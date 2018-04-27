package com.imooc.aop.schema.advisors.serivce;

import org.springframework.dao.PessimisticLockingFailureException;
import org.springframework.stereotype.Service;

@Service
public class InvokService {
  public void invok(){
	  System.out.println("成功调用");
  }
  
  public void invokExecption(){
	  throw new  PessimisticLockingFailureException("");
  }
}
