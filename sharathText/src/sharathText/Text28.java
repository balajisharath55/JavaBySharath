package sharathText;

public class Text28 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			String str1="wwws.samozan.scom";
			int loop;
			String[] arrstr1;
			arrstr1=str1.split("s");
			for(loop=0;loop<arrstr1.length;loop++)
			{
				System.out.println(arrstr1[loop]);
			}
		}
		catch(Exception ex){
			ex.printStackTrace();
		}

	}

}
