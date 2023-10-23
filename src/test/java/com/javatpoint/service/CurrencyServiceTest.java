package com.javatpoint.service;

import static org.assertj.core.api.Assertions.assertThat;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.boot.web.server.LocalServerPort;

import com.javatpoint.controller.CurrencyController;

@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)
public class CurrencyServiceTest {

	@LocalServerPort
	private int port;
	
	@Autowired
	private CurrencyController controller;
	
	@Test
	void contextLoads() throws Exception {
		assertThat(controller).isNotNull();
	}
}
