import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    int s;
	    Scanner sc=new Scanner(System.in);
	    System.out.println("Enter a number: ");
	    s=sc.nextInt();
	    while(s!=1)
	    {
	        if (s % 2 == 0)
                s /= 2;
            else if (s % 3 == 0)
                s /= 3;
            else if (s % 5 == 0)
                s /= 5;    
            else{
                System.out.println("Not an Ugly number");
                break;
            }
	    }
	    if(s==1){
	        System.out.println("ugly number");
	    }
	    
	}
}
