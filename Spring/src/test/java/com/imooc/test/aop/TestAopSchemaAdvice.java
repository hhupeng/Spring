package com.imooc.test.aop;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;

import com.imooc.aop.schema.advice.Fit;
import com.imooc.aop.schema.advice.Biz.AspectBiz;
import com.imooc.test.base.UnitTestBase;

@RunWith(BlockJUnit4ClassRunner.class)
public class TestAopSchemaAdvice  extends UnitTestBase {
		
		public TestAopSchemaAdvice() {
			super("classpath:spring-aop-schema-advice.xml");
		}
		
		@Test
		public void testAdvice() {
			AspectBiz biz = super.getBean("aspectBiz");
			biz.biz();
		}
		
		@Test
		public void testAdviceParam() {
			AspectBiz biz = super.getBean("aspectBiz");
			biz.aroundInit("参数1", 3);
		}
		
		@Test
		public void testFit() {
			Fit fit = (Fit)super.getBean("aspectBiz");
			fit.fitter();
		}

}
