import java.util.Scanner;
public class even {
public static void main(String[] args) {
	System.out.print("Sayı : ");
	Scanner sc=new Scanner(System.in);
	int number=sc.nextInt();
	int counter=0;
	System.out.println("Çift sayılar");
	while(counter<=number) {
		if(counter%2==0) {
			System.out.print(counter+" ");
		}
		counter++;
	}
	counter=0;
	System.out.println("\n4'e veya 5'e tam bölünen sayılar. ");
	int counter4=0;int counter5=0;
	int collect4=0;int collect5=0;
	while(counter<=number) {
		if(counter%4==0) {collect4=collect4+counter;counter4++;
			System.out.print(counter+" ");
		}
		else if(counter%5==0) {
			System.out.print(counter+" ");
		}
		counter++;
	}
	System.out.print("\n 4'e bölünenlerin ortalaması "+(collect4/(counter4-1)));
	counter=0;
	while(counter<=number) {
		if(counter%5==0) {
			collect5=collect5+counter;counter5++;
			
		}counter++;
	}
	System.out.print("\n5'e tam bölünen sayıların ortalaması "+(collect5/(counter5-1)));
}
}
