package sharath;
import java.util.ArrayList;
public class Text2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ArrayList a1=new ArrayList<String>();
a1.add('A');
a1.add(34.5);
a1.add("sharath");
a1.add(null);
System.out.println(a1);
System.out.println(a1.size());
System.out.println(a1.isEmpty());
System.out.println(a1.contains(34));

a1.clear();
System.out.println(a1.isEmpty());
	}

}
