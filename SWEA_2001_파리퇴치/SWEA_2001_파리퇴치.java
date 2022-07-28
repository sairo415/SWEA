package SWEA_2001_파리퇴치;

import java.util.Scanner;

public class SWEA_2001_파리퇴치 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();

		for (int tc = 1; tc <= T; tc++) {
			int N = sc.nextInt();
			int M = sc.nextInt();

			int[][] arr = new int[N][N];

			for (int r = 0; r < N; r++) {
				for (int c = 0; c < N; c++) {
					arr[r][c] = sc.nextInt();
				}
			}

			int max = 0;
			for (int i = 0; i <= N - M; i++) {
				for (int j = 0; j <= N - M; j++) {
					
					int sum = 0;
					
					for (int r = i; r < i + M; r++) {
						for (int c = j; c < j + M; c++) {
							sum += arr[r][c];
						}
					}
					max = Math.max(max, sum);
				}
			}

			System.out.println("#" + tc + " " + max);
		}

		sc.close();
	}

}
