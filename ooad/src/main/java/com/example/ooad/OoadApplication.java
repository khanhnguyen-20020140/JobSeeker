package com.example.ooad;

import com.example.ooad.service.UserDetailsServiceImpl;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;

@SpringBootApplication
public class OoadApplication  implements CommandLineRunner {

	public static void main(String[] args) {

		System.out.println("hii");
		SpringApplication.run(OoadApplication.class, args);
	}
	@Override
	public void run(String... args) throws Exception{


	}
}
