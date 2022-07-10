package com.toy.Dto;

public class ToyDto {
	private int no;
	private String name;
	private String gender;
	private String type;
	private int hit;
	public ToyDto() {
		super();
		// TODO Auto-generated constructor stub
	}
	public ToyDto(int no, String name, String gender, String type, int hit) {
		super();
		this.no = no;
		this.name = name;
		this.gender = gender;
		this.type = type;
		this.hit = hit;
	}
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public int getHit() {
		return hit;
	}
	public void setHit(int hit) {
		this.hit = hit;
	}
	
	
}
