package edu.cs157b.hibernate.hospital;

import javax.persistence.*;

@Entity
@Table(name="APPOINTMENTS")
public class Appointment 
{
	private String date;
	private String doctor;
	
	public Appointment(String date, String doctor)
	{
		this.date = date;
		this.doctor = doctor;
	}
	
	protected Appointment()
	{
		
	}
	
	@Id
	public String getDate()
	{
		return this.date;
	}
	
	public String getDoctor()
	{
		return this.doctor;
	}
	
	public void setDate(String date)
	{
		this.date = date;
	}
	
	public void setDoctor(String doctor)
	{
		this.doctor = doctor;
	}
	
	public String toString()
	{ 
		return this.doctor + " " + this.date; 
	}
}
