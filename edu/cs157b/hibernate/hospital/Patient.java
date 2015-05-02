package edu.cs157b.hibernate.hospital;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="PATIENTS")
public class Patient extends Person
{
	private String DOB;

	protected Patient()
	{
		
	}
	
	public String getDOB()
	{
		return this.DOB;
	}
	
	public void setDOB(String DOB)
	{
		this.DOB = DOB;
	}
	
	@Id
	public String getName()
	{
		return super.getName();
	}
	
	public String toString()
	{ 
		return super.getName() + " " + DOB; 
	}
}
