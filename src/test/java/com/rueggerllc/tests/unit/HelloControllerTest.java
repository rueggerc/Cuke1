package com.rueggerllc.tests.unit;

import static org.assertj.core.api.Assertions.assertThat;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;

import org.mockito.InjectMocks;
import org.mockito.MockitoAnnotations;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.mock.web.MockHttpServletResponse;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;
import org.springframework.test.web.servlet.MockMvc;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.rueggerllc.cuke.Cuke1Application;
import com.rueggerllc.cuke.controller.HelloController;

@SpringBootTest(webEnvironment=SpringBootTest.WebEnvironment.MOCK,classes=Cuke1Application.class)
@AutoConfigureMockMvc
public class HelloControllerTest extends AbstractTestNGSpringContextTests {
	
	@InjectMocks
	private HelloController controller;
	
	@Autowired 
	private MockMvc mvc;
	
	@BeforeMethod
	public void setup() {
		System.out.println("Setup");
		MockitoAnnotations.initMocks(this);
	}
	
	@Test
	public void testContextLoad() throws Exception {
		Assert.assertNotNull(controller);
		System.out.println("Controller is not null");
	}
	
	
	
	@Test
	public void testControllerSayHello() throws Exception {
		
		MockHttpServletResponse response = mvc.perform(
			get("/v1/hello/sayHello")
			.accept(MediaType.APPLICATION_JSON))
			.andReturn().getResponse();
		
		System.out.println("Status=" + response.getStatus());
		System.out.println("Response String=[" + response.getContentAsString() + "]");
		
		assertThat(response.getStatus()).isEqualTo(200);
		System.out.println("Test Passed");
		
		// Assert.assertThat(response.getStatus()).isEqualTo(HttpStatus.OK.value());
		// Assert.assertThat(response.getContentAsString().isEqualTo("null);
		
	}

	@Test
	public void testControllerSayHello3() throws Exception {
		
//		ResultActions result = mvc.perform(
//			post("/api/getCreditCardNumber").contentType(MediaType.APPLICATION_JSON_UTF8_VALUE)
//			.content(JsonConverter.toJsonBytes(new TsysCreditCardNumberRequest())))
//			.andDo(print());
//	
		
	}

	
	
	
	
}
