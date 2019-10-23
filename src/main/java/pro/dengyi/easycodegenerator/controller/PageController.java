package pro.dengyi.easycodegenerator.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import pro.dengyi.easycodegenerator.common.result.BaseResult;
import pro.dengyi.easycodegenerator.common.ResultCode;
import pro.dengyi.easycodegenerator.service.PageService;

/**
 * 页面controller
 *
 * @author blab
 */
@Controller
@RequestMapping("/codeGenerator")
public class PageController {
  @Autowired private PageService pageService;

  /**
   * 显示主页
   *
   * @return
   */
  @GetMapping("/")
  public String index() {
    System.out.println(123);

    return "";
  }

  @GetMapping("/testConnection")
  @ResponseBody
  public BaseResult testConnection() {
    return new BaseResult(ResultCode.SUCCESS);
  }
}
