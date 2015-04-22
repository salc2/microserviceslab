package com.main.app;


import org.springframework.boot.*;
import org.springframework.boot.autoconfigure.*;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.*;
import org.springframework.http.*;
import com.main.app.entities.*;

@EnableAutoConfiguration
@RestController
public class Application {


	@RequestMapping("/")
	String home(){
		return "<h2> API Math Operation & Words Operation Web Services.</h2>";
	}
	@RequestMapping("/{wordOpt}/{word}/{mathOpt}/{a}/{b}")
	FinalResult doOperations(@PathVariable(value="wordOpt") String wordOpt,
			@PathVariable(value="word") String word,
			@PathVariable(value="mathOpt") String mathOpt,
			@PathVariable(value="a") Integer a,
			@PathVariable(value="b") Integer b){
	
	RestTemplate restTemplate = new RestTemplate();
	ResponseEntity<Result> responseMath = restTemplate.getForEntity(
			        "http://localhost:8001/"+mathOpt+"/"+a+"/"+b,
				        Result.class);
	ResponseEntity<Result> responseWord = restTemplate.getForEntity(
			        "http://localhost:8002/"+wordOpt+"/"+word,
				        Result.class);
		return new FinalResult(responseWord.getBody(),responseMath.getBody());
	}

public static void main(String[] args){
	SpringApplication.run(Application.class, args);
	System.out.println("API WordsOpts + MathOpts Ready!!");
}

}
