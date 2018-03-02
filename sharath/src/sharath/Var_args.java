package sharath;

public class Var_args {
	
	public static int M(int... a)
	{
	System.out.println("sharath");
return 10;
}
public static void main(String... args){
	M(23);
	M();
	M(12,23,123,3,4,4,4);
	
}
}