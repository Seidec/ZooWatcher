package Zookeeper;

import java.util.Scanner;

public class HighestNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int number = 0;
		int highestNumber = 0;

		do {
			number = sc.nextInt();
			if (number > highestNumber)
				highestNumber = number;

		} while (number != 0);

		System.out.println(highestNumber);
		sc.close();
	}
}
