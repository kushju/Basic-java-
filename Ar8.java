    import java.util.Arrays;
    public class Ar8{
	public static void main(String []args){
		int []myarray = {1,22,33,4,9,98,97,22,32,67,78,87};
		int ip =3; 
		int i;
		System.out.println("original array  " + Arrays.toString(myarray));
  for(i=ip;i<myarray.length-1;i++){
  	myarray[i]=myarray[i+1];
}
System.out.println("new array:  " + Arrays.toString(myarray));
	}
		    }
		 	
		    
	

