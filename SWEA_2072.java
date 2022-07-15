package 알고리즘문제풀이;

import java.util.Scanner;

public class SWEA_2072 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for(int tc = 1; tc <= T; tc++) {
			int sum = 0;
			int[] num = new int[10];
			for(int i = 0; i < 10; i++) {
				num[i] = sc.nextInt();
				if(num[i] % 2 != 0) {
					sum += num[i];
				}
			}
			System.out.println("#" + tc + " " + sum);
		}
		sc.close();
	}

}
