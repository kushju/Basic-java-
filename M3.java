 import java.util.Scanner;

public class M3 {
    public static void main(String[] args) {
        	Scanner in = new Scanner(System.in);
        	System.out.println("input a string");
        	String str = in.nextLine();
        	System.out.println("the no. of vowels :  " + vowel(str) + "  " );
        	}

        	public static int vowel(String str){
        		
        		int count = 0;
        		int i ;
        		for(i=0;i<str.length();i++){
        		if(str.charAt(i)== 'a'||str.charAt(i)== 'e'||str.charAt(i)== 'i'||str.charAt(i)== 'o'||str.charAt(i)== 'u'){
        	count++;	
        		}
        		        	}
                 return count;
        	}
        }
		  
	

