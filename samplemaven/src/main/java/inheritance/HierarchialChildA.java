package inheritance;

public class HierarchialChildA extends HierarchialParent {
	public void display2()
	{
		System.out.println("This is the Child A Class");
	}
	public static void main(String[] args) {
		HierarchialChildA obj=new HierarchialChildA();
		obj.display();
		obj.display2();

	}

}
