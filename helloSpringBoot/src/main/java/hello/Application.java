package hello;

import org.springframework.boot.*;
import org.springframework.boot.autoconfigure.*;
import java.util.concurrent.Future;
import org.springframework.web.bind.annotation.*;
import org.springframework.boot.context.embedded.*;
import java.net.URL;
import com.ning.http.client.*;
import java.util.concurrent.Future;
import java.util.concurrent.Callable;
import org.springframework.web.context.request.async.DeferredResult;


@RestController
@EnableAutoConfiguration
public class Application {

	@RequestMapping("/")
		public String home(){
		return "Hello spring";
		}

	public static void main(String[] args){
		SpringApplication.run(Application.class, args);
		System.out.println("Ready server !!!");

	}


}
