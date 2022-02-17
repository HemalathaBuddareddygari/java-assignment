package com.java;

//import java.util.List;

public class Developers extends Manager{
	
	public Developers(String developerName,String Designatoion,String Teamname)
	{
		this.developername=developerName;
		this.designation=designation;
		this.teamName=Teamname;
	}
	//List<TechinicalDepartment> dept;
	String developername;
	public String getDevelopername() {
		return developername;
	}

	public void setDevelopername(String developername) {
		this.developername = developername;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public String getTeamName() {
		return teamName;
	}

	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}

	String designation;
	String teamName;
	
    	//public void Developer(List<TechinicalDepartment> dept) 
	    //{
	 	 //this.dept=dept;
	//}
	
	

	//public Developer(String presidentName, List<Manager> managers, List<Developer> developers, String designation,
			//	String department, List<TechinicalDepartment> dept) {
			//super(presidentName, managers, developers, designation, department);
			//this.dept = dept;
		

	//public  List<TechinicalDepartment> getDept() {
		//return dept;
//	}

//	public void setDept(List<TechinicalDepartment> dept) {
		//this.dept = dept;
	//}
	//public int getSumofDevelopers()
	{
	//	int totalDevelopers=0;
		//List<Developer> developers = null;
	//	for(Developer devops: developers)
		//{
		//	totalDevelopers++;
		//}
	//	return totalDevelopers;
		


}

		
		
	}
