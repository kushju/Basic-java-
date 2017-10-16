import java.util.Random;
class Spp{
	public static void main(String[]args){
		Random dice = new Random();
		int num;

		for(int counter=1;counter<=30;counter++){
			num = 1 + dice.nextInt(6);
			System.out.println(num + "");
		}
	}
}
