package abstraction;

public class AbstractChild extends AbstractionParent {

	public static void main(String[] args) {
		
		AbstractChild obj=new AbstractChild();
		obj.display();
		obj.add();
	}

	@Override
	public void add() {
		
		int sum=5+4;
		System.out.println(sum);
	}

}
