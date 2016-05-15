package com.foya.demo04.server;

import javax.xml.ws.Endpoint;

public class App {

	public static void main(String[] args) {

		String demo4 = "http://localhost:8888/demo04";

		Endpoint.publish(demo4 , new MyServiceImpl());

		System.out.println("Endpoint.publish demo04");
	}

}
