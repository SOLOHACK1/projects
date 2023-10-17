import java.util.Scanner;
public class maxAndMin {
public static void main(String[] args) {
	System.out.print("Girilicek sayı adeti : ");
	Scanner sc=new Scanner(System.in);
	int adet=sc.nextInt();int hiddenAdet=adet;
	int[] arrayNumber=new int[adet];
	int counter=0;
	
	do { 
		System.out.print((counter+1)+". sayı : ");
	arrayNumber[counter]=sc.nextInt();
	counter++;
	
	}while(adet>counter);
int enBüyük=0;
while(adet>0) {
	if(arrayNumber[adet-1]>enBüyük) {
		enBüyük=arrayNumber[adet-1];
	}adet--;
}
System.out.println("En büyük : "+enBüyük);
adet=hiddenAdet;
int enKüçük=arrayNumber[adet-1];
while(adet>0) {
	if(arrayNumber[adet-1]<enKüçük) {
		enKüçük=arrayNumber[adet-1];
	}adet--;
}
System.out.print("en Küçük : "+enKüçük);

}
}
