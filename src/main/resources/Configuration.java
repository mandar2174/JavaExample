package com.example;

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