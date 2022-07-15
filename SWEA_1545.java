package 알고리즘문제풀이;

import java.util.Scanner;

public class SWEA_1545 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		for(int i = N; i >= 0; i--) {
			System.out.print(i + " ");
		}
		sc.close();
	}

}
