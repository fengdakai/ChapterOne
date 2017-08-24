package com.fk.ChapterOne;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.scheduling.annotation.EnableAsync;

@EnableAsync
@SpringBootApplication
public class ChapterOneApplication {

	public static void main(String[] args) {
		SpringApplication.run(ChapterOneApplication.class, args);
	}
}
