package com.imooc.aop.schema.advice.Biz;

public class AspectBiz {
	public void biz(){
		System.out.println("具体的业务操作");
	//	throw new RuntimeException();
	}
	
	public void aroundInit(String bizName,int times){
		System.out.println("业务操作的输出:"+bizName+"  "+times);
	}
}
