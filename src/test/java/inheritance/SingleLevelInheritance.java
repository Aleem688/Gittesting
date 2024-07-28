package inheritance;


class Sample
{
	void print()
	{
		System.out.println("super class method");
	}
}


public class SingleLevelInheritance extends Sample {
	
	
	public void display()
	{
		System.out.println("sub class method");
	}

	public static void main(String[] args) {
		
	SingleLevelInheritance sl=new SingleLevelInheritance();
	
	sl.print();
	sl.display();
		
	}

}
