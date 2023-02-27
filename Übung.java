package Zookeeper;

import java.util.Scanner;

public class Übung {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char c;
		String[][] playGround = new String[2][2];
		
		for(int i =0; i< 9; i++) {
			String input =sc.next();
			if(input.equalsIgnoreCase("x")) {
			c = 'X';
			}else if(input.equalsIgnoreCase("o")) {
				c = 'O';
			}else {
				c='_';
			}
			
		}
		
		   
		
		
		}

	}


