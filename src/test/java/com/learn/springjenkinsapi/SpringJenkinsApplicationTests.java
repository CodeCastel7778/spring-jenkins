package com.learn.springjenkinsapi;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringJenkinsApplicationTests {

	static Logger logger = LoggerFactory.getLogger(SpringJenkinsApplicationTests.class);

	@Test
	public  contextLoads() {
		logger.info("Test case executing #1...");
		logger.info("Test case executing #2...");
		assertEquals(true, true);
	}

}
