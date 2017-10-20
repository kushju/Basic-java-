import java.util.Scanner;
public class Dim{
	public static void main(String[] args){
		int i,j,r;
		    Scanner in = new Scanner(System.in);
		    System.out.println("enter the no. of rows::");
		    r=in.nextInt();
		    for(i=0;i<=r;i++){
			for(j=0;j<=r-i;j++)
			System.out.print(" ");
			for(j=1;j<+2*i-1;j++)
			System.out.print("k");
		    System.out.print("\n");
		    }
		    for(i=r-i;i>=1;i--){
			
			for(j=1;j<=r-i;j++)
				System.out.print(" ");
			for(j=1;j<=2*i-1;j++)
			System.out.print("k");
			System.out.print("\n");

		    }


		    }
		 	
		    }
	

