package com.mybatis.entity;

import java.sql.Timestamp;

import java.sql.Timestamp;

import java.sql.Timestamp;

public class MediaEventInfoEntity{

	private	Integer	meid;
	private	String	msid;
	private	String	name;
	private	Timestamp	startTime;
	private	Timestamp	endTime;
	private	String	keywords;
	private	Integer	userId;
	private	Timestamp	lastModify;
	public	Integer	getMeid(){
		return	meid;
	}
	public	String	getMsid(){
		return	msid;
	}
	public	String	getName(){
		return	name;
	}
	public	Timestamp	getStartTime(){
		return	startTime;
	}
	public	Timestamp	getEndTime(){
		return	endTime;
	}
	public	String	getKeywords(){
		return	keywords;
	}
	public	Integer	getUserId(){
		return	userId;
	}
	public	Timestamp	getLastModify(){
		return	lastModify;
	}
	public void	setMeid(Integer meid){
		this.meid = meid;
	}
	public void	setMsid(String msid){
		this.msid = msid;
	}
	public void	setName(String name){
		this.name = name;
	}
	public void	setStartTime(Timestamp startTime){
		this.startTime = startTime;
	}
	public void	setEndTime(Timestamp endTime){
		this.endTime = endTime;
	}
	public void	setKeywords(String keywords){
		this.keywords = keywords;
	}
	public void	setUserId(Integer userId){
		this.userId = userId;
	}
	public void	setLastModify(Timestamp lastModify){
		this.lastModify = lastModify;
	}
	public	MediaEventInfoEntity(){
		super();
	}
	public MediaEventInfoEntity(Integer meid,String msid,String name,Timestamp startTime,Timestamp endTime,String keywords,Integer userId,Timestamp lastModify){
		super();
		this.meid = meid;
		this.msid = msid;
		this.name = name;
		this.startTime = startTime;
		this.endTime = endTime;
		this.keywords = keywords;
		this.userId = userId;
		this.lastModify = lastModify;
	}
}