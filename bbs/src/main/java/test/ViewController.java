package test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
@EnableAutoConfiguration
public class ViewController {

	@RequestMapping("/")
	@ResponseBody
	public ModelAndView index() {
		ModelAndView mav = new ModelAndView("login.html");
		return mav;
	}

	@RequestMapping("/login/")
	public String login(@RequestParam("user_id") String id, @RequestParam("user_pwd") String pwd) {
 		return "id = "+  id + "PWD =" + pwd;

	}

	public static void main(String[] args) throws Exception {
		SpringApplication.run(ViewController.class, args);
	}
}
