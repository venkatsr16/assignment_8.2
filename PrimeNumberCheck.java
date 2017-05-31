import java.io.*;
import java.util.*;
/*public class PrimeNumberCheck extends Thread {
	Scanner s = new Scanner(System.in);
	public  void run(){
		int flag=0;
		System.out.println("Enter a number");
		int n = s.nextInt();
		for(int i=2;i<=n/2;i++) {
			if(n%i==0){
				System.out.println("Not a prime number");
				flag=1;
				break;
			}
		}
		if(flag==0) {
			System.out.println("Prime Number");
		}
	}*/
public class PrimeNumberCheck implements Runnable {
	Scanner s = new Scanner(System.in);
	public  void run(){
		int flag=0;
		System.out.println("Enter a number");
		int n = s.nextInt();
		for(int i=2;i<=n/2;i++) {
			if(n%i==0){
				System.out.println("Not a prime number");
				flag=1;
				break;
			}
		}
		if(flag==0) {
			System.out.println("Prime Number");
		}
	}
public static void main(String args[]) {
	PrimeNumberCheck pnc = new PrimeNumberCheck();
	//pnc.start();
	
	Thread t = new Thread(pnc);
	t.start();
}
}