package com.example.demo.entity;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.Data;

@Data
@Embeddable
public class TPTBizReportEntityPK implements Serializable{
	
	@Column(name = "BIZREPORT_ID")
	private Integer bizreportId;
	
	@Column(name = "USER_ID")
	private Integer userId;
	
	@Column(name = "TARGET_YEAR")
	private String targetYear;
	
	@Column (name="term_kbn")
	private String termKbn;

}
