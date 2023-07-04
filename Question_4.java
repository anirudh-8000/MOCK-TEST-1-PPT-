package MOCK_TEST;

import java.util.Scanner;

public class Question_4 {

	public static void main(String[] args) {
		System.out.println("Enter the number:");
		Scanner sc=new Scanner(System.in);
		int num1=sc.nextInt();
		System.out.println("Enter the number:");
		int num2=sc.nextInt();
		System.out.println("Enter the number:");
		int num3=sc.nextInt();
		if(num1>=num2) {
			if(num1>=num3) {
				System.out.println(num1+" is greater.");
			}
		}
		else if(num2>=num3) {
			if(num2>=num1) {
				System.out.println(num2+" is greater.");
			}
		}
		else {
			System.out.println(num3+" is greater.");
			
		}
		sc.close();
	}

}
