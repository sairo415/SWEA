package 알고리즘문제풀이;

import java.util.Scanner;

public class SWEA_2071 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for(int tc = 1; tc <= T; tc++) {
			double sum = 0;
			int[] num = new int[10];
			for(int i = 0; i < 10; i++) {
				num[i] = sc.nextInt();
				sum += num[i];
			}
			double mean = sum/10;
			System.out.println("#" + tc + " " + Math.round(mean));
		}
		sc.close();
	}

}
