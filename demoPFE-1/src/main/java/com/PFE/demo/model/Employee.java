package com.PFE.demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="employes")
public class Employee {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
   private long id;
	@Column(name="phoneNumber")
   private String NT;
	
	@Column(name="first_name")
   private String firstName;
	@Column(name="last_name")
   private String lastName;
	@Column(name="email")
   private String email;
	@Column(name="Hire_Date")
   private String HireDate;
	@Column(name="Date_naissance")
   private String birthday;
	@Column(name="CIN")
   private String cin;
	@Column(name="JOB")
   private String Job;
   @Column(name="Sexe")
   private String Sexe;
   @Column(name="Nationalitee")
   private String country;
   @Column(name="Salutation")
   private String Salutation;
   @Column(name="MaritalStatus")
   private String MaritalStatus;
   @Column(name="NationnalityIDe")
   private String NationnalityIDe;
   @Column(name="SocialSecurity")
   private String SocialSecurity;
   @Column(name="RetirmentID")
   private String RetirmentID;

	public String getSalutation() {
	return Salutation;
}

public void setSalutation(String salutation) {
	Salutation = salutation;
}

public String getMaritalStatus() {
	return MaritalStatus;
}

public void setMaritalStatus(String maritalStatus) {
	MaritalStatus = maritalStatus;
}

public String getNationnalityIDe() {
	return NationnalityIDe;
}

public void setNationnalityIDe(String nationnalityIDe) {
	NationnalityIDe = nationnalityIDe;
}

public String getSocialSecurity() {
	return SocialSecurity;
}

public void setSocialSecurity(String socialSecurity) {
	SocialSecurity = socialSecurity;
}

public String getRetirmentID() {
	return RetirmentID;
}

public void setRetirmentID(String retirmentID) {
	RetirmentID = retirmentID;
}

	public String getSexe() {
	return Sexe;
}

public void setSexe(String sexe) {
	Sexe = sexe;
}

public String getCountry() {
	return country;
}

public void setCountry(String country) {
	this.country = country;
}

	public String getNT() {
		return NT;
	}

	public void setNT(String nT) {
		NT = nT;
	}
    public String getJob() {
		return Job;
	}

	public void setJob(String job) {
		Job = job;
	}

	public Employee() {
	
}
	
	public String getCin() {
	return cin;
}
public void setCin(String cin) {
	this.cin = cin;
}
	public String getBirthday() {
		return birthday;
	}
	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}
	public String getHireDate() {
	return HireDate;
}
public void setHireDate(String hireDate) {
	HireDate = hireDate;
}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
}
   
