package com.cursospring.Hello;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

//Controller
@RestController
//@RequestMapping(method = RequestMethod.GET, path = "/hellowold")
public class HelloWorldController {
	//Simple Method
	//URI - /hellowold
	//GET
	@RequestMapping(method = RequestMethod.GET, path = "/hellowold")
	public String hellowold() {
		return "Hello World";
	}
	
}
