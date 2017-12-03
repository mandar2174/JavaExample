package com.example;

import org.simpleframework.xml.Attribute;
import org.simpleframework.xml.Element;

public class Server {

	   @Attribute
	   private int port;

	   @Element
	   private String host;

	   @Element
	   private Security security;

	   public int getPort() {
	      return port;           
	   }

	   public String getHost() {
	      return host;           
	   }

	   public Security getSecurity() {
	      return security;           
	   }
	}
