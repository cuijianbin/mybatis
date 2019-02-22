package com.mybatis.entity;

import java.sql.Timestamp;

public class MultimediaSiteEntity{

	private	Integer	msid;
	private	String	msiteName;
	private	String	msiteDomain;
	private	Integer	msiteType;
	private	Timestamp	lastModify;
	public	Integer	getMsid(){
		return	msid;
	}
	public	String	getMsiteName(){
		return	msiteName;
	}
	public	String	getMsiteDomain(){
		return	msiteDomain;
	}
	public	Integer	getMsiteType(){
		return	msiteType;
	}
	public	Timestamp	getLastModify(){
		return	lastModify;
	}
	public void	setMsid(Integer msid){
		this.msid = msid;
	}
	public void	setMsiteName(String msiteName){
		this.msiteName = msiteName;
	}
	public void	setMsiteDomain(String msiteDomain){
		this.msiteDomain = msiteDomain;
	}
	public void	setMsiteType(Integer msiteType){
		this.msiteType = msiteType;
	}
	public void	setLastModify(Timestamp lastModify){
		this.lastModify = lastModify;
	}
	public	MultimediaSiteEntity(){
		super();
	}
	public MultimediaSiteEntity(Integer msid,String msiteName,String msiteDomain,Integer msiteType,Timestamp lastModify){
		super();
		this.msid = msid;
		this.msiteName = msiteName;
		this.msiteDomain = msiteDomain;
		this.msiteType = msiteType;
		this.lastModify = lastModify;
	}
}