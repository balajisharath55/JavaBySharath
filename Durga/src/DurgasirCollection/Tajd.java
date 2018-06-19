package DurgasirCollection;
class Person
{
    void message()
    {
        System.out.println("This is person class");
    }
    void display() {
    	
    }
}
 
/* Subclass Student */
class Student extends Person
{
    void message()
    {
        System.out.println("This is student class");
    }
 
    // Note that display() is only in Student class
    void display()
    {
        // will invoke or call current class message() method
        message();
 
        // will invoke or call parent class message() method
        super.message();
    }
}
 


public class Tajd {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Person par=new Student();
		par.display();
	}

}
