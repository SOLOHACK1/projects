import java.util.Scanner;
public class sms {
public static void main(String[] args) {
	System.out.print("sms :");
	Scanner sc=new Scanner(System.in);
	String sms=sc.nextLine();
	
	System.out.println("mesaj uzunluğu : "+sms.length());
	int hiddenSms=sms.length();int again=1;
	while(hiddenSms>130) {
		hiddenSms-=130;
		again++;
	}
    System.out.println("harcanan sms hakkı : "+again);
}
}
