package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.form.TPBizReportForm;
import com.example.demo.service.TPBizReportService;

@Controller
public class TPBizReportController {
	  /**
	   * ユーザー情報 Service
	   */
	  @Autowired
	  TPBizReportService bizReportService;
	  
	  @RequestMapping("/bizreport/")
	  public String index(Model model) {
		  // フォームを作成
		  TPBizReportForm tpBizReportForm = new TPBizReportForm();
		  // 画面のフォーム値をセット
		  model.addAttribute("tpBizReportForm",tpBizReportForm);
		  
		  return "/bizreport/index";
	  }

}
