package com.mybatis.service.impl;

import com.mybatis.service.MultimediaSiteService;

import com.mybatis.entity.MultimediaSiteEntity;

import com.mybatis.mapper.MultimediaSiteDao;

import java.util.List;

public class MultimediaSiteServiceImpl	implements MultimediaSiteService{

	private MultimediaSiteDao	MultimediaSiteDao;

	public MultimediaSiteDao getMultimediaSiteDao(){
		return	MultimediaSiteDao;
	}

	public MultimediaSiteDao setMultimediaSiteDao(MultimediaSiteDao MultimediaSiteDao){
		return this.MultimediaSiteDao=MultimediaSiteDao;
	}

	//添加一条完整记录
	public int insertRecord(MultimediaSiteEntity record){
		return	MultimediaSiteDao.insertRecord(record);
	}

	//添加指定列的数据
	public int insertSelective(MultimediaSiteEntity record){
		return	MultimediaSiteDao.insertSelective(record);
	}

	//通过Id(主键)删除一条记录
	public int deleteById(Integer msid){
		return	MultimediaSiteDao.deleteById(msid);
	}

	//按Id(主键)修改指定列的值
	public int updateByIdSelective(MultimediaSiteEntity record){
		return	MultimediaSiteDao.updateByIdSelective(record);
	}

	//按Id(主键)修改指定列的值
	public int updateById(MultimediaSiteEntity record){
		return	MultimediaSiteDao.updateById(record);
	}

	//计算表中的总记录数
	public int countRecord(){
		return	MultimediaSiteDao.countRecord();
	}

	//根据条件计算记录条数
	public int countSelective(MultimediaSiteEntity record){
		return	MultimediaSiteDao.countSelective(record);
	}

	//获得表中的最大Id
	public int maxId(){
		return	MultimediaSiteDao.maxId();
	}

	//通过Id(主键)查询一条记录
	public	MultimediaSiteEntity	selectById(Integer	msid){
		return	MultimediaSiteDao.selectById(msid);
	}

	//查询所有记录
	public List selectAll(){
		return	MultimediaSiteDao.selectAll();
	}


}