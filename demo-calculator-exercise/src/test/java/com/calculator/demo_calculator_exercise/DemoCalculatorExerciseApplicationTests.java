package com.calculator.demo_calculator_exercise;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.calculator.demo_calculator_exercise.Controller.impl.CalculatorController;
import com.calculator.demo_calculator_exercise.config.AppConfig;

@SpringBootTest
class DemoCalculatorExerciseApplicationTests {

	@Autowired
	private AppConfig appConfig;

	@Autowired
	private CalculatorController calculatorController;

	@Test
	void contextLoads() {
	}

}
