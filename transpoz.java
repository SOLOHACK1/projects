package java1;
import java.util.Scanner;
public class transpoz{
	public static void main(String[] args) {
		System.out.print("Dizinin satır sayısını giriniz : ");
		Scanner sc=new Scanner(System.in);
		int listLine=sc.nextInt();
		System.out.print("Dİzinin satır sayısını giriniz : ");
		int listColumn=sc.nextInt();
		int[][] list=new int[listLine][listColumn];
		int counterColumn=0,counterLine=0;
		while(counterLine<listLine) {counterColumn=0;
			
		while(counterColumn<listColumn) {
		
			System.out.print("["+counterLine+"]["+counterColumn+"] . eleman : ");
			list[counterLine][counterColumn]=sc.nextInt();
			counterColumn++;
				
			}counterLine++;
		}
		counterColumn=0;counterLine=0;
		while(counterLine<listLine) {counterColumn=0;
			while(counterColumn<listColumn) {
				System.out.println("["+counterLine+"]["+counterColumn+"] . eleman : "+list[counterLine][counterColumn]);
				counterColumn++;
			}counterLine++;
		}
	int[][] transpoz=new int[listColumn][listLine];
	counterColumn=0;counterLine=0;
	while(counterLine<listLine) {counterColumn=0;
		while(counterColumn<listColumn) {
			transpoz[counterColumn][counterLine]=list[counterLine][counterColumn];
			counterColumn++;
		}counterLine++;
	}
	counterColumn=0;counterLine=0;
	while(counterLine<listLine) {counterColumn=0;
		while(counterColumn<listColumn) {
	System.out.print("["+counterColumn+"]["+counterLine+"] . eleman "+transpoz[counterColumn][counterLine]);
			counterColumn++;
			
		}counterLine++;
	}
	
	
	
	
	
	
	}
}