package com.java;

import java.util.List;

public class Manager extends President {
		
private	String managerName;
private List<com.java.Developers> developers;

public String getManagerName() {
	return managerName;
}
public void setManagerName(String managerName) {
	this.managerName = managerName;
}
public  List<com.java.Developers> getDevelopers() {
	return developers;
}
public void setDevelopers(List<com.java.Developers> servicenowsoftdeveloperslist) {
	this.developers = servicenowsoftdeveloperslist;
}
}
	/*public Manager(String presidentName, List<Manager> managers, List<Developer> developers, String designation,
			String department) {
		super(presidentName, managers, developers);
		Designation = designation;
		Department = department;
	}

	public String getDesignation() {
		return Designation;
	}

	public void setDesignation(String designation) {
		Designation = designation;
	}

	public String getDepartment() {
		return Department;
	}

	public void setDepartment(String department) {
		Department = department;
	}

	String Department;
	//public void Manager(String  designation, String department) 

	//{
		//this.Department=department;
	//     this.Designation=designation;
		
	public Manager()
	{
		
	}

	public int getSumofManagers()
	{
		int totalcount=0;
List<Manager> managers;
		for(Manager m: managers)
			
		{
			developers=m.getDevelopers();
			for(Developers dev:developers)
			{
			
			totalcount++;
		}
		return totalcount;
		
	}

	//public List<Developer> getDevelopers() {
		// TODO Auto-generated method stub
		//return null;
	}
}*/

