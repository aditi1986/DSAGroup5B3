package com.glearning.dsa;

import java.util.Scanner;

public class SkyScraper {

	public static void main(String args[]) {

		// import scanner class to accept the input from the user
		Scanner sc = new Scanner(System.in);

		// accept the total no.of floors available
		System.out.println("Enter the total number floors in the building : ");
		int n = sc.nextInt();

		// declare an array to store the size of each floor
		int day[] = new int[n + 1];

		// iterate through 1 to n floors/ days
		for (int i = 1; i <= n; i++) {

			// accept the size of the floor
			System.out.println("Enter the floor size given on day : " + i);
			int size = sc.nextInt();

			// store the day in the array with the index of the size of the floor
			day[size] = i;
		}

		// declare a temporary variable n
		int temp = n;

		// declare a flag variable to check the condition when required.
		int flag;
		System.out.println("The order of construction is as follows ");

		// iterate through 1 to n floors/ days
		for (int i = 1; i <= n; i++) {

			// initialise flag to 0 for each iteration
			flag = 0;
			System.out.println("Day " + i + " :");

			// find the floor with the highest size available
			while (temp >= 1 && day[temp] <= i) {

				// update the flag
				flag = 1;

				// print the floor
				System.out.print(temp + " ");

				// find the next highest floor available
				temp--;
			}

			// if flag is updated
			if (flag == 1)

				// proceed to the next day
				System.out.println();
		}

	}

}
