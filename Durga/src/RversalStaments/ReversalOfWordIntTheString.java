package RversalStaments;

public class ReversalOfWordIntTheString {
	 public static StringBuilder sb;    
			
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str[] = "sharath is in bangalore".split(" ");        
	       String finalStr="";            
	       for(int i = str.length-1; i>= 0 ;i--)    
	       {                
	            finalStr += str[i]+" ";
	            finalStr.toString();
	            sb=new StringBuilder(finalStr);
	            sb.reverse();              
	      }         
	       System.out.print(sb);

	}

}
