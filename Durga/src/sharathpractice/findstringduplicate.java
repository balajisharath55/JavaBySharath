package sharathpractice;

public class findstringduplicate { 
public static void main(String[] args) { 
String str="kkttyyhjnu"; 
int count=0; 
for(int i=0;i<str.length();i++) 
{ 
for(int j=i+1;j<str.length();j++) 
{ 
if(str.charAt(i)==str.charAt(j)) 
{ 
System.out.print(str.charAt(j)); 
count++; 
} 
} 
} 
}
}
