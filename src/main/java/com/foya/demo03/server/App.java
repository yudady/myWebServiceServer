package com.foya.demo03.server;

import javax.xml.ws.Endpoint;

public class App {

	public static void main(String[] args) {
		String address = "http://localhost:8888/demo03";
		Endpoint.publish(address, new MyServiceImpl());
		System.out.println("Endpoint.publish demo03");
	}

}
