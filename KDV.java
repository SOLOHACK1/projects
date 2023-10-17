import java.util.Scanner;
public class KDV {
public static void main(String[] args) {
	System.out.print("Ürün değeri: ");
	Scanner sc=new Scanner(System.in);
	double product=sc.nextDouble();
	if(product>500) {
	System.out.println("Kdv oranı    : %8");
	System.out.println("Ürün değeri  : "+product);
	System.out.println("Kdv değeri   : "+kdv8(product));
	System.out.print("Son ürün fiyatı:"+(kdv8(product)+product));
	}
	else {
		System.out.println("Kdv oranı  : %8");
		System.out.println("Ürün değeri: "+product);
		System.out.println("Kdv değeri : "+kdv18(product));
		System.out.println("Son ürün fiyatı :"+(kdv18(product)+product));
	}
}
static double kdv8(double a) {
	return a*8/100;
}
static double kdv18(double a) {
	return a*18/100;
}

}
