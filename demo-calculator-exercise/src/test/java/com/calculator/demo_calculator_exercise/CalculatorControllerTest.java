package com.calculator.demo_calculator_exercise;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.hamcrest.Matchers.hasItem;
import static org.hamcrest.Matchers.is;

import com.calculator.demo_calculator_exercise.Controller.impl.CalculatorController;
import com.calculator.demo_calculator_exercise.Service.CalculatorService;

@WebMvcTest(CalculatorController.class)
public class CalculatorControllerTest {
  @MockBean
  private CalculatorService calculatorService;

  @Autowired
  private MockMvc mockMvc;

  @Test
  void testCalculate() throws Exception {
    // Simulate a client make the web request
    mockMvc.perform(MockMvcRequestBuilders.get("/operation/3/8/div"))
      .andExpect(jsonPath("$.result", is("0.37500")));
  }

  //未學得好呢Part 星期一找同學搞搞佢先thanks for your understanding
  
}
