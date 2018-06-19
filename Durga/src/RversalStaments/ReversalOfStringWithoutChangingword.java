package RversalStaments;

public class ReversalOfStringWithoutChangingword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 String s = "sharath in the bangalore ";
		    StringBuffer sb = new StringBuffer();
		    int n = s.length();
		    int j =n;
		    int i;
		    for(i = n-1;i>=0;i--){
            if(s.charAt(i) == ' '){
		        	sb.append(s.substring(i+1, j));
		            sb.append(" ");
		            j = i;
		        }
		    }
		    sb.append(s.substring(0,j));
		    System.out.println(sb);
	}

}
