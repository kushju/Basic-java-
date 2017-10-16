class Len{
	public static void main(String[]args){
		System.out.println(average(22,34,56,78));

	}
	public static int average(int...num){
		int total=0;
		for(int x:num)
			total+=x;
		return total/num.length;
	}
}