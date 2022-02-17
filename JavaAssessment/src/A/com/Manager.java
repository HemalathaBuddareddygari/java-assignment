package A.com;

public class Manager extends President
{
	 //Manager M[]=new Manager[8];

	//M=new Manager[] ;
	//M[0]=new Manager("name=hema","MD");
	//M[1]=new Manager("hari","");
	//M[2]=new Manager("harish","Cm");
	//M[3]=new Manager("hari","Pm");
	//M[4]=new Manager("harish","Cm");
	//M[5]=new Manager("hari","Pm");
	//M[6]=new Manager("harish","Cm");
	//M[7]=new Manager("hari","Pm");
	//M[8]=new Manager("harish","Cm");
	//M[0]=display();
//System.out.println("Displaying manager data :0");



public String name;
public String designation;
Manager(String name, String designation)
{

	this.name=name;
	this.designation=designation;

}
public void display1()
{
	 System.out.printf(name,designation);
}

Developers[] D =new Developers[8];
	D[0]=new Manager("name=hema","axzure");
	D[1]=new Manager("hari","  servicenow");
	D[2]=new Manager("harish","zora");
	D[3]=new Manager("hari","Zenddesk");
	D[4]=new Manager("harish","Zora");
	D[5]=new Manager("hari","Mulesoft");
	D[6]=new Manager("harish","mulesoft");
	D[7]=new Manager("hari","servicenow");
	D[8]=new Manager("harish","Azure");

}}