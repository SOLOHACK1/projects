import java.util.Scanner;
public class horoscope{
	public static void main(String[] args) {
		
		String[] months= {"Koç", "Boğa","İkizler","Yengeç","Aslan","Başak","Terazi","Akrep","Yay","Oğlak","Kova","Balık"};
		Scanner sc=new Scanner(System.in);
		System.out.print("Doğduğunuz ayı giriniz : ");
		String month=sc.next();
		System.out.print("Doğduğunuz günü giriniz : ");
		int day=sc.nextInt();
		if(month.contains("Mart")) {
			if(day<21) {
				System.out.print(months[11]+" burcusunuz.");
			}
			else {
				System.out.print(months[0]+" burcusunuz. ");
			}
		}
		else if(month.contains("Nisan")){
			if(day<21) {
				System.out.print(months[0]+" burcusunuz. ");
			}
			else {
				System.out.print(months[1]+" burcusunuz. ");
			}
		}
		else if(month.contains("Mayıs")) {
			if(day<22) {
				System.out.print(months[1]+" burcusunuz. ");
			}
			else {
				System.out.print(months[2]+" burcusunuz. ");
			}
		}
		else if(month.contains("Haziran")) {
			if(day<23) {
				System.out.print(months[2]+" burcusunuz. ");
			}
			else {
				System.out.print(months[3]+" burcusunuz. ");
			}
	}
		
		else if(month.contains("Temmuz")) {
			if(day<23) {
				System.out.print(months[3]+" burcusunuz. ");
			}
			else {
				System.out.print(months[4]+" burcusunuz. ");
			}
		}
		else if(month.contains("Ağustos")){
			if(day<23) {
				System.out.print(months[4]+" burcusunuz. ");
			}
			else {
				System.out.print(months[5]+" burcusunuz. ");
			}
		}
		else if(month.contains("Eylül")) {
			if(day<23) {
				System.out.print(months[5]+" burcusunuz. ");
			}
			else {
				System.out.print(months[6]+" burcusunuz. ");
			}
		}
		else if(month.contains("Ekim")) {
			if(day<23) {
				System.out.print(months[6]+" burcusunuz. ");
			}
			else {
				System.out.print(months[7]+" burcusunuz. ");
			}
		}
		else if(month.contains("Kasım")) {
			if(day<22) {
				System.out.print(months[7]+" burcusunuz. ");
			}
			else {
				System.out.print(months[8]+" burcusunuz. ");
			}
		}
		else if(month.contains("Aralık")) {
			if(day<22) {System.out.print(months[8]+" burcusunuz. ");
			}
			else {
				System.out.print(months[9]+" burcusunuz. ");
			}
			
		}
		else if(month.contains("Ocak")) {
			if(day<22) {
				System.out.print(months[9]+" burcusunuz. ");
			}
			else {
				System.out.print(months[10]+" burcusunuz. ");
			}
		}
		else if(month.contains("Şubat")){
			if(day<20) {
				System.out.print(months[10]+" burcusunuz. ");
			}
			else {
				System.out.print(months[11]+" burcusunuz. ");
			}
		}
		
	
	}
}