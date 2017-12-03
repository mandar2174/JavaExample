package com.example;

import org.simpleframework.xml.Attribute;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

@Root
public class Configuration {

	@Element
	private Server server;

	@Attribute
	private int id;

	public int getIdentity() {
		return id;
	}

	public Server getServer() {
		return server;
	}
}