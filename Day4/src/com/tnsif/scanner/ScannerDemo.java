package com.tnsif.scanner;

import java.util.Scanner;

public class ScannerDemo {
	
	public static void main(String[] args) {
		System.out.println("Enter number:");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		if(num ==1) {
			System.out.println("One");
		}
		else {
			if(num ==2) {
				System.out.println("Two");
			}
			else {
				if(num ==3) {
					System.out.println("Three");
				}
				else {
					System.out.println("Other");
				}

			}

		}
		sc.close();

	}

}



