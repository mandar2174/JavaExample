package com.example;

import org.simpleframework.xml.Attribute;
import org.simpleframework.xml.Element;

public class Security {

	@Attribute
	private boolean ssl;

	@Element
	private String keyStore;

	public boolean isSSL() {
		return ssl;
	}

	public String getKeyStore() {
		return keyStore;
	}
}