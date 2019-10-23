package pro.dengyi.easycodegenerator.entity;

import lombok.Data;

import java.util.List;

/**
 * 表实体
 *
 * @author blab
 */
@Data
public class Table {

  /** 表名 */
  private String name;
  /** 实体名 */
  private String name2;
  /** 表注释 */
  private String comment;
  /** 主键列 */
  private String key;
  /** 字段集合 */
  private List<Column> columns;
}
