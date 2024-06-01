package com.calculator.demo_calculator_exercise.infra;

import org.springframework.web.bind.annotation.ExceptionHandler;

public class GlobalExceptionHandler {

  @ExceptionHandler(NullPointerException.class)
  public ErrorResponse nullPointerExceptionHandler(NullPointerException e){
    return ErrorResponse.of(ErrorCode.NPE.getCode(), ErrorCode.NPE.getDesc());
  }

  @ExceptionHandler(BusinessRuntimeException.class)
  public ErrorResponse businessRuntimeExceptionHandler(BusinessRuntimeException e){
    return ErrorResponse.of(e.getCode(), e.getMessage());
  }

  
}


