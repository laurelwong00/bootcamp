package week4.Recursive;

public enum SysCode {
  LOGIN_FAIL(1000, "Login Fail."),
  PW_WRONG(1001, "Password is wrong"),
  ID_NOT_FOUND(1002, "User IF is not found"),
  ;

  private int code;
  private String desc;

  private SysCode(int code, String desc) {
    this.code = code;
    this.desc = desc;
  }

  public int getCode() {
    return this.code;
  }
  public String getDesc() {
    return this.desc;
  }
}
