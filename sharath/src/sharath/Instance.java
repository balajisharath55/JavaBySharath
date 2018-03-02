package sharath;

public class Instance {
	int i=10;
	{
		m1();
System.out.println("firxt instance block");
	}
	Instance(){
		
		System.out.println("constructor");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Instance i=new Instance();
System.out.println("main");
	}
	public void m1()
	{
		System.out.println(j);
	}
	{
		System.out.println("second instance block");
		
	}
	int j=20;
}
