package pro.dengyi.easycodegenerator.entity;

import lombok.Data;

/**
 * 字段实体
 *
 * @author blab
 */
@Data
public class Column {

  /** 字段名 */
  private String columnName;
  /** 字段别名 */
  private String columnName2;
  /** Java类型 */
  private String columnType;
  /** 数据库字段类型 */
  private String columnDbType;
  /** 字段备注 */
  private String columnComment;
  /** 是否是主键 */
  private String columnKey;
}
