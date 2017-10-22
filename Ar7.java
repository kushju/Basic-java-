    import java.util.Arrays;
    public class Ar7{
	public static void main(String []args){
		int []myarray = {1,22,33,4,9,98,97};
		int ip =2;
		int v = 5; 
		int i;
		System.out.println("original array  " + Arrays.toString(myarray));
  for(i = myarray.length -1;i>ip;i--){
  	myarray[i]=myarray[i-1];
}
myarray[ip]= v;
System.out.println("new array:  " + Arrays.toString(myarray));
	}
		    }
		 	
		    
	

