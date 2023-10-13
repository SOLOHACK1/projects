import java.util.Scanner;
public class BKI {
public static void main(String[] args) {
	System.out.print("Boyunuz: ");
	Scanner sc= new Scanner(System.in);
	double height= sc.nextDouble();
	System.out.print("Kilonuz : ");
	double weight=sc.nextDouble();
	double BKIresult=BKI(height,weight);
	System.out.println("BKI: "+BKIresult);
	System.out.print("Kademeniz : "+Level(BKIresult));
	
}
 static double BKI(double a,double b) {
	return b/(a*a);
}
 static String Level(double a) {
	 if(18.5>a)
		 return "Zayıf";
	 else if(25>a) 
		 return "ideal";
	 else if(a<30)
		 return "Şişman";
	 else if(a<35) 
		 return"Obez";
		 else
	 
	 return"Aşırı Obez";
 
 }
}
