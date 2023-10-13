import java.util.Scanner;
public class calculator {

	public static void main(String[] args) {
	System.out.print("işlemi giriniz : ");	
	Scanner sc=new Scanner(System.in);	
	double number1=sc.nextDouble();
	String process=sc.next();
	double number2=sc.nextDouble();
	if(process.contains("+")) {
		System.out.print(" = "+(number1+number2));
	}
	if(process.contains("-")) {
		System.out.print(" = "+(number1-number2));
	}
	if(process.contains("x")) {
		System.out.print(" = "+(number1*number2));
	}
	if(process.contains("/")) {
		System.out.print(" = "+(number1/number2));
	}
	
	
	
		
	}

	
}
