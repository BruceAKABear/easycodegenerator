package pro.dengyi.easycodegenerator.common.result;

import lombok.Getter;
import pro.dengyi.easycodegenerator.common.ResultCode;

/**
 * 列表返回
 *
 * @author blab
 */
@Getter
public class SingleResult<T> extends BaseResult {
  private T single;

  public SingleResult(ResultCode resultCode, T param) {
    super(resultCode);
    this.single = param;
  }
}
