/*
* author : Farhan Rafi
* GitHub : https://github.com/FarhanRafi/
*/

import java.util.Scanner;

public class Day_1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
	
		int i = 4;
		double d = 4.0;
		String s = "HackerRank ";
		
		int i1 = scan.nextInt();
		double d1 = scan.nextDouble();
		scan.nextLine();
		String s1 = scan.nextLine();

	
		System.out.println(i+i1);
		System.out.printf("%.1f\n", d+d1);
		System.out.println(s+s1);
		scan.close();
	}

}
