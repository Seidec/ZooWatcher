package Zookeeper;

import java.util.Scanner;

public class Schleifen {

	public static void main(String[] args) {
		char letter = 'A';
        while (letter <= 'Z') {
            System.out.print(letter+" ");
            letter++;
        }
        
        Scanner scanner = new Scanner(System.in);

        int value;
        do {
            value = scanner.nextInt();
            System.out.println(value);
        } while (value != 0);
        
        int sum = 0;
        while (scanner.hasNextInt()) {
            int elem = scanner.nextInt();
            sum += elem;
        }

        System.out.println(sum);
        scanner.close();
    }
}
