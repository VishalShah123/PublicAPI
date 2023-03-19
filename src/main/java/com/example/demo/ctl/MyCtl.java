package com.example.demo.ctl;

import java.util.ArrayList;
import java.util.HashMap;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class MyCtl {

	@GetMapping("/hello")
	public  String hello() {
		return "hello from public APi";
	}
	
	@GetMapping("/user")
	public ArrayList publicUser() {
		
		String uri = "http://jsonplaceholder.typicode.com/users";
		
	//	String uri = "http://localhost:8080/hello";
		RestTemplate rt = new RestTemplate();
	Object[] o = 	rt.getForObject(uri, Object[].class);
		
	ArrayList<String> al = new ArrayList<String>();
	
		for (Object object : o) {
			HashMap hm = (HashMap)object;
			String e = (String)hm.get("email");
			al.add(e);
			System.out.println(hm.get("name")+"	= "+e);
		}
		
		
		return al;
	}
}
