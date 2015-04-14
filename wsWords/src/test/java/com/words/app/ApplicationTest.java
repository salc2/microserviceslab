package com.words.app;


import static org.junit.Assert.assertEquals;
import static org.hamcrest.Matchers.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.http.MediaType;
import org.springframework.mock.web.MockServletContext;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.*;
import com.words.app.entities.*;
import static org.hamcrest.Matchers.equalTo;

	@RunWith(SpringJUnit4ClassRunner.class)
	@SpringApplicationConfiguration(classes = MockServletContext.class)
	@WebAppConfiguration
	public class ApplicationTest {

		private MockMvc mvc;

		@Before
		public void setUp() throws Exception {
			mvc = MockMvcBuilders.standaloneSetup(new Application()).build();
		}

		@Test
		public void testRoot() throws Exception {
			mvc.perform(MockMvcRequestBuilders.get("/"))
				.andExpect(status().isOk())
				.andExpect(content().string(containsString("API")));
		}
		@Test
		public void testCount() throws Exception {
		mvc.perform(MockMvcRequestBuilders.get("/count/{word}","javier").accept(MediaType.APPLICATION_JSON))
			.andDo(print()).andExpect(content().string(equalTo("{\"operation\":\"count\",\"result\":\"6\"}")));
		}
		@Test
		public void testReverse() throws Exception {
		mvc.perform(MockMvcRequestBuilders.get("/reverse/{word}","javier").accept(MediaType.APPLICATION_JSON))
			.andDo(print()).andExpect(content().string(equalTo("{\"operation\":\"reverse\",\"result\":\"reivaj\"}")));
		}


	}

