package com.mybatis.entity;

public class AttentionSiteCategoryRelationEntity{

	private	Integer	id;
	private	Integer	siteId;
	private	Integer	siteCateId;
	public	Integer	getId(){
		return	id;
	}
	public	Integer	getSiteId(){
		return	siteId;
	}
	public	Integer	getSiteCateId(){
		return	siteCateId;
	}
	public void	setId(Integer id){
		this.id = id;
	}
	public void	setSiteId(Integer siteId){
		this.siteId = siteId;
	}
	public void	setSiteCateId(Integer siteCateId){
		this.siteCateId = siteCateId;
	}
	public	AttentionSiteCategoryRelationEntity(){
		super();
	}
	public AttentionSiteCategoryRelationEntity(Integer id,Integer siteId,Integer siteCateId){
		super();
		this.id = id;
		this.siteId = siteId;
		this.siteCateId = siteCateId;
	}
}