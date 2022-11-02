package com.jen;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringAndJenkinsApplicationTests {

	public static Logger logger=LoggerFactory.getLogger(SpringAndJenkinsApplication.class);
	
	
	@Test
	void contextLoads() {
		logger.info("Test cases executing");
		assertEquals(true, true);
		
	}

}
