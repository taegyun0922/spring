package test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableAutoConfiguration
public class ViewController {
	@RequestMapping("/test")
	@ResponseBody
	String test(){
		return "hello spring";
	}		
	
	public static void main(String[] args) throws Exception {
	        SpringApplication.run(ViewController.class, args);
	    }
}
