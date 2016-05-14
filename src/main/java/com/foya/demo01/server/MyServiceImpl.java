package com.foya.demo01.server;

import javax.jws.WebService;

@WebService(endpointInterface = "com.foya.demo01.server.IMyService")
public class MyServiceImpl implements IMyService {

	@Override
	public int add(int a, int b) {
		System.out.println(a + "+" + b + "=" + (a + b));
		return a + b;
	}

	@Override
	public int minus(int a, int b) {
		System.out.println(a + "-" + b + "=" + (a - b));
		return a - b;
	}

}
