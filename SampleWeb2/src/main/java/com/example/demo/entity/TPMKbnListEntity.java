package com.example.demo.entity;

import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name = "m_kbn_list")
public class TPMKbnListEntity {
	
	/**
	 * 区分ID
	 */
    @Id
    @Column(name = "KBN_ID")
	private String KBN_ID;
    
	/**
	 * 区分ID連番
	 */
    @Column(name = "KBN_NO")
	private Integer KBN_NO;
    
    /**
     * 区分コード
     */
    @Column(name = "KBN_CD")
	private String KBN_CD;
    
    /**
     * 区分バリュー
     */
    @Column(name = "KBN_VALUE")
	private String KBN_VALUE;
    
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
