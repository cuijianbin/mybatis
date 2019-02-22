package com.mybatis.entity;

public class MediaEventKeywordsEntity{

	private	Integer	mkid;
	private	Integer	mtid;
	private	String	keywords;
	private	String	notKeywords;
	private	Short	deleted;
	public	Integer	getMkid(){
		return	mkid;
	}
	public	Integer	getMtid(){
		return	mtid;
	}
	public	String	getKeywords(){
		return	keywords;
	}
	public	String	getNotKeywords(){
		return	notKeywords;
	}
	public	Short	getDeleted(){
		return	deleted;
	}
	public void	setMkid(Integer mkid){
		this.mkid = mkid;
	}
	public void	setMtid(Integer mtid){
		this.mtid = mtid;
	}
	public void	setKeywords(String keywords){
		this.keywords = keywords;
	}
	public void	setNotKeywords(String notKeywords){
		this.notKeywords = notKeywords;
	}
	public void	setDeleted(Short deleted){
		this.deleted = deleted;
	}
	public	MediaEventKeywordsEntity(){
		super();
	}
	public MediaEventKeywordsEntity(Integer mkid,Integer mtid,String keywords,String notKeywords,Short deleted){
		super();
		this.mkid = mkid;
		this.mtid = mtid;
		this.keywords = keywords;
		this.notKeywords = notKeywords;
		this.deleted = deleted;
	}
}