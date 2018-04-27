package com.imooc.aop.schema.advice;

import com.imooc.aop.schema.advice.Fit;

public class FitImpl implements Fit {

	@Override
	public void fitter() {
		System.out.println("强制类型转换");

	}

}
