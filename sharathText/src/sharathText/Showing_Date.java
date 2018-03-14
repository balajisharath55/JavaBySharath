package sharathText;
import java.util.*;
public class Showing_Date {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date date=new Date();
		System.out.println(date.getDate()+"/"+(date.getMonth()+1)+"/"+(date.getYear()-100));
		System.out.println(date.toString());
		System.out.println(date.getHours()+":"+date.getMinutes()+":"+date.getSeconds());

	}

}
