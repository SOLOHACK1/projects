import java.util.Scanner;
public abstract class taximeter {

	public static void main(String[] args) {
		System.out.print("Gidilen kilometre miktarı : ");
		Scanner sc=new Scanner(System.in);
		int kilometer=sc.nextInt();
		double taxiOpen=10;
		double taxiShort=20;
		double taxi1km=2.20;
		if(kilometer<20) {
			System.out.print("Yol ücreti : "+(taxiOpen+taxiShort));
		}
		else {
			System.out.print("Yol ücreti : "+(taxiOpen+taxiShort+((kilometer-20)*taxi1km)));
		}
	}

}
