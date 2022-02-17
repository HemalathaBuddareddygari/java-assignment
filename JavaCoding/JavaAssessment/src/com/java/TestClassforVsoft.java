package com.java;
import java.util.ArrayList;
import java.util.List;




public class TestClassforVsoft {
	public static void main(String[] args)
	{
		
		Developers d=new Developers("hema","BackendDeveloper","servicenow");	
		Developers d1=new Developers("shruthi","Tester","mulesoft");		
		Developers d2=new Developers("vikas","Support","mulesoft");		
		Developers d3=new Developers("palani","BackendDeveloper","servicenow");		
		Developers d4=new Developers("Anshu","Tester","javadevelopers");
		Developers d5=new Developers("Anshu","Tester","javadevelopers");		

		
		List<Developers> javadeveloperslist=new ArrayList<>();
		javadeveloperslist.add(d4);
		javadeveloperslist.add(d5);
		System.out.println(javadeveloperslist);
		List<Developers> mulesoftdeveloperslist=new ArrayList<>();
		
		mulesoftdeveloperslist.add(d1);
		mulesoftdeveloperslist.add(d2);
		System.out.println(mulesoftdeveloperslist);
		
		List<Developers> servicenowsoftdeveloperslist=new ArrayList<>();
		servicenowsoftdeveloperslist.add(d);
		servicenowsoftdeveloperslist.add(d3);
		System.out.println(servicenowsoftdeveloperslist);
		
	    Manager m1=new Manager();
		m1.setManagerName("Hema");
		m1.setDevelopers(servicenowsoftdeveloperslist);
		Manager m2=new Manager();
		m2.setManagerName("Reddy");
		m2.setDevelopers(mulesoftdeveloperslist);
		Manager m3=new Manager();
		m3.setManagerName("shruthi");
		m3.setDevelopers(javadeveloperslist);
		List<Manager> managerlist=new ArrayList<>();
		managerlist.add(m1);
		managerlist.add(m2);
		managerlist.add(m3);
		System.out.println(managerlist);
	
		President p=new President();
		p.setPresidentName("deepthi");
		p.setManagers(managerlist);
		System.out.println(p.getSumOfEmployees());
		
	}
}