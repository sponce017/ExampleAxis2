package com.empresa.proyecto.ws;

import java.util.ArrayList;
import java.util.List;

public class HelloService {

	public String hello() {
		return "Hello World Axis 2 !!!";
	}
	
	public List<Object[]> returnList(){
		List<Object[]> list = new ArrayList<Object[]>();		
		return list;
	}
	
}
