package com.cadastros.produtos;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@RequestMapping("/")
public class ProdutosApplication {

	@GetMapping
	public String getTestHome() {return "Teste Home";}

	public static void main(String[] args) {
		SpringApplication.run(ProdutosApplication.class, args);
	}

}
