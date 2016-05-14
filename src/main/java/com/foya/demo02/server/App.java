package com.foya.demo02.server;

import javax.xml.ws.Endpoint;

public class App {

	public static void main(String[] args) {
		String address = "http://localhost:8888/demo02";
		Endpoint.publish(address, new MyServiceImpl());
		System.out.println("Endpoint.publish demo02");
	}

}
