package com.java;

import java.util.List;

import A.com.Developers;

public class President{
	private String PresidentName;
	private List<Manager> managers;
	public String getPresidentName() {
		return PresidentName;
	}
	public void setPresidentName(String presidentName) {
		PresidentName = presidentName;
	}
	public List<Manager> getManagers() {
		return managers;
	}
	public void setManagers(List<Manager> managers)
	{
		this.managers = managers;
	}
	//public List<Developer> getDevelopers() {
	//	return developers;
	//}
	//public void setDevelopers(List<Developer> developers) {
		//this.developers = developers;
	//}
	
	//public VSoft(String presidentName, List<Manager> managers, List<Developer> developers) {
		//super();
		//PresidentName = presidentName;
	//	this.managers = managers;
		//this.developers = developers;
	public int getSumOfEmployees()
	{
		
	int totalcount=0;
	
	List<Developers> developers;
	for(Manager m:managers)
	{
		developers=m.getDevelopers();
		
	}
	return totalcount;
	
	}	}
	
	
	

