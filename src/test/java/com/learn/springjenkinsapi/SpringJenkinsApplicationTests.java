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
	public void contextLoads() {
		logger.info("Test case executing #1...");
		assertEquals(true, true);
	}

}
