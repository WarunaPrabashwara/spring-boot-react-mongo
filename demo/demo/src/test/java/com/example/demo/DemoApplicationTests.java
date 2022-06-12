package com.example.demo;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan({"com.example.demo.control"} )
@SpringBootTest

class DemoApplicationTests {

	@Test
	void contextLoads() {
	}

}
