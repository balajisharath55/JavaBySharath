package sharath;

class Bas{
static int i=10;
static 
{
	M2();
	System.out.println("base method");
}

public static void main(String[] args) {
	// TODO Auto-generated method stub
	M2();
	System.out.println("base main method");

}
public static void M2(){
	System.out.println(j);
}
static int j=20;
}

public class Tez extends Bas {
	static int x=100;
	static 
	{
		M1();
		System.out.println("derived method");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		M1();
		System.out.println("derived main method");

	}
	public static void M1(){
		System.out.println(y);
	}
	static 
	{
		
		System.out.println("derived second method");
	}
static int y=200;
}
