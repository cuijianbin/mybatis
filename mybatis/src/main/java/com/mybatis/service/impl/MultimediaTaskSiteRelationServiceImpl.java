package com.mybatis.service.impl;

import com.mybatis.service.MultimediaTaskSiteRelationService;

import com.mybatis.entity.MultimediaTaskSiteRelationEntity;

import com.mybatis.mapper.MultimediaTaskSiteRelationDao;

import java.util.List;

public class MultimediaTaskSiteRelationServiceImpl	implements MultimediaTaskSiteRelationService{

	private MultimediaTaskSiteRelationDao	MultimediaTaskSiteRelationDao;

	public MultimediaTaskSiteRelationDao getMultimediaTaskSiteRelationDao(){
		return	MultimediaTaskSiteRelationDao;
	}

	public MultimediaTaskSiteRelationDao setMultimediaTaskSiteRelationDao(MultimediaTaskSiteRelationDao MultimediaTaskSiteRelationDao){
		return this.MultimediaTaskSiteRelationDao=MultimediaTaskSiteRelationDao;
	}

	//添加一条完整记录
	public int insertRecord(MultimediaTaskSiteRelationEntity record){
		return	MultimediaTaskSiteRelationDao.insertRecord(record);
	}

	//添加指定列的数据
	public int insertSelective(MultimediaTaskSiteRelationEntity record){
		return	MultimediaTaskSiteRelationDao.insertSelective(record);
	}

	//通过Id(主键)删除一条记录
	public int deleteById(Integer id){
		return	MultimediaTaskSiteRelationDao.deleteById(id);
	}

	//按Id(主键)修改指定列的值
	public int updateByIdSelective(MultimediaTaskSiteRelationEntity record){
		return	MultimediaTaskSiteRelationDao.updateByIdSelective(record);
	}

	//按Id(主键)修改指定列的值
	public int updateById(MultimediaTaskSiteRelationEntity record){
		return	MultimediaTaskSiteRelationDao.updateById(record);
	}

	//计算表中的总记录数
	public int countRecord(){
		return	MultimediaTaskSiteRelationDao.countRecord();
	}

	//根据条件计算记录条数
	public int countSelective(MultimediaTaskSiteRelationEntity record){
		return	MultimediaTaskSiteRelationDao.countSelective(record);
	}

	//获得表中的最大Id
	public int maxId(){
		return	MultimediaTaskSiteRelationDao.maxId();
	}

	//通过Id(主键)查询一条记录
	public	MultimediaTaskSiteRelationEntity	selectById(Integer	id){
		return	MultimediaTaskSiteRelationDao.selectById(id);
	}

	//查询所有记录
	public List selectAll(){
		return	MultimediaTaskSiteRelationDao.selectAll();
	}


}