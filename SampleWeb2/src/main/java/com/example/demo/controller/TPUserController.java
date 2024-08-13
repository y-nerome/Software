package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.entity.TPTUserEntity;
import com.example.demo.form.TPUserForm;
import com.example.demo.service.TPUserService;

import io.micrometer.common.util.StringUtils;

@Controller
public class TPUserController {
	  /**
	   * ユーザー情報 Service
	   */
	  @Autowired
	  TPUserService userService;
	  
	  @RequestMapping("/user/")
	  public String index(Model model) {
		  // フォームを作成
		  TPUserForm tpUserForm = new TPUserForm();
		  // 初期値としてリストを取得
		  List<TPTUserEntity> userlist = userService.searchAllTUser();
		  // フォームに設定
		  tpUserForm.setTptUserEntityList(userlist);
		  // 画面のフォーム値をセット
		  model.addAttribute("tpUserForm",tpUserForm);
		  
		  return "/user/index";
	  }
	  
	  /**
	   * ユーザー情報一覧画面を表示
	   * @param model Model
	   * @return ユーザー情報一覧画面のHTML
	   */
	  //@RequestMapping("/user/search")
	  @PostMapping(value = "/user/" ,params="search")
	  public String search(TPUserForm form ,  Model model) {
		  // フォームを作成
		  TPUserForm tpUserForm = new TPUserForm();
		  // 条件を指定して検索
		  List<TPTUserEntity> userlist = userService.searchTuserByFormCondition(form);
		  // フォームに設定
		  form.setTptUserEntityList(userlist);
		  // 画面のフォーム値をセット
		  model.addAttribute("tpUserForm",form);
		  return "/user/index";
	  }
	  
	  /**
	   * ユーザー情報登録画面を表示
	   * @param model Model
	   * @return ユーザー情報登録画面のHTML
	   */
//	  @RequestMapping("/user/create")
	  @PostMapping(value = "/user/" ,params="create")
	  public String create(TPUserForm form ,  Model model) {
		  // 
		  model.addAttribute("tpUserForm",new TPUserForm());
		  
		  return "/user/store";
	  }
	  
	  /**
	   * ユーザー情報登録画面を表示
	   * @param model Model
	   * @return ユーザー情報登録画面のHTML
	   */
//	  @RequestMapping("/user/update")
	  @PostMapping(value = "/user/" ,params="update")
	  public String update(TPUserForm form ,  Model model) {
		  
		  // 変更対象のIDを取得
		  TPUserForm editTpUserForm = new TPUserForm();
		  if(!StringUtils.isEmpty(form.getStrEditUserId())) {
			  // 
			  editTpUserForm.setIntUserId(Integer.parseInt(form.getStrEditUserId()));
			  // 
			  model.addAttribute("tpUserForm",editTpUserForm);
			  // 更新画面へ遷移
			  return "/user/store";			  
		  }else {
			  
		  }
		  return "/user/index";
	  }
	  
	  /**
	   * ユーザー情報一覧画面を表示
	   * @param model Model
	   * @return ユーザー情報一覧画面のHTML
	   */
	  @RequestMapping("/user/store")
	  public String store(TPUserForm form ,  Model model) {
		  
		  // 登録処理実施
		  userService.createUser(form);
		  
		  // リストを取得
		  // フォームを作成
		  TPUserForm tpUserForm = new TPUserForm();
		  // 初期値としてリストを取得
		  List<TPTUserEntity> userlist = userService.searchAllTUser();
		  // フォームに設定
		  tpUserForm.setTptUserEntityList(userlist);
		  // 画面のフォーム値をセット
		  model.addAttribute("tpUserForm",tpUserForm);
		  
		  return "/user/index";
	  }
}
