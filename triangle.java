import java.util.Scanner;
public class triangle {
public static void main(String[] args) {
	System.out.print("Katman Sayısı :");
	Scanner sc=new Scanner(System.in);
	int layer=sc.nextInt();
	int counterLong=1,counterHeigh=1,counterSpace=layer;
	
	while(counterHeigh<=layer) {
		while(counterSpace>counterHeigh) {counterSpace--;
			System.out.print(" ");
		}counterSpace=layer;
		
		while(counterLong<2*counterHeigh) {
			System.out.print("*");counterLong++;
		}counterLong=1;
		System.out.println();counterHeigh++;
	}
}
}
