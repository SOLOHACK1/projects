import java.util.Scanner;
public class facktorial {
public static void main(String[] args) {
	System.out.print("Faktöryel alıncak sayıyı giriniz. ");
	Scanner sc=new Scanner(System.in);
	int facktorial=sc.nextInt();
	int counter=1;
	int coefficient=1;
	while(counter<=facktorial) {
		coefficient=coefficient*counter;
		counter++;
	}
System.out.print("Faktöryel :"+coefficient);
}
}
