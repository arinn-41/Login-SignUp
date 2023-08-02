package com.Flipkart;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class dtodata 
{
	private String cname;
	private int cage;
	private String cadd;
	@Id
	private String cgmail;
	private long cphno;
	private String cpswd;
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public int getCage() {
		return cage;
	}
	public void setCage(int cage) {
		this.cage = cage;
	}
	public String getCadd() {
		return cadd;
	}
	public void setCadd(String cadd) {
		this.cadd = cadd;
	}
	public String getCgmail() {
		return cgmail;
	}
	public void setCgmail(String cgmail) {
		this.cgmail = cgmail;
	}
	public long getCphno() {
		return cphno;
	}
	public void setCphno(long cphno) {
		this.cphno = cphno;
	}
	public String getCpswd() {
		return cpswd;
	}
	public void setCpswd(String cpswd) {
		this.cpswd = cpswd;
	}
	
	

}
