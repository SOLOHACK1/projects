import java.util.Scanner;
public class perfectNumber {
public static void main(String[] args) {
	System.out.print("Sayı : ");
	Scanner sc=new Scanner(System.in);
	int number=sc.nextInt();
	int collect=0,counter=1;
	while(counter<=number/2) {
		if(number%counter==0) {
			collect+=counter;
		}
		counter++;
		}
	if(collect==number) {
		System.out.print(number+" mükemmel sayıdır .");
	}
	else {
		System.out.print(number+" mükemmel sayı değildir .");
	}
}
}
