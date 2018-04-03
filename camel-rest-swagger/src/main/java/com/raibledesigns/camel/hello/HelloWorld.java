package com.raibledesigns.camel.hello;

import lombok.Data;

import javax.xml.bind.annotation.XmlRootElement;

@Data
@XmlRootElement(name = "hello")
public class HelloWorld {
	private String message;

	public void setMessage(String message) {
		// TODO Auto-generated method stub
		
	}
}