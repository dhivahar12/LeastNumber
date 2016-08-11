package guvi;

	import java.util.Scanner;
	public class ISC {
	static Scanner sc =new Scanner(System.in);
	static int m,n; static int ndigit;
	void input(){
	System.out.println("Enter the value of M: ");
	m = sc.nextInt();
	if (m>=100&&m<=10000) {
	}
	else {
	    System.out.println("INVALID, Enter again: ");
	    while (!(m>=100&&m<=10000)){
	        m = sc.nextInt();
	    }
	}

	System.out.println("Enter the value of N: ");
	n = sc.nextInt();
	if (n>=1&&n<=100){
	    //do nothing
	}
	else {
	    System.out.println("INVALID INPUT, Enter again");
	    while (!(n>=1&&n<=100)){
	        n = sc.nextInt();
	    }
	 }
	}
	 static int sumOfDigits(int n){
	int sum = 0;
	String a = Integer.toString(n); int digit;
	for (int i = 0; i<a.length();i++){
	    digit = Integer.parseInt(Character.toString(a.charAt(i)));
	    sum += digit;
	  }
	return sum;
	}
	 static int getNo(){
	ndigit = 0;
	for (int i = m; i<=10000;i++){
	    if (sumOfDigits(i)==n){
	        ndigit = (Integer.toString(i)).length();
	        return i;
	    }
	 }
	return 0;
	}
	 public static void main(String[] args){
	ISC a = new ISC();
	a.input();
	if (getNo()==0) System.out.println("NO NUMBER FOUND");
	else {
	  System.out.println("Minimum number is: " + getNo());
	  System.out.println("Total number of digits: " + ndigit);
	}
	}
	}

