import java.util.Random;
import java.util.Scanner;
public class noteAverage {
public static void main(String[] args) {


Scanner sc=new Scanner(System.in);
String[] lessonL=new String[10];
int[] lessonV=new int[10];
int [] lessonF=new int[10];
int[] average=new int[10];
int i=0;
boolean isContunie=true;
do {
	System.out.print("Ders Adı: ");;
	lessonL[i]=sc.next();
	System.out.print("Vize notu: ");
	lessonV[i]=sc.nextInt();
	System.out.print("Final Notu");
	lessonF[i]=sc.nextInt();
	average[i]=average(lessonV[i],lessonF[i]);
	if(i==9) {
		isContunie=false;
	}
	i++;
}while(isContunie);
i=0;
System.out.println("\n\n\n\n\nŞube		Ders Kodu 		Ders Adı 			Notlar 		Ortalama 	Harf notu 	Durumu  ");

while(i<10) {
	Random rndŞ=new Random();
	Random rndD=new Random();
	int a=rndŞ.nextInt(10);
	int b=134*rndD.nextInt(10);
	System.out.printf("%-10d 	%-10d		%-10s		 Vize: %d Final: %d	%5d    %10s	   %10s\n",
			a,b,lessonL[i],lessonV[i],lessonF[i],average[i],harf(average[i]),durum(average[i]));
i++;	
}


}
static int average(int a,int b) {
	return ((a*4)+(b*6))/10;
}
static String harf(int a) {
	if(a>=90)
		return "AA";
	else if(a>=80)
		return "BB";
	else if(a>=70)
		return "CC";
	else if(a>=60)
		return "DD";
	else 
	return "FF";
}
static String durum(int a) {
	if(a>50)
		return "Geçti";
	else 
		return "Kaldı";
}}