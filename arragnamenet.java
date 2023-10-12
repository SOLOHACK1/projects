import java.util.Scanner;
public class arragnamenet {
public static void main(String args[]) {
	System.out.println("1. sayı: ");
	Scanner sc=new Scanner(System.in);
	int firstNumber=sc.nextInt();
	System.out.println("2. sayı: ");
	int secondNumber=sc.nextInt();
	System.out.println("3.sayı :");
	int thirdNumber=sc.nextInt();
	if(firstNumber>secondNumber) {
		if(secondNumber>thirdNumber) {
			System.out.print(firstNumber+" > "+secondNumber+" > "+thirdNumber);
		}
		else {
			System.out.print(firstNumber+" > "+thirdNumber+" > "+secondNumber);
		}
	}
	else if(secondNumber>thirdNumber) {
		if(thirdNumber>firstNumber) {
			System.out.print(secondNumber+" > "+thirdNumber+" > "+firstNumber);
		}
		else {
			System.out.print(secondNumber+" > "+firstNumber+" > "+thirdNumber);
			}
	}
	else {
		if(firstNumber>secondNumber) {
			System.out.print(thirdNumber+" > "+firstNumber+" > "+secondNumber);
		}
		else {
			System.out.println(firstNumber+" > "+secondNumber+" >"+thirdNumber);
		}
	}
}
}
