package com.mybatis.entity;

public class MultimediaTaskSiteRelationEntity{

	private	Integer	id;
	private	Integer	mtid;
	private	Integer	msid;
	public	Integer	getId(){
		return	id;
	}
	public	Integer	getMtid(){
		return	mtid;
	}
	public	Integer	getMsid(){
		return	msid;
	}
	public void	setId(Integer id){
		this.id = id;
	}
	public void	setMtid(Integer mtid){
		this.mtid = mtid;
	}
	public void	setMsid(Integer msid){
		this.msid = msid;
	}
	public	MultimediaTaskSiteRelationEntity(){
		super();
	}
	public MultimediaTaskSiteRelationEntity(Integer id,Integer mtid,Integer msid){
		super();
		this.id = id;
		this.mtid = mtid;
		this.msid = msid;
	}
}