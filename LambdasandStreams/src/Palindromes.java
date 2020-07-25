import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.function.Function;

public class Palindromes {
	public static<T, R> List<R> map(List<T> list, Function<T, R> func) {
		List<R> result = new ArrayList<>();
		for (T i : list) {
			if(func.apply(i) != "1")
				result.add(func.apply(i));
		}
		return result;
}
	
	public static String isPalindrome(String original) {
	    String rev = "";
	    StringBuffer org=new StringBuffer(original);
	    rev=org.reverse().toString();
	    
	  
	    	if (original.equals(rev))  
	        	return original;
	      	else 
	      		return "1";
	}   

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("enter size of array");
		int size = sc.nextInt();
		List<String> array = new ArrayList<String>(size);
		for(int i = 0; i < size; i++) {
			System.out.println("Enter the valid string:");
			String n = sc.next();
			array.add(n);
        }
		List<String> resultlist = Palindromes.map(array,Palindromes::isPalindrome);
	    System.out.println("The palindrome strings is/are:");
		for(String obj : resultlist)  
	   		System.out.println(obj);  
	    sc.close();  
	}
}
