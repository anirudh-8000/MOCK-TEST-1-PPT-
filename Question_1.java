package MOCK_TEST;

import java.util.Scanner;

public class Question_1 {
	public static void main(String[] args) {
		System.out.println("Enter the Number:");
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		if(num<0) 
			System.out.println("Negative Number");		
		else if(num==0)
			System.out.println("Zero Number");
		else
			System.out.println("Positive Number");
		sc.close();
	}

}
