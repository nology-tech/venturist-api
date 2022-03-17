package com.nology.VenturistProxyAPI;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.web.server.LocalServerPort;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class VenturistProxyApiApplicationTests {

	@LocalServerPort
	private int port;

	@Autowired
	private TestRestTemplate restTemplate;

	@Test
	void contextLoads() {
	}

	@Test
	public void currenciesEndpointReturnsAnObject() throws Exception {
		String url = "http://localhost:" + port + "/currencies";
		assertThat(restTemplate.getForObject(url,
				Object.class)).isInstanceOfAny(Object.class);
	}



}
