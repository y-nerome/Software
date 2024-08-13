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
@Table(name = "t_bizreport")
public class TPTBizReportEntity {
	
	/**
	 * 業務報告書ID
	 */
	@Id
	@Column(name = "BIZREPORT_ID")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer bizreportId;
	
	/**
	 * ユーザーID
	 */
	@Column(name = "USER_ID")
	private Integer userId;
	
	/**
	 * 対象年
	 */
	@Column(name = "TARGET_YEAR")
	private String targetYear;
	
	/**
	 * 対象区分
	 */
	@Column(name = "TERM_KBN")
	private String termKbn;
	
	/**
	 * 管理No
	 */
	@Column(name ="kanri_no")
	private Integer kanriNo;
	
	/**
	 * 有効期限.開始日
	 */
	@Column(name = "ST_DATE")
	private String stDate;
	
	/**
	 * 有効期限.終了日
	 */
	@Column(name = "END_DATE")
	private String endDate;
	
	/**
	 * 業務報告書.業務内容
	 */
	@Column(name = "BIZ_DESCRIPTION")
	private String bizDescription;
	
	/**
	 * 業務報告書.所在地
	 */
	@Column(name = "BIZ_LOCATION")
	private String bizLocation;
	
	/**
	 * 業務報告書.使用言語
	 */
	@Column(name = "BIZ_USE_SKILL")
	private String bizUseSkill;
	
	/**
	 * 業務報告書.使用機種
	 */
	@Column(name = "BIZ_USE_MODEL")
	private String bizUseModel;
	
	/**
	 * 業務報告書.使用DB
	 */
	@Column(name = "BIZ_USE_DB")
	private String bizUseDb;
	
	/**
	 * 業務報告書.使用OS
	 */
	@Column(name = "BIZ_USE_OS")
	private String bizUseOs;
	
	/**
	 * 業務報告書.使用ツール
	 */
	@Column(name = "BIZ_USE_TOOL")
	private String bizUseTool;
	
	/**
	 * 業務報告書.プロジェクトメンバー(人数)
	 */
	@Column(name = "BIZ_PRO_MEMBER")
	private String bizProMember;
	
	/**
	 * 業務報告書.プロジェクトTPIメンバー(人数)
	 */
	@Column(name = "BIZ_TPR_MEMBER")
	private String bizTprMember;
	
	/**
	 * 業務報告書.役割
	 */
	@Column(name = "BIZ_POSITION")
	private String bizPosition;
	
	/**
	 * 業務報告書.テクニカルスキル設定値
	 */
	@Column(name = "TECHNICAL_GOAL_CD")
	private String technicalGoalCd;
	
	/**
	 * 業務報告書.テクニカル目標1
	 */
	@Column(name = "TECHNICAL_GOAL1")
	private String technicalGoal1;
	
	/**
	 * 業務報告書.テクニカル目標2
	 */
	@Column(name = "TECHNICAL_GOAL2")
	private String technicalGoal2;
	
	/**
	 * 業務報告書.現場業務目標1
	 */
	@Column(name = "ONSITE_GOAL1")
	private String onsiteGoal1;
	
	/**
	 * 業務報告書.現場業務目標2
	 */
	@Column(name = "ONSITE_GOAL2")
	private String onsiteGoal2;
	
	/**
	 * 業務報告書.単価(現在)
	 */
	@Column(name = "UNIT_PRICE")
	private String unitPrice;
	
	/**
	 * 業務報告書.目標単価(現在)
	 */
	@Column(name = "TARGET_UNIT_PRICE")
	private String targetUnitPrice;
	
	/**
	 * 業務報告書.目標資格1
	 */
	@Column(name = "TARGET_SKILL1")
	private String targetSkill1;
	
	/**
	 * 業務報告書.目標資格期限1
	 */
	@Column(name = "TARGET_DATE1")
	private Date targetDate1;
	
	/**
	 * 業務報告書.目標資格計画1
	 */
	@Column(name = "TARGET_PLAN1")
	private String targetPlan1;
	
	/**
	 * 業務報告書.目標資格2
	 */
	@Column(name = "TARGET_SKILL2")
	private String targetSkill2;
	
	/**
	 * 業務報告書.目標資格期限2
	 */
	@Column(name = "TARGET_DATE2")
	private Date targetDate2;
	
	/**
	 * 業務報告書.目標資格計画2
	 */
	@Column(name = "TARGET_PLAN2")
	private String targetPlan2;
	
	/**
	 * 登録ユーザーID
	 */
	@Column(name = "INSERT_USER")
	private String insertUser;
	
	/**
	 * 登録日時
	 */
	@Column(name = "INSERT_DATE")
	private LocalDateTime insertDate;
	
	/**
	 * 更新ユーザーID
	 */
	@Column(name = "UPDATE_USER")
	private String updateUser;
	
	/**
	 * 更新日時
	 */
	@Column(name = "UPDATE_DATE")
	private LocalDateTime updateDate;
	
	/**
	 * 更新カウント
	 */
	@Column(name = "UP_CNT")
	private Integer upCnt;
	
	/**
	 * 論理削除フラグ
	 */
	@Column(name = "DEL_FLG")
	private String delFlg;

}
