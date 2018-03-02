package sharath;
class Gen<T>{
	T ob;
	Gen(T ob){
		
		this.ob=ob;
		
	}
	public void show(){
		System.out.println("The type of ob"+ob.getClass().getName());
	}
	public T getOb(){
		return ob;
	}
}
public class Default {

	public static void main(String[] args) {
		Gen<String> g1=new Gen<String>("durga");
		// TODO Auto-generated method stub
		g1.show();
		System.out.println(g1.getOb());

	}

}
