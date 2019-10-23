package pro.dengyi.easycodegenerator.common.result;

import lombok.Data;
import pro.dengyi.easycodegenerator.common.ResultCode;

/**
 * 通用相应类
 *
 * @author blab
 */
@Data
public class BaseResult {
  // 信息
  private String message;
  // 状态
  private Boolean status;

  public BaseResult(ResultCode resultCode) {
    this.message = resultCode.getMessage();
    this.status = resultCode.getStatus();
  }
}
