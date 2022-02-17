package A.com;

public class Developers extends Manager {

	public String name;
	public String dept;
	Developers(String name, String dept)
	{

		this.name=name;
		this.dept=dept;

	}
	public void display1()
	{
		 System.out.printf(name,dept);
	}

}
