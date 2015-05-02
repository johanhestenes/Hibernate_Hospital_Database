package edu.cs157b.hibernate.hospital;

import javax.persistence.*;

@Entity
@Table(name="PRESCRIPTIONS")
public class Prescription 
{
	private String date;
	private String medication;
	
	public Prescription(String date, String medication)
	{
		this.date = date;
		this.medication= medication;
	}
	
	protected Prescription()
	{
		
	}
	
	public String getDate()
	{
		return this.date;
	}
	
	@Id
	public String getMedication()
	{
		return this.medication;
	}
	
	public void setDate(String date)
	{
		this.date = date;
	}
	
	public void setMedication(String medication)
	{
		this.medication = medication;
	}
	
	public String toString()
	{ 
		return this.medication + " " + this.date; 
	}
}
