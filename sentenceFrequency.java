package java1;
import java.util.Scanner;
public class sentenceFrequency {
public static void main(String[] args) {
	System.out.print("cümle giriniz : ");
	Scanner sc=new Scanner(System.in);
	String sentence=sc.nextLine();
	System.out.print("Frekansı buluncak harf : ");
	String word=sc.next();
	char letter=word.charAt(0);
	int counter=0;
	int frequency=0;
	while(counter<sentence.length()) {
	
		if(sentence.charAt(counter)==letter) {
			frequency++;
		}
			counter++;
	}
	System.out.print(letter+" harfinin frekansı :"+frequency);
}
}
