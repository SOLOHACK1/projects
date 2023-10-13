import java.util.Scanner;
public class ebobAndEkok{
	public static void main(String[] args) {
		System.out.print("1.sayı : ");
		Scanner sc=new Scanner(System.in);
		int firstNumber=sc.nextInt();
		System.out.print("2. sayı : ");
		int secondNumber=sc.nextInt();
		int hiddenFirstNumber=firstNumber,hiddenSecondNumber=secondNumber;
		int counter=2;int ebob=1;
		if(firstNumber<secondNumber) {
			firstNumber=secondNumber+firstNumber;
			secondNumber=firstNumber-secondNumber;
			firstNumber=firstNumber-secondNumber;
		}
		int prime=2;
		while(firstNumber>=counter*2) {
			
			if(firstNumber%counter==0&&secondNumber%counter==0) {
				ebob=ebob*counter;
				firstNumber/=counter;
				secondNumber/=counter;
			}
			if(firstNumber%counter==0&&secondNumber%counter==0) {
				counter--;
			}
			counter++;
		}
		System.out.println("Ebob :"+ebob);
		int ekok=(hiddenFirstNumber*hiddenSecondNumber)/ebob;
		System.out.print("Ekok : "+ekok);
	}
}