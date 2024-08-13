package com.example.demo.form;

import java.util.List;

import com.example.demo.entity.TPTUserEntity;

import lombok.Data;

@Data
public class TPUserForm {
	
	/**
	 * ユーザーID
	 */
	private Integer intUserId;
    
    /**
     * ユーザー名
     */
	private String strUserName;
    
    /**
     * 性別
     */
	private String strSex;
    
    /**
     * 誕生日
     */
	private String strBirthDay;
    
    /**
     * メールアドレス
     */
	private String strMailAddress;
    
    
    /**
     * ログインID
     */
	private String strLoginId;
    
    
    /**
     * パスワード
     */
	private String strPassword;
	
	/**
	 * 変更対象のユーザーID
	 */
	private String strEditUserId;
	
	/**
	 * 検索結果
	 */
	private List<TPTUserEntity> tptUserEntityList;

}
