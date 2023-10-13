import java.util.Scanner;
public class chineseZodiac {
public static void main(String[] args) {
	System.out.print("Doğum yılınızı giriniz : ");
	Scanner sc=new Scanner(System.in);
	int year=sc.nextInt();
	 if(year%12==0) {
		System.out.print("Çin Zodyağı : Maymun");
	}
	 else if(year%12==1) {
			System.out.print("Çin Zodyağı : Horoz ");
		}
	 else if(year%12==2) {
			System.out.print("Çin Zodyağı : Köpek");
		}
	 else if(year%12==3) {
			System.out.print("Çin Zodyağı : Domuz ");
		}
	 else if(year%12==4) {
			System.out.print("Çin Zodyağı : Fare ");
		}
	 else if(year%12==5) {
			System.out.print("Çin Zodyağı : Öküz ");
		}
	 else if(year%12==6) {
			System.out.print("Çin Zodyağı : Kaplan ");
		}
	 else if(year%12==7) {
			System.out.print("Çin Zodyağı : Tavşan ");
		}
	 else if(year%12==8) {
			System.out.print("Çin Zodyağı : Ejderha ");
		}
	 else if(year%12==9) {
			System.out.print("Çin Zodyağı : Yılan ");
		}
	 else if(year%12==10) {
			System.out.print("Çin Zodyağı : At");
		}
	 else  {
			System.out.print("Çin Zodyağı : Koyun");
		}
}
}
