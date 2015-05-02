package edu.cs157b.hibernate.hospital;

public class Person 
{
	private String name;
	
	public Person(String name)
	{
		this.name = name;
	}
	
	protected Person()
	{
		
	}
	
	public String getName()
	{
		return this.name;
	}
	
	public void setName(String name)
	{
		this.name = name;
	}
}
