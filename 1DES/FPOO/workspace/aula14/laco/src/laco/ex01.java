package laco;

import java.util.Scanner;

public class ex01 {
	static Scanner scan = new Scanner(System.in);
	public static void main(String[] args) {
		int[] x = new int[2];
		System.out.println("Digite 2 valores: ");
		x[0] = scan.nextInt();
		x[1] = scan.nextInt();
		int y = x[0];
		if((y%2) != 0) {
			y++;
			for(int i= y; i<= x[1];i+=2) {
				System.out.println(i);
			}
		}else {
		for(int i= x[0]; i<= x[1];i+=2) {
			System.out.println(i);
			}
		}
	}
}
