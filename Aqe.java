import java.util.Scanner;
public class Aqe{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		int i , n;
		n= in.nextInt();
		for(i=0;i<n;i++){
			System.out.println("the no. is" + i + "the cuse is" + (i*i*i));
		}
	}

}