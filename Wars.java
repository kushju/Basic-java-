import java.util.scanner
class Bay{
	public static void main(String[] args){

		Scanner input= new scanner(system.in);
		int grade;
		int total=0;
		int average;
		int counter=0;
		while(counter<10){
			grade =input.nextInt();
			total = total + grade;
			counter++;

		}
		average=total/10;
		system.out.println("your average is" + average);
	}
}