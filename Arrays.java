package com;
import java.util.Scanner;
public class Arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the Array size");
		int size=s.nextInt();
		int []n=new int[size];
		System.out.println("Enter"+ size+"values");
		for(int i=0;i<n.length;i++)
			n[i]=s.nextInt();
		System.out.println("Given array elements are");
		for(int i=0;i<n.length;i++)
			System.out.println(n[i]);
		System.out.println("This is using Enhanced for loop (foreach)");
		for(int x:n)
			
			System.out.println(x);
		
		

	}

}
