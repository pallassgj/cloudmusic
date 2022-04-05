package top.minicreo.cloudmusic.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	@GetMapping("/sayHello")
	public String sayHello() {
		return "欢迎来到音乐世界";
	}
}