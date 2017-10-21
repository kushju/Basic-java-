    import java.util.Scanner;
    public class Ar4{
	public static boolean contains(int []arr,int item){
		int i,n;
		for(i=0;i<arr.length;i++){
			if(item==arr[i]){
				return true;
			}
		}
       return false;
	}
	public static void main(String[] args) {
	 
	 int []arr1 = { 33,44,55,66,77,88,99,12};
	 System.out.println(contains(arr1,33));
	 System.out.println(contains(arr1,02));	
	}
                   
		    }
		 	
		    
	

