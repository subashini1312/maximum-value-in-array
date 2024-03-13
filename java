import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner in = new Scanner(System.in);
	      System.out.println("values are:");
	    int a = in.nextInt();
	    int [] n = new int[a];
	    int i;
	    for(i=0;i<a;i++){
	        n[i]=in.nextInt();
	    }
	    int maximum =0;
	    for(i=0;i<a;i++){
	        if(n[i]>maximum)
	        maximum = n[i];
	    }
		System.out.println("maximum value is :"+maximum);
	}
}
