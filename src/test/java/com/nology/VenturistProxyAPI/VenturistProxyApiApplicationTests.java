package com.nology.VenturistProxyAPI;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import static org.assertj.core.api.Assertions.assertThat;

import com.nology.VenturistProxyAPI.Users;

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
	
	@Test
	public void listOfCurrentEndpointReturnsOK() throws Exception {
		String[] urls = {"/users", "/user/0", "/holdings", "/user-holding/0"};
		for(String url : urls){
			String endpoints = "http://localhost:" + port + url;
			ResponseEntity<String> response= restTemplate.getForEntity(url, String.class);
			assertThat(response.getStatusCode()).isEqualTo(HttpStatus.OK);
		}
	}

	@Test
	public void testTransactionGetAllReturnsFound() throws Exception {
		String endpoint = "http://localhost:" + port + "/transactions";
		ResponseEntity<String> response= restTemplate.getForEntity(endpoint, String.class);
		assertThat(response.getStatusCode()).isEqualTo(HttpStatus.FOUND);

	}



}
