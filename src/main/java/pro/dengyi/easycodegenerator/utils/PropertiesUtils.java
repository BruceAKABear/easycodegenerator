package pro.dengyi.easycodegenerator.utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Properties;

/** 需要将自定义的配置信息写入到properties文件中 配置到相对于工程的properties文件夹下 */
public class PropertiesUtils {

  // 自定义的数据模型map集合
  public static Map<String, String> customMap = new HashMap<>();

  static {
    File dir = new File("properties");
    try {
      // 查询某个目录下的所有文件
      List<File> files = FileUtils.searchAllFile(new File(dir.getAbsolutePath()));
      for (File file : files) {
        if (file.getName().endsWith(".properties")) {
          Properties prop = new Properties();
          prop.load(new FileInputStream(file));
          customMap.putAll((Map) prop);
        }
      }
    } catch (IOException e) {
      e.printStackTrace();
    }
  }

  public static void main(String[] args) {
    PropertiesUtils.customMap.forEach(
        (k, v) -> {
          System.out.println(k + "--" + v);
        });
  }
}
