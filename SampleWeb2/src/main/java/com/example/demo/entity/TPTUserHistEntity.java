package com.example.demo.entity;

import java.time.LocalDateTime;
import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name = "t_user_hist")
public class TPTUserHistEntity {
	
	/**
	 * コンストラクタ
	 */
	public TPTUserHistEntity() {
		
		
	}

	/**
	 * ユーザーID
	 */
    @Id
    @Column(name = "USER_ID")
	private Integer USER_ID;
    
    /**
     * ユーザー履歴
     */
    @Column(name = "HIST_NO")
	private Integer HIST_NO;
    
    /**
     * ユーザー履歴開始日
     */
    @Column(name = "ST_DATE")
	private Date ST_DATE;
    
    /**
     * ユーザー履歴終了日
     */
    @Column(name = "END_DATE")
	private Date END_DATE;
    
    /**
     * 組織コード
     */
    @Column(name = "ORGANIZATION_CD")
	private String ORGANIZATION_CD;
    
    /**
     * 役職コード
     */
    @Column(name = "POST_CD")
	private String POST_CD;
    
    /**
     * 登録ユーザーID
     */
    @Column(name = "INSERT_USER")
	private Integer INSERT_USER;
    
    /**
     * 登録日時
     */
    @Column(name = "INSERT_DATE")
	private LocalDateTime INSERT_DATE;
    
    /**
     * 更新ユーザーID
     */
    @Column(name = "UPDATE_USER")
	private Integer UPDATE_USER;
    
    /**
     * 更新日時
     */
    @Column(name = "UPDATE_DATE")
	private LocalDateTime UPDATE_DATE;
    
    /**
     * 更新回数
     */
    @Column(name = "UPDATE_CNT")
	private Integer UPDATE_CNT;
    
    /**
     * 論理削除フラグ
     */
    @Column(name = "DEL_FLG")
	private String DEL_FLG;
}
