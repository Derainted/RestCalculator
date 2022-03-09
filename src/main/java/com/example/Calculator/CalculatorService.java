package com.example.Calculator;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

// This class provide 3 major operation for calculator, addition, substraction and multiplication.

 

@RestController
public class CalculatorService {

	
	// Methods and parameters. 
	@GetMapping("/add/{x}/{y}")
	// Using Path variables to extract the value from the URL.
	public Response add(@PathVariable int x, @PathVariable int y) {
		return new Response(x, y, x+y);
	}
	
	@GetMapping("/sub/{x}/{y}")
	public Response sub(@PathVariable int x, @PathVariable int y) {
		return new Response(x, y, x-y);
	}
	
	@GetMapping("/mul/{x}/{y}")
	public Response mul(@PathVariable int x, @PathVariable int y) {
		return new Response(x, y, x*y);
	}
	
	
	
	
	
}
