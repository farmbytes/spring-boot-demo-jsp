package com.example.springbootdemojsp;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class SpringBootDemoJspController {

	@RequestMapping("/welcome/{name}")
	public String welcomePlayer(Map model, @PathVariable String name) {
		model.put("name", name);
		return "welcome";
	}
}
