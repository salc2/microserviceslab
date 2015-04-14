package com.words.app;


import org.springframework.boot.*;
import org.springframework.boot.autoconfigure.*;
import org.springframework.web.bind.annotation.*;
import com.words.app.services.*;
import com.words.app.entities.*;
@EnableAutoConfiguration
@RestController
public class Application {
	@RequestMapping("/")
	String home(){
		return "<h2> API WordsOpt Web Services.</h2>";
	}
	@RequestMapping("/reverse/{word}")
	Result reverseWord(@PathVariable(value="word") String word) throws Exception{
		return WordsService.reverse(word);
	}
	@RequestMapping("/count/{word}")
	Result countWord(@PathVariable(value="word") String word) throws Exception{
		return WordsService.count(word);
	}
public static void main(String[] args){
	SpringApplication.run(Application.class, args);
	System.out.println("API Words Ready!!");
}

}
