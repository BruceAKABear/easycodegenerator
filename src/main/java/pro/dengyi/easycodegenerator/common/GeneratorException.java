package pro.dengyi.easycodegenerator.common;

/**
 * 自定义异常
 *
 * @author blab
 */
public class GeneratorException extends RuntimeException {

  /** 错误信息 */
  private String errorMsg;

  public GeneratorException(String message, String errorMsg) {
    super(message);
    this.errorMsg = errorMsg;
  }
}
