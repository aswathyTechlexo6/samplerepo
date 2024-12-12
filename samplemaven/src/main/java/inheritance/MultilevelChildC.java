package inheritance;

public class MultilevelChildC extends MultilevelParentB {
	public void display3()
	{
		System.out.println("This is the Child C Class");
	}
	
	public static void main(String[] args) {
		MultilevelChildC obj=new MultilevelChildC();
		obj.display();
		obj.display2();
		obj.display3();

	}

}
