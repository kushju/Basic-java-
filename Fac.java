    import java.util.Scanner;
    public class Fac{
	public static void main(String []args){
	Scanner in = new Scanner(System.in);
	int r,i;
	System.out.println("enter the range :  ");
	r=in.nextInt();
    int n1 = 0;
    int n2 =1 ;
    int n3;
    System.out.print(n1 + n2 + " ");
    for(i=0;i<r;i++){
    	n3 = n1 + n2;
    	System.out.print(" " + n3 + " ");
    	n1=n2;
    	n2=n3;
    }

}
	}	
		
	
	
		 	
		    
	

