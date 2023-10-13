import java.util.Scanner;
public class extraYear {
public static void main(String[] args) {
	System.out.print("Bir yıl Giriniz :");
	Scanner sc=new Scanner(System.in);
	int year=sc.nextInt();
	if(year%100==0) {
		if(year%400==0) {
			System.out.print(year+" yılı artık yıldır. ");
		}
		else {
			System.out.print(year +" yılı artık yıl değildir. ");
		}
	}
	else {
		if(year%4==0) {
			System.out.print(year +" yılı artık yıldır.");
		}
		else {
			System.out.print(year+" yılı artık yıl değildir. ");
		}
	}
}

}
