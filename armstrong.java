import java.util.Scanner;
public class armstrong{
	public static void main(String[] args) {
		System.out.print("Sayı : ");
		Scanner sc= new Scanner(System.in);
		int number=sc.nextInt();
		int add=0;int hiddenNumber=number;
		int rank1=0, rank2=0,rank3=0,rank4=0,rank5=0,rank6=0,rank7=0,rank8=0;
		boolean isC1=false,isC2=false,isC3=false,isC4=false,isC5=false,isC6=false,isC7=false,isC8=false;
		while(number>=10000000) {
			number-=10000000;rank8++;isC8=true;
		}
		while(number>=1000000) {isC7=true;
			number-=1000000;rank7++;
		}
		if(isC7==false&&isC8==true) {
			isC7=true;
		}
		while(number>=100000) {isC6=true;
			number-=100000;rank6++;
		}if(isC6==false&&isC7==true) {
			isC6=true;
		}
		while(number>=10000) {isC5=true;
			number-=10000;rank5++;
		}
		if(isC5==false&&isC6==true) {
			isC5=true;
		}
		while(number>=1000) {isC4=true;
			number-=1000;rank4++;
		}
		if(isC4==false&&isC5==true) {
			isC4=true;
		}
		while(number>=100) {isC3=true;
			number-=100;rank3++;
		}
		if(isC3==false&&isC4==true) {
			isC3=true;
		}
		while(number>=10) {isC2=true;
			number-=10;rank2++;
		}
		if(isC2==false&&isC3==true) {
			isC2=true;
		}
		while(number>=1) {isC1=true;
			number-=1;rank5++;
		}
		if(isC1==false&&isC2==true) {
			isC1=true;
		}
	if(isC1==true) {
		add++;
	}
	if(isC2==true) {
		add++;
	}
	if(isC3==true) {
		add++;
	}
	if(isC4==true) {
		add++;
	}
	if(isC5==true) {
		add++;
	}
	if(isC6==true) {
		add++;
	}
	if(isC7==true) {
		add++;
	}
	if(isC8==true) {
		add++;
	}
	
	if(Math.pow(rank8, add)+Math.pow(rank7, add)+Math.pow(rank6, add)+Math.pow(rank5, add)+Math.pow(rank4, add)+Math.pow(rank3, add)+Math.pow(rank2, add)+Math.pow(rank1, add)==hiddenNumber) {
		System.out.print(hiddenNumber+" armstrongdur.");
	}
	else {
		System.out.print(hiddenNumber+" armstrong değildir.");
	}
	}
	
}