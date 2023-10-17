import java.util.Scanner;
public class Triagle {
public static void main(String[] args) {
	System.out.println("1. kenar: ");
	Scanner sc=new Scanner(System.in);
	int firstEdge=sc.nextInt();
	System.out.println("2. kenar: ");
	int secondEdge=sc.nextInt();
	int thirdEdge=hyptenouse(firstEdge,secondEdge);
	System.out.println("Hipotenüs : "+thirdEdge);
	System.out.println("Üçgenin Çevresi: "+(firstEdge+secondEdge+thirdEdge));

}
static int hyptenouse(int a,int b) {
	return (int) Math.sqrt((a*a)+(b*b));
}
}
