package session7_assignment3;
import java.util.Arrays;
import java.util.Scanner;
public class SubStringOne {

	/* program to find a substring in a String without using an inbuilt 
	   method of String class for the same.*/
	
		public static void main(String[] args) {
			/*scanner class object is used to take a string
			  and a sub-string as input form user*/
			Scanner in = new Scanner(System.in);
			System.out.println("Enter the main string: ");
			String s =in.nextLine();
			System.out.println("Enter sub string to be find: ");
		    String s1 = in.nextLine();
		    char[] strArr = s.toCharArray();
		    char[] subArr = s1.toCharArray();
		    /*passing array of string in an inbuilt method as argument
		      to check the present sub-string in the given string*/
		    if(isPresent(subArr, strArr)){
		    	System.out.println("Sub string present in main string");
		    }
		    else{
		    	System.out.println("Substring not found!!");
		    }
		    in.close();
		}
		//method to check the present of of sub-string in the given string 
	public static boolean isPresent(char[] sub, char[] str) {
	    for (int i = 0; i < str.length - sub.length+1; i++) {
	        for (int j = 0; j < sub.length; j++) {
	            if (str[i + j] == sub[j]) {
	                
	                    return true;
	                
	            } else {
	                break;
	            }
	        }
	    }
	    return false;
	}
	}