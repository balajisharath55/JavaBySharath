package DurgasirCollection;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
HashMap<Object, Object> m=new HashMap<>();
m.put("chiranjeevi", 700);
m.put("balaiah", 800);
m.put("nagarjuna", 200);
m.put("venkatesh", 500);
System.out.println(m);
System.out.println(m.put("chiranjeevi",1000));
Set s=m.keySet();
System.out.println(s);
Collection c=m.values();
System.out.println(c);
Set s1=m.entrySet();
System.out.println(s1);
Iterator itr=s1.iterator();
while(itr.hasNext())
{
	Map.Entry m1=(Map.Entry)itr.next();
	System.out.println(m1.getKey()+"____________"+m1.getValue());
	if(m1.getKey().equals("nagarjuna"))
	{
		m1.setValue(10000);
	}
}
System.out.println(m);
	


	}

}
