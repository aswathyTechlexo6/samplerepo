package polymorphism;

public class PolymorphismChild extends PolymorphismParent {
	
	public void display(int a,int b)
	{
		int sum=a+b;
		System.out.println(sum);
		super.display(6, 3);
	}

	public static void main(String[] args) {
		
		PolymorphismChild obj =new PolymorphismChild();
		obj.display(5, 10);
	}

}
