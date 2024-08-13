package com.example.demo.entity;

import java.time.LocalDateTime;
import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name = "t_user")
public class TPTUserEntity {
	
	/**
	 * ユーザーID
	 */
    @Id
    @Column(name = "USER_ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer userId;
    
    /**
     * ユーザー名
     */
    @Column(name = "USER_NAME")
	private String userName;
    
    /**
     * 性別
     */
    @Column(name = "SEX")
	private String sex;
    
    /**
     * 誕生日
     */
    @Column(name = "BIRTHDAY")
	private Date birthday;
    
    /**
     * メールアドレス
     */
    @Column(name = "MAIL_ADDRESS")
	private String mailAddress;
    
    
    /**
     * ログインID
     */
    @Column(name = "LOGIN_ID")
	private String loginId;
    
    
    /**
     * パスワード
     */
    @Column(name = "PASSWORD")
	private String password;
    
    /**
     * 登録ユーザーID
     */
    @Column(name = "INSERT_USER")
	private Integer insertUser;
    
    /**
     * 登録日時
     */
    @Column(name = "INSERT_DATE")
	private LocalDateTime insertDate;
    
    /**
     * 更新ユーザーID
     */
    @Column(name = "UPDATE_USER")
	private Integer updateUser;
    
    /**
     * 更新日時
     */
    @Column(name = "UPDATE_DATE")
	private LocalDateTime updateDate;
    
    /**
     * 更新回数
     */
    @Column(name = "UPCNT")
	private Integer upCnt;
    
    /**
     * 論理削除フラグ
     */
    @Column(name = "DELFLG")
	private String delFlg;

}
