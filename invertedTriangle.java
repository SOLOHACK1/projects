import java.util.Scanner;
public class invertedTriangle {
public static void main(String[] args) {
	System.out.println("satır sayısı : ");
	Scanner sc=new Scanner(System.in);
	int line=sc.nextInt();int hiddenLine=line;
	int counter=0;int i=hiddenLine;
	while(line>0) {counter=0;
		while(2*line-1>counter) {
			System.out.print("*");
		counter++;
		}System.out.println();
		while(i>=line) {
			i--;System.out.print(" ");
		}i=hiddenLine;
	line--;
	}
}
}
