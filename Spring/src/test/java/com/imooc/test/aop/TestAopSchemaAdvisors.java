package com.imooc.test.aop;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;

import com.imooc.aop.schema.advisors.OptionTry;
import com.imooc.aop.schema.advisors.serivce.InvokService;
import com.imooc.test.base.UnitTestBase;
@RunWith(BlockJUnit4ClassRunner.class)
public class TestAopSchemaAdvisors  extends UnitTestBase {
	
	public TestAopSchemaAdvisors(){
		super("classpath:spring-aop-schema-advisors.xml");
	}

	@Test
	public void testAopSchemaAdvisors(){
		InvokService invokService  = super.getBean("invokService");
		invokService.invokExecption();
	}
	
	@Test
	public void tes(){
		OptionTry optionTry  = super.getBean("optionTry");
//		System.out.println(optionTry.);
	}
}
