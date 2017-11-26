import java.util.Scanner;
public class Ks{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		int a,b,i,array[];
		System.out.println("enter the no. of elements in array:: ");
		a=in.nextInt();
		array = new int[a];
		System.out.println("enter the " + a + " elements" );
		for(i=0;i<a;i++){
			array[a]=in.nextInt();

			System.out.println("no. to be searched :: ");
			b=in.nextInt();

			for(i=0;i<a;i++){
				if(array[a]==b){
					System.out.println("yes , item found at " + (i+1) +" position");
					break;
				}
			}

		}
	}
}