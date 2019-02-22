package com.mybatis.service.impl;

import com.mybatis.service.MultimediaKeywordsService;

import com.mybatis.entity.MultimediaKeywordsEntity;

import com.mybatis.mapper.MultimediaKeywordsDao;

import java.util.List;

public class MultimediaKeywordsServiceImpl	implements MultimediaKeywordsService{

	private MultimediaKeywordsDao	MultimediaKeywordsDao;

	public MultimediaKeywordsDao getMultimediaKeywordsDao(){
		return	MultimediaKeywordsDao;
	}

	public MultimediaKeywordsDao setMultimediaKeywordsDao(MultimediaKeywordsDao MultimediaKeywordsDao){
		return this.MultimediaKeywordsDao=MultimediaKeywordsDao;
	}

	//添加一条完整记录
	public int insertRecord(MultimediaKeywordsEntity record){
		return	MultimediaKeywordsDao.insertRecord(record);
	}

	//添加指定列的数据
	public int insertSelective(MultimediaKeywordsEntity record){
		return	MultimediaKeywordsDao.insertSelective(record);
	}

	//通过Id(主键)删除一条记录
	public int deleteById(Integer mkid){
		return	MultimediaKeywordsDao.deleteById(mkid);
	}

	//按Id(主键)修改指定列的值
	public int updateByIdSelective(MultimediaKeywordsEntity record){
		return	MultimediaKeywordsDao.updateByIdSelective(record);
	}

	//按Id(主键)修改指定列的值
	public int updateById(MultimediaKeywordsEntity record){
		return	MultimediaKeywordsDao.updateById(record);
	}

	//计算表中的总记录数
	public int countRecord(){
		return	MultimediaKeywordsDao.countRecord();
	}

	//根据条件计算记录条数
	public int countSelective(MultimediaKeywordsEntity record){
		return	MultimediaKeywordsDao.countSelective(record);
	}

	//获得表中的最大Id
	public int maxId(){
		return	MultimediaKeywordsDao.maxId();
	}

	//通过Id(主键)查询一条记录
	public	MultimediaKeywordsEntity	selectById(Integer	mkid){
		return	MultimediaKeywordsDao.selectById(mkid);
	}

	//查询所有记录
	public List selectAll(){
		return	MultimediaKeywordsDao.selectAll();
	}


}