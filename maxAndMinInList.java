package java1;
import java.util.Scanner;
public class maxAndMinInList {
public static void main(String[] args) {
	System.out.print("Dizi boyutunu giriniz : ");
	Scanner sc=new Scanner(System.in);
	int listLong=sc.nextInt();
	int[] list=new int[listLong];
	int counter=0;
	do {
		System.out.print((counter+1)+". elemanı giriniz .");
	 list[counter]=sc.nextInt();
		
		
		
		
		counter++;
	}while(counter<listLong);
	counter=0;
	while(counter<listLong-1) {
		if(list[counter]>list[counter+1]) {
			list[counter+1]=list[counter]+list[counter+1];
			list[counter]=list[counter+1]-list[counter];
			list[counter+1]=list[counter+1]-list[counter];
		}
		counter++;
	}
	System.out.println("En büyük eleman : "+list[counter]);
	counter=0;
	while(counter<listLong-1) {
		if(list[counter]<list[counter+1]) {
			list[counter+1]=list[counter]+list[counter+1];
			list[counter]=list[counter+1]-list[counter];
			list[counter+1]=list[counter+1]-list[counter];
		}
		counter++;
		
	}
	System.out.print("En küçük eleman : "+list[counter]);
}
}
