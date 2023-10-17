package java1;
import java.util.Scanner;
public class rertySameNumber{
	public static void main(String[] args) {
		System.out.print("Dizi boyutunu giriniz : ");
		Scanner sc=new Scanner(System.in);
		int listLong=sc.nextInt();
		int[] list=new int[listLong];
		int counter=0;
		do {
			System.out.print((counter+1)+". elemanı giriniz : ");
			list[counter]=sc.nextInt();
			counter++;
		}while(counter<listLong);
	counter=0;int rerty=1;
	int count=0,temp=0;
	while(counter<listLong) {
		count=counter+1;rerty=1;
	while(count<listLong) {
		if(list[count]==list[counter]) {
			rerty++;
			list[count]=0;
		}
		count++;
	}
	if(rerty!=1&&list[counter]!=0) {
	System.out.print(list[counter]+" sayısından "+rerty +" adet vardır ");
	}
	list[counter]=0;
	
	counter++;}
	
	
	
	}
}