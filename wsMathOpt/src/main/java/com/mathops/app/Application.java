package com.mathops.app;


import org.springframework.boot.*;
import org.springframework.boot.autoconfigure.*;
import org.springframework.web.bind.annotation.*;
import com.mathops.app.services.OptsService;
import com.mathops.app.entities.*;

@EnableAutoConfiguration
@RestController
public class Application {
	@RequestMapping("/")
	String home(){
		return "<h2> API Math Operation Web Services.</h2>";
	}
	@RequestMapping("/add/{a}/{b}")
	Result doAdd(@PathVariable(value="a") Integer a,
			@PathVariable(value="b") Integer b){
		return OptsService.add(a,b);
	}

	@RequestMapping("/sust/{a}/{b}")
	Result doSust(@PathVariable(value="a") Integer a,
			@PathVariable(value="b") Integer b){
		return OptsService.sust(a,b);
	}
	@RequestMapping("/mult/{a}/{b}")
	Result doMult(@PathVariable(value="a") Integer a,
			@PathVariable(value="b") Integer b){
		return OptsService.mult(a,b);
	}
	@RequestMapping("/div/{a}/{b}")
	Result doDiv(@PathVariable(value="a") Integer a,
			@PathVariable(value="b") Integer b){
		return OptsService.div(a,b);
	}
public static void main(String[] args){
	SpringApplication.run(Application.class, args);
	System.out.println("API MathOpts Ready!!");
}

}
