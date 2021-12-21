import java.util.*;
public class Main
{
	public static void main(String[] args) 
    {
	    Scanner sc=new Scanner(System.in);
        String s;
	    StringBuffer str=new StringBuffer();
	    System.out.println("Enter a string:");
	    s=sc.nextLine();
        str.append(s);
        StringBuffer s1=str;
        s1.reverse();
        String s4=s1.toString();
        if(s.equals(s4)){
            System.out.println("\nPalindrome");
        }
        else{
            System.out.println("\nnot a Palindrome");
        }
        
	}
}
