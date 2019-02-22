package com.mybatis.service.impl;

import com.mybatis.service.MultimediaTaskService;

import com.mybatis.entity.MultimediaTaskEntity;

import com.mybatis.mapper.MultimediaTaskDao;

import java.util.List;

public class MultimediaTaskServiceImpl	implements MultimediaTaskService{

	private MultimediaTaskDao	MultimediaTaskDao;

	public MultimediaTaskDao getMultimediaTaskDao(){
		return	MultimediaTaskDao;
	}

	public MultimediaTaskDao setMultimediaTaskDao(MultimediaTaskDao MultimediaTaskDao){
		return this.MultimediaTaskDao=MultimediaTaskDao;
	}

	//添加一条完整记录
	public int insertRecord(MultimediaTaskEntity record){
		return	MultimediaTaskDao.insertRecord(record);
	}

	//添加指定列的数据
	public int insertSelective(MultimediaTaskEntity record){
		return	MultimediaTaskDao.insertSelective(record);
	}

	//通过Id(主键)删除一条记录
	public int deleteById(Integer mtid){
		return	MultimediaTaskDao.deleteById(mtid);
	}

	//按Id(主键)修改指定列的值
	public int updateByIdSelective(MultimediaTaskEntity record){
		return	MultimediaTaskDao.updateByIdSelective(record);
	}

	//按Id(主键)修改指定列的值
	public int updateById(MultimediaTaskEntity record){
		return	MultimediaTaskDao.updateById(record);
	}

	//计算表中的总记录数
	public int countRecord(){
		return	MultimediaTaskDao.countRecord();
	}

	//根据条件计算记录条数
	public int countSelective(MultimediaTaskEntity record){
		return	MultimediaTaskDao.countSelective(record);
	}

	//获得表中的最大Id
	public int maxId(){
		return	MultimediaTaskDao.maxId();
	}

	//通过Id(主键)查询一条记录
	public	MultimediaTaskEntity	selectById(Integer	mtid){
		return	MultimediaTaskDao.selectById(mtid);
	}

	//查询所有记录
	public List selectAll(){
		return	MultimediaTaskDao.selectAll();
	}


}