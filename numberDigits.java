import java.util.Scanner;
public class numberDigits {
public static void main(String[] args) {
	System.out.print("Sayı : ");
	Scanner sc=new Scanner(System.in);
	int number=sc.nextInt();
	int digits1=0,digits2=0,digits3=0,digits4=0,digits5=0,digits6=0,digits7=0,digits8=0,digits9=0,digits10=0;
	while(number>=1000000000) {number/=1000000000;digits10++;}
	
		while(number>=100000000) {number-=100000000;digits9++;}
		
			while(number>=10000000) {number-=10000000;digits8++;}
			
				while(number>=1000000) {number-=1000000;digits7++;}
				
					while(number>=100000) {number-=100000;digits6++;}
					
						while(number>=10000) {number-=10000;digits5++;}
						
							while(number>=1000) {number-=1000;digits4++;}
							
								while(number>=100) {number-=100;digits3++;}
								
									while(number>=10) {number-=10;digits2++; }
									
										while(number>=1) {number-=1;digits1++;}
											
		
	if(digits10>0) {
		System.out.print("10 basamaklı ");
	}
	else if(digits9>0) {
		System.out.print("9 basamaklı ");
	}
else if(digits8>0) {
	System.out.print("8 basamaklı ");
	}
else if(digits7>0) {
	System.out.print("7 basamaklı ");
}
else if(digits6>0) {
	System.out.print("6 basamaklı ");
}
else if(digits5>0) {
	System.out.print("5 basamaklı ");
}
else if(digits4>0) {
	System.out.print("4 basamaklı ");
}
else if(digits3>0) {
	System.out.print("3 basamaklı ");
}
else if(digits2>0) {
	System.out.print("2 basamaklı ");
}else  {
	System.out.print("1 basamaklı ");
}
	
	
	
	
	
	
	
	
	
	
	
}
}
