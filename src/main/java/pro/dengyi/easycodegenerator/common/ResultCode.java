package pro.dengyi.easycodegenerator.common;

import lombok.Getter;

/**
 * 响应状态枚举
 *
 * @author blab
 */
@Getter
public enum ResultCode {
  /** 操作成功枚举 */
  SUCCESS("操作成功", true),
  /** 操作失败枚举 */
  FAIL("操作失败", false);

  private String message;
  private Boolean status;

  ResultCode(String message, Boolean status) {
    this.message = message;
    this.status = status;
  }
}
