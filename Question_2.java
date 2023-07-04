package MOCK_TEST;

import java.util.Scanner;

public class Question_2 {

	public static void main(String[] args) {
		System.out.println("Enter the Number:");
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		System.out.println("Fibonacci series:");
		int first=0;
		int second =1;
		System.out.print(first+" "+second+" ");
        for(int i=0;i<num;i++) {
        	int third=first+second;
        	if(third>num) {
        		break;
        	}
        	System.out.print(third+" ");
        	first=second;
        	second=third;
        }
        sc.close();
	}

}
