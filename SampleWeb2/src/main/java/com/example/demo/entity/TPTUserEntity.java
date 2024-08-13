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
    @Column(name = "USERID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer userId;
    
    /**
     * ユーザー名
     */
    @Column(name = "USERNAME")
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
    @Column(name = "MAILADDRESS")
	private String mailAddress;
    
    
    /**
     * ログインID
     */
    @Column(name = "LOGINID")
	private String loginId;
    
    
    /**
     * パスワード
     */
    @Column(name = "PASSWORD")
	private String password;
    
    /**
     * 登録ユーザーID
     */
    @Column(name = "INSERTUSER")
	private Integer insertUser;
    
    /**
     * 登録日時
     */
    @Column(name = "INSERTDATE")
	private LocalDateTime insertDate;
    
    /**
     * 更新ユーザーID
     */
    @Column(name = "UPDATEUSER")
	private Integer updateUser;
    
    /**
     * 更新日時
     */
    @Column(name = "UPDATEDATE")
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
