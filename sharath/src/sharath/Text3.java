package sharath;
import java.util.PriorityQueue;
import java.util.*;
public class Text3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Queue q1=new PriorityQueue();
q1.add(10);
q1.add(32);
q1.add(24);
q1.add(54);
System.out.println(q1.peek());
System.out.println(q1);
while(q1.peek()!=null){
	System.out.println(q1.poll());
}
	}

}
