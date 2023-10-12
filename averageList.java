import java.util.Scanner;
public class averageList {
public static void main(String[] args) {
	System.out.print("Dizi boyutu : ");
	Scanner sc=new Scanner(System.in);
	int listL=sc.nextInt();
	int counter=0;
	int [] list=new int[listL];
	while(counter<listL) {
		System.out.print((counter+1)+". eleman : ");
		int variable=sc.nextInt();
		list[counter]=variable;
		counter++;
	}
	double total=0;counter=0;
	while(counter<listL) {
		total=total+list[counter];
		counter++;
	}
	double average=total/listL;
	System.out.print("Girilen elemanların ortalaması "+average);
			


}
}
