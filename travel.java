import java.util.Scanner;
public class travel {
public static void main(String[] args) {
	
	Scanner sc=new Scanner(System.in);
	int travelerAge;
	String ticketType;
	
	do {
		System.out.print("Yaşınız : ");
		travelerAge=sc.nextInt();
		if(travelerAge<=0) {
			System.out.print("eksi ya da sıfır  yaş olamaz tekrar deneyiniz.");
		}
	}while(travelerAge<=0);
	System.out.print("Bilet Tipiniz(gidiş-geliş ya da sadece gidiş) : ");
	ticketType=sc.next();

	int away;
	do {
		System.out.print("Gidilecek mesafe :");
		away=sc.nextInt();
		if(away<0)
			System.out.print("gidilecek mesafe sıfır olamaz . Tekrar deneyiniz.");
	}while(away<0);
	double pay=away*0.1;
	if(ticketType.contains("gidiş-geliş")) {
		if(travelerAge<12) {
			System.out.print("Ödenecek tutar : "+(pay-(pay*0.7)));
		}
		else if(travelerAge<24) {
			System.out.print("Ödeecek Tutar : "+(pay-(pay*0.6)));
		}
		else if(travelerAge>65) {
			System.out.print("Ödencek Tutar : "+(pay-(pay*0.5)));
		}
		else {
			System.out.print("Ödenecek Tutar : "+(pay-(pay*0.2)));
		}
	}
	else {
		if(travelerAge<12) {
			System.out.print("Ödenecek tutar : "+(pay-(pay*0.5)));
		}
		else if(travelerAge<24) {
			System.out.print("Ödenecek Tutar : "+(pay-(pay*0.4)));
		}
		else if(travelerAge>65) {
			System.out.print("Ödenecek Tutar : "+(pay-(pay*0.3)));
		}
		else {
			System.out.print("Ödenecek Tutar : "+(pay));
		}
	}
	
}
}
