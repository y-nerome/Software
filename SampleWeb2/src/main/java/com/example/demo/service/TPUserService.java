package com.example.demo.service;

import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.TPTUserEntity;
import com.example.demo.form.TPUserForm;
import com.example.demo.repository.TPTUserRepository;

import io.micrometer.common.util.StringUtils;
import jakarta.persistence.EntityManager;

/**
 * ユーザー情報 Service
 */
@Service
public class TPUserService {
    
    @Autowired
    TPTUserRepository tptUserRepository;
    
    @Autowired
    EntityManager entityManager;
    
    /**
     * 
     * @return List<TPTUserEntity> 
     */
    public List<TPTUserEntity> searchAllTUser(){
    	
    	return tptUserRepository.findAll();
    }
    
    /**
     * ユーザーIDをもとに検索
     * @param form
     * @return
     */
	@SuppressWarnings("unchecked")
	public List<TPTUserEntity> searchTuserByFormCondition(TPUserForm form){
    	
    	
    	String strSql = "";
    	strSql = "SELECT * FROM t_user WHERE 0 = 0 ";
    	// 検索条件：ユーザーID
    	if(!Objects.isNull(form.getIntUserId())) {
    		// 検索条件を追加
    		strSql += " And USERID = "+form.getIntUserId().toString()+" ";
    	}
    	// 検索条件：名前
    	if(!Objects.isNull(form.getStrUserName()) && !StringUtils.isEmpty(form.getStrUserName())) {
    		// 検索条件を追加
    		strSql += " And USERNAME like '%"+form.getStrUserName()+"%' ";
    	}
    	// 検索条件：性別
    	if(!Objects.isNull(form.getStrSex()) && !StringUtils.isEmpty(form.getStrSex())) {
    		// 検索条件を追加
    		strSql += " And SEX = '"+form.getStrSex()+"' ";
    	}
    	// 並びをつける
    	strSql += " ORDER BY USERID ";
    	
    	return entityManager.createNativeQuery(strSql, TPTUserEntity.class).getResultList();
    	
    }
    
    /**
     * ユーザー登録
     * @param form
     * @return result
     */
    public TPTUserEntity createUser(TPUserForm form) {
    	
    	TPTUserEntity entity = new TPTUserEntity();
    	
    	try {
        	entity.setUserName(form.getStrUserName());
        	entity.setSex(form.getStrSex());
        	if(!StringUtils.isEmpty(form.getStrBirthDay())) {
    			entity.setBirthday(new SimpleDateFormat("yyyymmdd").parse(form.getStrBirthDay().replace("-", "")));     		
        	}
        	entity.setMailAddress(form.getStrMailAddress());
        	entity.setLoginId(form.getStrLoginId());
        	entity.setPassword(form.getStrPassword());
        	entity.setInsertUser(0);
        	entity.setInsertDate(LocalDateTime.now());
        	entity.setUpdateUser(0);
        	entity.setUpdateDate(LocalDateTime.now());
        	entity.setUpCnt(0);
        	entity.setDelFlg("0");
        	return tptUserRepository.save(entity);
		} catch (Exception e) {
			// TODO 自動生成された catch ブロック
			e.printStackTrace();
			return null;
		}
    }
    
    /**
     * ユーザー更新
     * @param form
     * @return result
     */
    public TPTUserEntity updateUser(TPUserForm form) {
    	
		TPTUserEntity entity = new TPTUserEntity();
		
		try {
        	entity.setUserName(form.getStrUserName());
        	entity.setSex(form.getStrSex());
        	if(!StringUtils.isEmpty(form.getStrBirthDay())) {
    			entity.setBirthday(new SimpleDateFormat("yyyymmdd").parse(form.getStrBirthDay().replace("-", "")));     		
        	}
        	entity.setMailAddress(form.getStrMailAddress());
        	entity.setLoginId(form.getStrLoginId());
        	entity.setPassword(form.getStrPassword());
        	entity.setInsertUser(0);
        	entity.setInsertDate(LocalDateTime.now());
        	entity.setUpdateUser(0);
        	entity.setUpdateDate(LocalDateTime.now());
        	entity.setUpCnt(0);
        	entity.setDelFlg("0");
	    	return tptUserRepository.save(entity);
		} catch (Exception e) {
			// TODO 自動生成された catch ブロック
			e.printStackTrace();
			return null;
		}
    }
}
