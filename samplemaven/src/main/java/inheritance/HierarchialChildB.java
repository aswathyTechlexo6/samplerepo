package inheritance;

public class HierarchialChildB extends HierarchialParent {
	public void display3()
	{
		System.out.println("This is the Child B Class");
	}
	public static void main(String[] args) {
		
		HierarchialChildB obj=new HierarchialChildB();
		obj.display();
		obj.display3();
	}

}
