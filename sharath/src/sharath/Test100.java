package sharath;



public class Test100 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
try
{
		System.out.println(10/0);
	}
		catch(ArithmeticException e ) {
			//e.printStackTrace();
			System.out.println(e.getMessage());
		}
	}
}


