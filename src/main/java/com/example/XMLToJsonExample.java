package com.example;

import java.io.File;

import org.simpleframework.xml.Serializer;
import org.simpleframework.xml.core.Persister;

import com.fasterxml.jackson.databind.ObjectMapper;

public class XMLToJsonExample {

	public static void main(String[] args) throws Exception {
		// read xml file into class pojo using simple-xml framework
		Serializer serializer = new Persister();
		File source = new File("src/main/resources/sample.xml");

		Configuration configuration = serializer.read(Configuration.class,
				source);

		// verify whether we parse xml file correctly
		System.out.println("Identity : " + configuration.getIdentity());
		System.out.println("Server Host : "
				+ configuration.getServer().getHost());
		System.out.println("Server port : "
				+ configuration.getServer().getPort());
		System.out.println("Server Security Keystore : "
				+ configuration.getServer().getSecurity().getKeyStore());
		System.out.println("Server Security IsSSL : "
				+ configuration.getServer().getSecurity().isSSL());

		// convert xml to json by converting java pojo class to json object
		// convert java class to json object
		ObjectMapper mapper = new ObjectMapper();

		String jsonOutputFileName = "/home/mandar/ProjectWorkspace/JavaExample/src/main/resources/server.json";
		// Object to JSON in file
		mapper.writeValue(new File(jsonOutputFileName), configuration);

		System.out.println("Created json file in following location : "
				+ jsonOutputFileName);

	}
}
