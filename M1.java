 import java.util.Scanner;

public class M1 {
	public static void main(String []args){
		Scanner in = new Scanner(System.in);
		System.out.println("enter first no. :: ");
		double x = in.nextDouble();
		System.out.println("enter 2nd no. :: ");
		double y = in.nextDouble();
		System.out.println("enter 3rd no. :: ");
		double z = in.nextDouble();
		System.out.println("the smallest no. is ::  " + smallest(x,y,z) + " ");

	}
	public static double smallest(double x,double y , double z){
		return Math.min(Math.min(x,y),z);
	}
    }
	
	
		 	
		    
	

