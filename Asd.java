class Asd{
	public static void main(String[]args){
		int farray[][]={{1,2,3,4,4},{2,3,4,6,7}};
		int sarray[][]={{8,2,3,6,7},{9,8,7,6,1}};
		display(farray);
		display(sarray);

	}
	public static void display(int x[][]){
		for(int i=0;i<x.length;i++){
			for(int j=0;j<x[i].length;j++){
				System.out.print(x[i][j] + "      ");
			}
			System.out.println();
		}
	}
}
