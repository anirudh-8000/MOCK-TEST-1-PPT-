package MOCK_TEST;

import java.util.Scanner;

public class Question_3 {

	public static void main(String[] args) {
		System.out.println("Enter the total Number:");
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int arr[]=new int[num];
		System.out.println("Enter values:");
		for(int i=0;i<num;i++) {
			arr[i]=sc.nextInt();
		}
		int average=0;
		int total=0;
		int i=0;
		do {
			total+=arr[i];
			i++;
		}
		while(i<num);
		average=total/num;
		System.out.println("Average number is:"+average);
		sc.close();
	}

}
