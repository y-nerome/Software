package com.example.demo.form;

import java.util.List;

import com.example.demo.entity.TPTBizReportEntity;

import lombok.Data;

@Data
public class TPBizReportForm {
	
	/**
	 * ユーザーID
	 */
	private Integer intUserId;
	
	/**
	 * 対象年月
	 */
	private String strTargetYear;
	
	/**
	 * 対象区分(前期/後期)
	 */
	private String strTermKbn;
	
	/**
	 * リスト(業務報告書)
	 */
	private List<TPTBizReportEntity> listTPTBizReportEntity;
	
	/**
	 * 選択業務報告書ID
	 */
	private String strEditBizreportId;

}
