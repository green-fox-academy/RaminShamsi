package hu.greenfox.ramin.controllers;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import com.jayway.jsonpath.JsonPath;
import hu.greenfox.ramin.IntegrationtestApplication;
import hu.greenfox.ramin.models.Food;
import hu.greenfox.ramin.models.FoodList;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import java.nio.charset.Charset;

import static org.hamcrest.Matchers.closeTo;
import static org.hamcrest.core.Is.is;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.*;
import static org.springframework.test.web.servlet.setup.MockMvcBuilders.webAppContextSetup;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = IntegrationtestApplication.class)
@WebAppConfiguration
@EnableWebMvc
public class GuardianControllerTest {
  private MediaType contentType = new MediaType(MediaType.APPLICATION_JSON.getType(),
          MediaType.APPLICATION_JSON.getSubtype(),
          Charset.forName("utf8"));

  private MockMvc mockMvc;

  @Autowired
  private WebApplicationContext webApplicationContext;

  @Before
  public void setup() throws Exception {
    this.mockMvc = webAppContextSetup(webApplicationContext).build();
  }

  /////////////////////////////////// Exersice 1 /////////////////////////////
  @Test
  public void gaurdianContentTest() throws Exception {
    mockMvc.perform(get("/groot")
            .contentType(MediaType.APPLICATION_JSON)
            .param("message", "Hello"))                         /// End of the Get Method  //Giving the ?message=Hello
            .andExpect(status().isOk())                       // Starting of perform
            .andExpect(content().contentType(contentType))
            .andExpect(jsonPath("$.translated", is("I am Groot!")));
  }

  @Test
  public void gaurdianErrorTest() throws Exception {
    mockMvc.perform(get("/groot")
            .contentType(MediaType.APPLICATION_JSON))
            .andExpect(status().isOk())                        //it means get status=200, beacuse we handled the error
            .andExpect(content().contentType(contentType))
            .andExpect(jsonPath("$.error", is("I am Groot!")))
            .andDo(print());            //Print out all things which done it before
  }

  /////////////////////////////////// Exercise 2 /////////////////////////////
  @Test
  public void yonduContentTest() throws Exception {
    mockMvc.perform(get("/yondu")
            .contentType(MediaType.APPLICATION_JSON)
            .param("distance", "500")
            .param("time", "23"))
            .andExpect(status().isOk())
            .andExpect(content().contentType(contentType))
            .andExpect(jsonPath("$.speed").value(closeTo(500 / 23, 5)))
            .andDo(print());             // expecting float result with 5 digits
  }

  @Test
  public void yonduInfinityTest() throws Exception {
    mockMvc.perform(get("/yondu")
            .contentType(MediaType.APPLICATION_JSON)
            .param("distance", "500")
            .param("time", "0"))
            .andExpect(status().isOk())
            .andExpect(content().contentType(contentType))
            .andExpect(jsonPath("$.speed", is("Infinity")));
  }

  @Test
  public void yonduErrorTest() throws Exception {
    mockMvc.perform(get("/yondu")
            .contentType(MediaType.APPLICATION_JSON))
            .andExpect(status().isOk())
            .andExpect(content().contentType(contentType))
            .andExpect(jsonPath("$.error", is("Distance or Time is missing!")))
            .andDo(print());            //Print out all things which done it before
  }

  ////////////////  Exercise 4 //////////////
  @Test
  public void calorieTableTest() throws Exception {

    mockMvc.perform(put("/kiwi/update")
            .contentType(MediaType.APPLICATION_JSON)
            .content("{\"amount\" : \"0\"}"))
            .andExpect(status().isOk())
            .andExpect(content().contentType(contentType))
            .andExpect(jsonPath("$.foodList[?(@.name=='kiwi')].amount", is(0)))
            .andDo(print());
  }

}
