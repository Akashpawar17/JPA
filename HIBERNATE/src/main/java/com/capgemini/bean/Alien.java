package com.capgemini.bean;

//import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
//import javax.persistence.Table;

@Entity
//@Table(name="alien-table")

public class Alien {
	@Id
	
	private int aid;
	private AlienName aname;
	
	private String tech;
	public int getAid() {
		return aid;
	}
	public void setAid(int aid) {
		this.aid = aid;
	}


	public AlienName getAname() {
		return aname;
	}
	public void setAname(AlienName aname) {
		this.aname = aname;
	}
	public String getTech() {
		return tech;
	}
	public void setTech(String tech) {
		this.tech = tech;
	}
	@Override
	public String toString() {
		return "Alien [aid=" + aid + ", aname=" + aname + ", tech=" + tech + "]";
	}
	
	
	

}
