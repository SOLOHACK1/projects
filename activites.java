import java.util.Scanner;
public class activites {
public static void main(String[] args) {
	System.out.print("Sıcaklık :");
	Scanner sc=new Scanner(System.in);
	int hot=sc.nextInt();
	if(hot<5) {
		System.out.print("Kayak yapabilirsin.");
	}
	else if(hot<15) {
		System.out.print("Tiyatro yapabilirsin.");
	}
	else if(hot<25) {
		System.out.print("Mangal yapabilirsin. ");
	}
	else {
		System.out.print("Yüzebilirsin. ");
	}
	
}
}
