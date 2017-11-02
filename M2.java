 import java.util.Scanner;

public class M2 {
    public static void main(String[] args) {
        	Scanner in = new Scanner(System.in);
        	System.out.println("input a string");
        	String str = in.nextLine();
        	System.out.println("the middle ch of string is :  " + middle(str) + "  " );
        	}

        	public static String middle(String str){
        		int length;
        		int position;
        		if(str.length() % 2 == 0){
        			position = str.length()/2 - 1;
        			length = 2;
        		}
        		else {
        			position=str.length() /2;

                   length=1;
        		}
        		return str.substring(position,position + length);
        	}
        }
		    
	

