import java.util.Scanner;
public class market {
public static void main(String[] args) {
	System.out.println("Kilogram fiyatı \nSalatalık : 2.40 TL\nElma: 4.11 TL\nKabak : 3.78 TL\nArmut: 5.98 TL\n");
	System.out.println("Alınacak kilogram miktarını giriniz\n");
	System.out.print("Salatalık : ");
	Scanner sc= new Scanner(System.in);
	double cucumber=sc.nextDouble();
	System.out.print("Elma: ");
	double apple=sc.nextDouble();
	System.out.print("Kabak: ");
	double courgette =sc.nextDouble();
	System.out.print("Armut :");
	double pear=sc.nextDouble();
	System.out.println("Elma tutarı : "+appleV(apple));
	System.out.println("Armut tutarı :"+pearV(pear));
	System.out.println("salatalık tutarı: "+cucumberV(cucumber));
	System.out.println("Kabak tutarı : "+courgetteV(courgette));
	
	System.out.print("Toplam fiyat : "+(appleV(apple)+pearV(pear)+cucumberV(cucumber)+courgetteV(courgette)));
}
static double appleV(double a) {
	return a*4.11;
}
static double pearV(double a) {
	return a*5.98;
}
static double cucumberV(double a) {
	return a*2.40;
}
static double courgetteV(double a) {
	return a*3.78;
}
}
