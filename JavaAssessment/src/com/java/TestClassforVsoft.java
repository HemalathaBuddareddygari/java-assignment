package com.java;
import java.util.*;

public class TestClassforVsoft {
	public static void main(String[] args)
	{
		
		Developer d=new Developer();
		d.setDepartment("mulesoft");
		d.setDepartment("azure");
		d.setDepartment("zora");
		System.out.println(d);
		
	Developer d1=new Developer();
	d1.setName("hema");
	d1.setName("nani");
	d1.setName("chinna");
	d1.setName("Ashri");
	d1.setName("Snigdha");
	System.out.println(d1);

	}	public int getSumofDevelopers()
	{
		int totalDevelopers=0;
		List<Developer> developers = null;
		for(Developer devops: developers)
		{
			totalDevelopers++;
		}
		return totalDevelopers;
	
			
	}
}