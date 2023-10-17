import java.util.Scanner;
public class primeNumber {
public static void main(String[] args) {
	System.out.print("Sayı : ");
	Scanner sc=new Scanner(System.in);
	int number=sc.nextInt();
	int counter=2;
	while(counter<=number/2) {
		if(number%counter==0) {
			System.out.print(number+" asal sayı değildir.");
			break;
		}counter++;
	}
	if(counter>number/2)
System.out.print(number +" asal sayıdır.");

}
}
