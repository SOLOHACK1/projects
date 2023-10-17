import java.util.Scanner;
public class harmonic {
public static void main(String[] args) {
	System.out.print("Harmonik hersaplanacak sayı : ");
	Scanner sc=new Scanner(System.in);
	int harmonic=sc.nextInt();
	double counter=2;
	double coefficient=1;
	while(counter<=harmonic) {
		
		coefficient=coefficient+1/counter;
		counter++;
	}
	System.out.print(coefficient);
}
}
