package com.mybatis.entity;

import java.sql.Timestamp;

public class MediaSiteEntity{

	private	Integer	msid;
	private	String	siteName;
	private	String	domain;
	private	Integer	mediaType;
	private	Timestamp	lastModify;
	public	Integer	getMsid(){
		return	msid;
	}
	public	String	getSiteName(){
		return	siteName;
	}
	public	String	getDomain(){
		return	domain;
	}
	public	Integer	getMediaType(){
		return	mediaType;
	}
	public	Timestamp	getLastModify(){
		return	lastModify;
	}
	public void	setMsid(Integer msid){
		this.msid = msid;
	}
	public void	setSiteName(String siteName){
		this.siteName = siteName;
	}
	public void	setDomain(String domain){
		this.domain = domain;
	}
	public void	setMediaType(Integer mediaType){
		this.mediaType = mediaType;
	}
	public void	setLastModify(Timestamp lastModify){
		this.lastModify = lastModify;
	}
	public	MediaSiteEntity(){
		super();
	}
	public MediaSiteEntity(Integer msid,String siteName,String domain,Integer mediaType,Timestamp lastModify){
		super();
		this.msid = msid;
		this.siteName = siteName;
		this.domain = domain;
		this.mediaType = mediaType;
		this.lastModify = lastModify;
	}
}