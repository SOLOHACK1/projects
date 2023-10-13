import java.util.Scanner;
public class fibanocci {
public static void main(String[] args) {
	System.out.print("Kaçıncı fibanocci sayısı : ");
	Scanner sc=new Scanner(System.in);
	int rank=sc.nextInt();
	int firstNumber=0;
	int secondNumber=1;
	int thirdNumber=2;
	System.out.print(secondNumber+" ");
	int counter=1;
	while(counter<rank) {counter++;
		thirdNumber=firstNumber+secondNumber;
		System.out.print(thirdNumber+" ");
		firstNumber=secondNumber;
		secondNumber=thirdNumber;
	}
}
}
