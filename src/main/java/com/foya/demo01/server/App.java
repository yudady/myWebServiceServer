package com.foya.demo01.server;

import javax.xml.ws.Endpoint;

public class App {

	public static void main(String[] args) {
		String address = "http://localhost:8888/ns";
		Endpoint.publish(address, new MyServiceImpl());
		System.out.println("Endpoint.publish");
	}

}
