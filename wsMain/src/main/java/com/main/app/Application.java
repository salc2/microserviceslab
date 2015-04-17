package com.main.app;


import org.springframework.boot.*;
import org.springframework.boot.autoconfigure.*;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.*;
import org.springframework.http.*;

@EnableAutoConfiguration
@RestController
public class Application {


	@RequestMapping("/")
	String home(){
		return "<h2> API Math Operation & Words Operation Web Services.</h2>";
	}
	@RequestMapping("/{wordOpt}/{word}/{mathOpt}/{a}/{b}")
	String doOperations(@PathVariable(value="wordOpt") String wordOpt,
			@PathVariable(value="word") String word,
			@PathVariable(value="matOpt") String mathOpt,
			@PathVariable(value="a") Integer a,
			@PathVariable(value="b") Integer b){
	
	return "{\"words\":{\"operation\":\"revert\",\"result\":\"2\"},\"math\":{\"operation\":\"1+1\",\"result\":\"2\"}}";
	}

public static void main(String[] args){
	SpringApplication.run(Application.class, args);
	RestTemplate restTemplate = new RestTemplate();
	ResponseEntity<String> response = restTemplate.getForEntity(
			        "https://data.sparkfun.com/streams/dZ4EVmE8yGCRGx5XRX1W.json",
				        String.class);

	System.out.println(response);
	System.out.println("API WordsOpts + MathOpts Ready!!");
}

}
