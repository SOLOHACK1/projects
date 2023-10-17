import java.util.Scanner;
public class rekürsif{
	public static void main(String[] args) {
		System.out.print("Sıra : ");
		Scanner sc=new Scanner(System.in);
		int rank=sc.nextInt();
		int i=1;
		while(i<rank) {
			System.out.print(rekürsif(i)+" ");
		i++;
		}
	}
	static int rekürsif(int rank) {
		if(rank==0) {
		return 0;	
		}
		else if(rank==1) {
			return 1;
		}
		else {
			return rekürsif(rank-2)+rekürsif(rank-1);
		} 
	}
}