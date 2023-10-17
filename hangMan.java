import java.util.Scanner;
import java.util.Random;
public class hangMan{
	static int counterT=0;
	static char[] trueA=new char[20];
	static int isEnd=0;
	static int rightOfTry=7;
	static String name;
	static boolean log =false;
	public static void main(String[] args) {int counter=0;
	
		while(counter<20) {
	
			trueA[counter]='_';
			counter++;
		}
		String [] word1= {"kalem","cips","müptezel","klavye","nükleer"};
		Random rnd=new Random();
		int selectW=rnd.nextInt(5);
	
		System.out.println("İNSAN ASMACA");
		System.out.print("Adınız : ");
		Scanner sc=new Scanner(System.in);
		 name=sc.next();
		String word=word1[selectW];
		String wordU;
		startG(word);
		char charF;
		do {System.out.print("Harf : ");
		wordU=sc.next();
		charF=wordU.charAt(0);
			takeTA(word,charF);
			writeA(word);
			isEnd(word);
			if(isEnd==0) {break;}
			hangM(word);
			rightOfTry--;
			
		}while(rightOfTry>0);
		
	
	}
	static void startG(String w) {
		System.out.print("Kelime : ");
		int counter=0;
		while(counter<w.length()) {
			System.out.print("_ ");
			counter++;
		}
		System.out.println();
	}
	static void takeTA(String w,char c) {
		int counter=0;log=false;
		while(counter<w.length()) {
			if(w.charAt(counter)==c) {
				trueA[counter]=c;log=true;
			}counter++;
		}
		if(log==true) {
			rightOfTry++;
		}
	}
	static void writeA(String w) {
		int counter=0;
		while(counter<w.length()) {
			
			System.out.print(trueA[counter]+" ");
			counter++;
		}System.out.println();
	}
	static  void isEnd(String w) {
		int counter=0;isEnd=0;
		while(counter<w.length()) {
			if(trueA[counter]=='_') {
				isEnd++;
			}
			counter++;
		}
		if(isEnd==0) {
			System.out.println("    KAZANDINIZ    ");
			System.out.println("      -  -        ");
			System.out.println("    \\      /     ");
			System.out.println("     \\____/      ");
		}
	}
	static void hangM(String w) {System.out.println(" \n   "+name);
		if(rightOfTry==8) {
			System.out.println("               ");
			System.out.println("               ");
			System.out.println("               ");
			System.out.println("               ");
			System.out.println("               ");
			System.out.println(" _ _ _ _ _ _ _ ");
			
			
		}
		else if(rightOfTry==7) {
			System.out.println("                ");
			System.out.println(" |              ");
			System.out.println(" |              ");
			System.out.println(" |              ");
			System.out.println(" |              ");
			System.out.println(" | _ _ _ _ _ _ ");
			
			
		}
		else if(rightOfTry==6) {
			System.out.println("  _ _ _ _       ");
			System.out.println(" |       |     ");
			System.out.println(" |       O     ");
			System.out.println(" |             ");
			System.out.println(" |             ");
			System.out.println(" | _ _ _ _ _ _ ");
		}
		else if(rightOfTry==5) {
			System.out.println("  _ _ _ _      ");
			System.out.println(" |       |     ");
			System.out.println(" |       O     ");
			System.out.println(" |       |     ");
			System.out.println(" |             ");
			System.out.println(" | _ _ _ _ _ _ ");
		}
		else if(rightOfTry==4) {
			System.out.println("  _ _ _ _      ");
			System.out.println(" |       |     ");
			System.out.println(" |       O     ");
			System.out.println(" |     / |   ");
			System.out.println(" |             ");
			System.out.println(" | _ _ _ _ _ _ ");
		}
		else if(rightOfTry==3) {
			System.out.println("  _ _ _ _       ");
			System.out.println(" |       |     ");
			System.out.println(" |       O     ");
			System.out.println(" |     / | \\   ");
			System.out.println(" |            ");
			System.out.println(" | _ _ _ _ _ _ ");
		}
		else if(rightOfTry==2) {
			System.out.println("  _ _ _ _       ");
			System.out.println(" |       |     ");
			System.out.println(" |       O     ");
			System.out.println(" |     / | \\   ");
			System.out.println(" |        \\     ");
			System.out.println(" | _ _ _ _ _ _ ");
		}
		else if(rightOfTry==1) {
			System.out.println("  _ _ _ _       ");
			System.out.println(" |       |     ");
			System.out.println(" |       O     ");
			System.out.println(" |     / | \\   ");
			System.out.println(" |      / \\     ");
			System.out.println(" | _ _ _ _ _ _ ");
			System.out.println("KAYBETTİNİZ :(");
			System.out.println("Kelime : "+w);
		}System.out.println();
	}
	
}