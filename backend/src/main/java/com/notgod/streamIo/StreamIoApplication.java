package com.notgod.streamIo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"com.notgod.streamIo", "com.notgod.streamIo.configuration"})
public class StreamIoApplication {

	public static void main(String[] args) {
		SpringApplication.run(StreamIoApplication.class, args);
	}

}
