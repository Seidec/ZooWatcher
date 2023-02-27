package Zookeeper;

import java.util.Scanner;

public class PotenzZahlen {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		int result = 0;
		int count = 0;
		do {
			count++;
			result = count * count;
			if (result > number)
				break;
			System.out.println(result);

		} while (result < number);
		sc.close();
	}
}
