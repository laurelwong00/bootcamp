package week4.Recursive;

public class BusinessException extends Exception {

  private int code;

  private BusinessException(SysCode syscode) {
    super(SysCode.getDesc());
    this.code = syscode.getCode();
  }

  public static BusinessException of(SysCode syscode) {
    if (syscode == null) {
      throw new IllegalArgumentException();
    }
    return new BusinessException(syscode);
  }

  public static void main(String[] args) throws BusinessException{
    Exception e = new Exception("Login fail!");
    BusinessException be = new BusinessException(10000, "Login fail");

    // be is a throwable
    throw be;
  }
}
