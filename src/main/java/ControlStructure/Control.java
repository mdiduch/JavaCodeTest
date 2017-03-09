package ControlStructure;

import java.util.Scanner;

public class Control {
	/*Original Code:
	
	for (int i = 1; i <= 5; i++){
		for (int j = 1; j <=(5-i); j++){
			System.out.print(".");
		}
		for (int k = 1; k <= i; k++){
			System.out.print(i);
		}
		System.out.println();
	}*/
	
	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	System.out.println("Enter the size of the for loop");
	
	int num1 = input.nextInt();

for (int i = 1; i <= num1; i++){
	for (int j = 1; j <=(num1-i); j++){
		System.out.print(".");
	}
	for (int k = 1; k <= i; k++){
		System.out.print(i);
	}
	System.out.println();
}
}
	
}
