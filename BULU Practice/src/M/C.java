package M;

public class C {
    public static void main(String[] args) {
    	String str="woj",rev="";
    	int length=str.length();
    	for (int i=str.length()-1;i>=0;i--) {
    		rev=rev+str.charAt(i);
    		
    	}
    	if (str.equals(rev)) {
    		System.out.println("Palindrome");
    	}else {
    		System.out.println("Not a palindrome");
    	}
	}
    
}
