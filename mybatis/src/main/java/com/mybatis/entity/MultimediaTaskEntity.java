package com.mybatis.entity;

import java.sql.Timestamp;

import java.sql.Timestamp;

import java.sql.Timestamp;

public class MultimediaTaskEntity{

	private	Integer	mtid;
	private	String	msid;
	private	String	mtaskName;
	private	Timestamp	mstartTime;
	private	Timestamp	mendTime;
	private	String	keywords;
	private	Integer	userId;
	private	Timestamp	lastModify;
	public	Integer	getMtid(){
		return	mtid;
	}
	public	String	getMsid(){
		return	msid;
	}
	public	String	getMtaskName(){
		return	mtaskName;
	}
	public	Timestamp	getMstartTime(){
		return	mstartTime;
	}
	public	Timestamp	getMendTime(){
		return	mendTime;
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
	public void	setMtid(Integer mtid){
		this.mtid = mtid;
	}
	public void	setMsid(String msid){
		this.msid = msid;
	}
	public void	setMtaskName(String mtaskName){
		this.mtaskName = mtaskName;
	}
	public void	setMstartTime(Timestamp mstartTime){
		this.mstartTime = mstartTime;
	}
	public void	setMendTime(Timestamp mendTime){
		this.mendTime = mendTime;
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
	public	MultimediaTaskEntity(){
		super();
	}
	public MultimediaTaskEntity(Integer mtid,String msid,String mtaskName,Timestamp mstartTime,Timestamp mendTime,String keywords,Integer userId,Timestamp lastModify){
		super();
		this.mtid = mtid;
		this.msid = msid;
		this.mtaskName = mtaskName;
		this.mstartTime = mstartTime;
		this.mendTime = mendTime;
		this.keywords = keywords;
		this.userId = userId;
		this.lastModify = lastModify;
	}
}