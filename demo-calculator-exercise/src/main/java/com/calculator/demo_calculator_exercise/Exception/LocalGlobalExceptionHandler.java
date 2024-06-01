package com.calculator.demo_calculator_exercise.Exception;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.calculator.demo_calculator_exercise.infra.ErrorCode;
import com.calculator.demo_calculator_exercise.infra.ErrorResponse;
import com.calculator.demo_calculator_exercise.infra.GlobalExceptionHandler;


@RestControllerAdvice
public class LocalGlobalExceptionHandler extends GlobalExceptionHandler{

  @ExceptionHandler(NumberFormatException.class) // 上面寫左下面可以不寫()
  public ErrorResponse numberFormatExceptionHandler(NumberFormatException e) {
    return ErrorResponse.of(ErrorCode.INVALID_INPUT_TYPE.getCode(), ErrorCode.INVALID_INPUT_TYPE.getDesc());
  }

  @ExceptionHandler(ArithmeticException.class)
  public ErrorResponse arithmeticExceptionHandler(NumberFormatException e){
    return ErrorResponse.of(ErrorCode.INVALID_INPUT_TYPE.getCode(), ErrorCode.INVALID_INPUT_TYPE.getDesc());
  }

  @ExceptionHandler(IllegalArgumentException.class)
  public ErrorResponse illegalArgumentExceptionHandler() {
    return ErrorResponse.of(ErrorCode.INVALID_INPUT_TYPE.getCode(), ErrorCode.INVALID_INPUT_TYPE.getDesc());
  }

  // //Alternative
  // @ExceptionHandler({ArithmeticException.class,NumberFormatException.class, IOException }) 
  // public ErrorResponse ExceptionHandler() {
  //   if (e instanceof NumberFormatException) {
  //     return new ErrorResponse(ErrorCode.INVALID_INPUT_TYPE.getCode(), ErrorCode.INVALID_INPUT_TYPE.getDesc());
  //   } else if (e instanceof ArithmeticException) {
  //     return new ErrorResponse(ErrorCode.AE.getCode(), ErrorCode.AE.getDesc());
  //   } else {
  //     return new ErrorResponse(ErrorCode.IOE.getCode(), ErrorCode.IOE.getDesc());
  //   }
  // }


}
