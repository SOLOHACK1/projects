import java.util.Scanner;
public class force {
public static void main(String[] args) {
	System.out.print("N değeri");
	Scanner sc=new Scanner(System.in);
	int a=sc.nextInt();
	System.out.print("Sınır değeri giriniz. ");
	int k=sc.nextInt();
	int i=a;
	
	while(a<k) {
		System.out.println(a);
		a=a*i;
	}
}
}
