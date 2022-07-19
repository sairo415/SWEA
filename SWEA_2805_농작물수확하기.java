package study;

import java.util.Arrays;
import java.util.Scanner;

public class SWEA_2805_농작물수확하기 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();

		for (int tc = 1; tc <= T; tc++) {
			int N = sc.nextInt();
			int[][] farm = new int[N][N];
			int ans = 0;

			for (int i = 0; i < N; i++) {
//				int a = sc.nextInt();
				String s = sc.next();
//				int a = Integer.parseInt(s);
				char[] sArr = s.toCharArray();
				for (int j = 0; j < farm[i].length; j++) {
					int a = sArr[j] - 48;
					farm[i][j] = a % 10;
					a /= 10;
				}					
			}
			
			int mid = N / 2;
			for (int i = 0; i < farm.length; i++) {
				int d = mid - Math.abs(i - mid);
				int start = mid - d;
				int end = mid + d;
				for (int j = 0; j < farm[i].length; j++) {
					if(j >= start && j <= end) {
						ans += farm[i][j];
					}
				}
			}
			System.out.println("#" + tc + " " + ans);
		}
		sc.close();
	}

}
