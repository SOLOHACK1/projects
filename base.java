import java.util.Scanner;
public class base {
public static void main(String[] args) {
	System.out.print("Taban sayısı : ");
	Scanner sc=new Scanner(System.in);
	int base=sc.nextInt();
	System.out.print("Üs : ");
	int exponent=sc.nextInt();
	int extraBase=base;
	int counter=1;
	while(counter<exponent) {
		base=base*extraBase;
		counter++;
	}
System.out.print(base);
}
}
