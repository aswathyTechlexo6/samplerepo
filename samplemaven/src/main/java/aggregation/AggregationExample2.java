package aggregation;

public class AggregationExample2 {
	
	String City;
	String State;
	AggregationExample1 ref;//Aggregation
	public AggregationExample2(String City,String State,AggregationExample1 ref)
	{
		this.City=City;
		this.State=State;
		this.ref=ref;
	}
	public void display()
	{
		System.out.println(City+State);
		System.out.println(ref.name+ref.Age+ref.rollno);
	}
	public static void main(String[] args) {
		AggregationExample1 obj1=new AggregationExample1("Aswathy",30,10);
		AggregationExample2 obj=new AggregationExample2("Palakkad","Kerala",obj1);
		obj.display();
		
		
	}

}
