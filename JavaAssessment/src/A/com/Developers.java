package A.com;

public class Developers extends Manager {

	public String name;
	public String dept;
	public String designation;
	public String Teamname;
	
	public Developers(String name, String designation, String teamname) {
		super(name, designation);
		
		this.designation=designation;
		Teamname = teamname;
	}
	public void display1()
	{
		 System.out.printf(name,dept);
	}

}
