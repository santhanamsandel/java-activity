package activity;

public class Assign {
	
 int rollNum;
 String name;
 
 public void display()
 {
	 System.out.println(rollNum);
	 System.out.println(name);
 }
 
 

public static void main(String[] a)
{
	Assign assign=new Assign();
	assign.name="santhanam";
	assign.rollNum=5465;
	
	assign.display();

}
}