package edu.cs157b.hibernate.hospital;

import javax.persistence.*;

@Entity
@Table(name="DOCTORS")
public class Doctor extends Person
{
	private String specialty;
	
	public Doctor(String name, String specialty) 
	{
		super(name);
		this.specialty = specialty;
	}
	
	protected Doctor()
	{
		
	}
	
	public String getSpecialty()
	{
		return this.specialty;
	}
	
	public void setSpecialty(String specialty)
	{
		this.specialty = specialty;
	}
	
	@Id
	public String getName()
	{
		return super.getName();
	}
	
	public String toString()
	{ 
		return super.getName() + " " + specialty; 
	}
}
