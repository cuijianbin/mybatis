package com.mybatis.service.impl;

import com.mybatis.service.AttentionSiteCategoryRelationService;

import com.mybatis.entity.AttentionSiteCategoryRelationEntity;

import com.mybatis.mapper.AttentionSiteCategoryRelationDao;

import java.util.List;

public class AttentionSiteCategoryRelationServiceImpl	implements AttentionSiteCategoryRelationService{

	private AttentionSiteCategoryRelationDao	AttentionSiteCategoryRelationDao;

	public AttentionSiteCategoryRelationDao getAttentionSiteCategoryRelationDao(){
		return	AttentionSiteCategoryRelationDao;
	}

	public AttentionSiteCategoryRelationDao setAttentionSiteCategoryRelationDao(AttentionSiteCategoryRelationDao AttentionSiteCategoryRelationDao){
		return this.AttentionSiteCategoryRelationDao=AttentionSiteCategoryRelationDao;
	}

	//添加一条完整记录
	public int insertRecord(AttentionSiteCategoryRelationEntity record){
		return	AttentionSiteCategoryRelationDao.insertRecord(record);
	}

	//添加指定列的数据
	public int insertSelective(AttentionSiteCategoryRelationEntity record){
		return	AttentionSiteCategoryRelationDao.insertSelective(record);
	}

	//通过Id(主键)删除一条记录
	public int deleteById(Integer id){
		return	AttentionSiteCategoryRelationDao.deleteById(id);
	}

	//按Id(主键)修改指定列的值
	public int updateByIdSelective(AttentionSiteCategoryRelationEntity record){
		return	AttentionSiteCategoryRelationDao.updateByIdSelective(record);
	}

	//按Id(主键)修改指定列的值
	public int updateById(AttentionSiteCategoryRelationEntity record){
		return	AttentionSiteCategoryRelationDao.updateById(record);
	}

	//计算表中的总记录数
	public int countRecord(){
		return	AttentionSiteCategoryRelationDao.countRecord();
	}

	//根据条件计算记录条数
	public int countSelective(AttentionSiteCategoryRelationEntity record){
		return	AttentionSiteCategoryRelationDao.countSelective(record);
	}

	//获得表中的最大Id
	public int maxId(){
		return	AttentionSiteCategoryRelationDao.maxId();
	}

	//通过Id(主键)查询一条记录
	public	AttentionSiteCategoryRelationEntity	selectById(Integer	id){
		return	AttentionSiteCategoryRelationDao.selectById(id);
	}

	//查询所有记录
	public List selectAll(){
		return	AttentionSiteCategoryRelationDao.selectAll();
	}


}