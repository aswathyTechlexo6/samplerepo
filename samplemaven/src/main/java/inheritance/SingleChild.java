package inheritance;

public class SingleChild extends SingleParent {
	
	public void show()
	{
		System.out.println("This is the Child Class");
	}
	public static void main(String[] args) {
		
		SingleChild obj=new SingleChild();
		obj.display();
		obj.show();
	}
	

}
