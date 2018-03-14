package sharathText;
enum Status{
	UNEMPLOYED,
	EMPLOYED,
	SELF_EMPLOYED,
	PROFESSIONAL,
	OTHER;
}

public class Program_on_enum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Status s=Status.SELF_EMPLOYED;
		switch(s){
		case UNEMPLOYED:System.out.println("This is an unemployed person");
		break;
		case EMPLOYED:System.out.println("This is an employed person");
		break;
		case SELF_EMPLOYED:System.out.println("This is an self_employed person");
		break;
		case PROFESSIONAL:System.out.println("This is an professional person");
		break;
		case OTHER:System.out.println("This is an other person");
		break;
			
		}

	}

}
