package SWEA_12712_파리퇴치3;

import java.util.Scanner;

public class SWEA_12712_파리퇴치3 {

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
			
			int[] dr = { -1, 1, 0, 0, -1, -1, 1, 1 };
			int[] dc = { 0, 0, -1, 1, -1, 1, -1, 1 };

			int max = 0;
			int sum;

			for (int r = 0; r < N; r++) {
				for (int c = 0; c < N; c++) {

					int nr = 0;
					int nc = 0;

					sum = arr[r][c];
					for (int d = 0; d < 4; d++) {
						for (int i = 1; i < M; i++) {
							nr = r + dr[d] * i;
							nc = c + dc[d] * i;

							if (nr < N && nc < N && nr >= 0 && nc >= 0) {
								sum += arr[nr][nc];
							}
						}
					}
					max = Math.max(max, sum);
					
					sum = arr[r][c];
					for (int d = 4; d < 8; d++) {
						for (int i = 1; i < M; i++) {
							nr = r + dr[d] * i;
							nc = c + dc[d] * i;

							if (nr < N && nc < N && nr >= 0 && nc >= 0) {
								sum += arr[nr][nc];
							}
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
