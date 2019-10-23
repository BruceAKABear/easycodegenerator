package pro.dengyi.easycodegenerator.common.result;

import lombok.Getter;
import pro.dengyi.easycodegenerator.common.ResultCode;

import java.util.List;

/**
 * 列表返回
 *
 * @author blab
 */
@Getter
public class ListResult<T> extends BaseResult {
  private List<T> list;

  public ListResult(ResultCode resultCode, List<T> lists) {
    super(resultCode);
    this.list = lists;
  }
}
