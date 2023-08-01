package logicalprogramming;

import java.util.Scanner;

public class Discrium {
	public static boolean isDiscrium(int n) {
		int temp=n;int count=0;int sum=0;
		while(temp>0) {
			temp=temp/10;
			count++;
		}
		temp=n;
		while(temp>0) {
			int lastdigit=temp%10;
			int pro=1;
			for(int i=1;i<=count;i++) {
				pro=lastdigit*pro;
			}
			count--;
			sum=sum+pro;
			temp=temp/10;
		}
		if(sum==n) {
			return true;
		}else {
			return false;
		}
	}
	public static void main (String []args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=sc.nextInt();
		System.out.println(isDiscrium(n));
		
		
	}

}
