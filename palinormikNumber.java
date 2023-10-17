import java.util.Scanner;
public class palindormikNumber {
public static void main(String[] args) {
	System.out.print("Sayı : ");
	Scanner sc=new Scanner(System.in);
	int number=sc.nextInt();int hiddenNumber=number;
	int digits1=0,digits2=0,digits3=0,digits4=0,digits5=0,digits6=0,digits7=0,digits8=0,digits9=0,digits10=0;
	while(number>=1000000000) {
		number-=1000000000;digits10++;
	}
	while(number>=100000000) {
		number-=100000000;digits9++;
	}
	while(number>=10000000) {
		number-=10000000;digits8++;
	}
	while(number>=1000000) {
		number-=1000000;digits7++;
	}
	while(number>=100000) {
		number-=100000;digits6++;
	}
	while(number>=10000) {
		number-=10000;digits5++;
	}
	while(number>=1000) {
		number-=1000;digits4++;
	}
	while(number>=100) {
		number-=100;digits3++;
	}
	while(number>=10) {
		number-=10;digits2++;
	}
	while(number>=1) {
		number-=1;digits1++;
	}
	if((digits1*1)+(digits2*10)+(digits3*100)+(digits4*1000)+(digits5*10000)+(digits6*100000)+(digits7*1000000)+(digits8*10000000)+(digits9*100000000)+(digits10*1000000000)==hiddenNumber) {
		System.out.print(hiddenNumber+" sayısı palindormik sayıdır.");
	}
	else {
		System.out.print(hiddenNumber+" sayısı palindormik sayı değildir .");
		
	}
	
}
}
