import java.util.Scanner;
public class only {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int only;int collect=0;
	int counter;
	do {
		System.out.print("Sayı : ");
		only=sc.nextInt();
		if(only%2!=0) {
		collect=collect+only;
		}
	}while(only>=0);
	System.out.print("Toplam : "+collect);
}
}
