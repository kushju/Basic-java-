    import java.util.Arrays;
    public class Ar9{
	public static void main(String []args){
		int []myarray = {1,22,33,4,9,98,97,22,32,67,78,87};
	int i,temp;	
	System.out.println("Array is ::" + Arrays.toString(myarray));
		for(i=0;i<myarray.length/2;i++){
			temp = myarray[i];
			myarray[i] = myarray[myarray.length - i - 1];
			myarray[myarray.length - i - 1]=temp;

		}
		System.out.println("reverse array :: " + Arrays.toString(myarray));		
	}
	}
		 	
		    
	

