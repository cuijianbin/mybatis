package com.mybatis.service.impl;

import com.mybatis.service.MediaSiteService;

import com.mybatis.entity.MediaSiteEntity;

import com.mybatis.mapper.MediaSiteDao;

import java.util.List;

public class MediaSiteServiceImpl	implements MediaSiteService{

	private MediaSiteDao	MediaSiteDao;

	public MediaSiteDao getMediaSiteDao(){
		return	MediaSiteDao;
	}

	public MediaSiteDao setMediaSiteDao(MediaSiteDao MediaSiteDao){
		return this.MediaSiteDao=MediaSiteDao;
	}

	//添加一条完整记录
	public int insertRecord(MediaSiteEntity record){
		return	MediaSiteDao.insertRecord(record);
	}

	//添加指定列的数据
	public int insertSelective(MediaSiteEntity record){
		return	MediaSiteDao.insertSelective(record);
	}

	//通过Id(主键)删除一条记录
	public int deleteById(Integer msid){
		return	MediaSiteDao.deleteById(msid);
	}

	//按Id(主键)修改指定列的值
	public int updateByIdSelective(MediaSiteEntity record){
		return	MediaSiteDao.updateByIdSelective(record);
	}

	//按Id(主键)修改指定列的值
	public int updateById(MediaSiteEntity record){
		return	MediaSiteDao.updateById(record);
	}

	//计算表中的总记录数
	public int countRecord(){
		return	MediaSiteDao.countRecord();
	}

	//根据条件计算记录条数
	public int countSelective(MediaSiteEntity record){
		return	MediaSiteDao.countSelective(record);
	}

	//获得表中的最大Id
	public int maxId(){
		return	MediaSiteDao.maxId();
	}

	//通过Id(主键)查询一条记录
	public	MediaSiteEntity	selectById(Integer	msid){
		return	MediaSiteDao.selectById(msid);
	}

	//查询所有记录
	public List selectAll(){
		return	MediaSiteDao.selectAll();
	}


}