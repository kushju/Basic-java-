    import java.util.Arrays;
    public class Ar10{
	public static void main(String []args){
		int []myarray = {1,22,22,33,4,98,98,97,44,3,7,77,88,7,2,67,78,1};
	int i,j;
	for(i=0;i<myarray.length-1;i++){
		for(j=i+1;j<myarray.length;j++){
			if((myarray[i] == myarray[j]) && (i!=j)){
				System.out.println("duplicate : " + myarray[j]);
			}
		}
	}	
		
	}
	}
		 	
		    
	

