package com.bcforum.demo_exercise2_bcforum.Infra;

import lombok.Getter;

@Getter
public class BusinessException extends Exception {

  private int code;

  public BusinessException(SysCode sysCode) {
    super(sysCode.getDesc());
    this.code = sysCode.getCode();
  }

}
