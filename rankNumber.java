package java1;
import java.util.Scanner;
public class rankNumber {
	public static void main(String[] arsg) {
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
		counter=0;int count=0;
		while(counter<listLong) {count=counter+1;;
			while(count<listLong) {
				if(list[counter]>list[count]) {
					list[counter]=list[count]+list[counter];
					list[count]=list[counter]-list[count];
					list[counter]=list[counter]-list[count];
				}
				count++;}
		counter++;}
		counter=0;
		while(counter<listLong) {
			System.out.print(list[counter]+" ");
			counter++;
			
		}
	}
}