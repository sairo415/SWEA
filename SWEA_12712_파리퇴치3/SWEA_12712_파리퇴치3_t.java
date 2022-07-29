package SWEA_12712_파리퇴치3;

import java.util.Scanner;

public class SWEA_12712_파리퇴치3_t {

	static int[] dr = { -1, 1, 0, 0 }; // 상하좌우
	static int[] dc = { 0, 0, -1, 1 };

	static int[] dr2 = { -1, -1, 1, 1 }; // 대각선
	static int[] dc2 = { -1, 1, -1, 1 };

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();

		for (int tc = 1; tc <= T; tc++) {
			int N = sc.nextInt(); // 맵의 크기
			int M = sc.nextInt(); // 세기

			int[][] map = new int[N][N];

			for (int r = 0; r < N; r++) {
				for (int c = 0; c < N; c++) {
					map[r][c] = sc.nextInt();
				}
			}

			int max = -1;
			for (int r = 0; r < N; r++) {
				for (int c = 0; c < N; c++) {
					// r, c를 기준으로 했을 때
					int sum = map[r][c];
					for (int d = 0; d < 4; d++) {
						for (int m = 1; m < M; m++) {
							int nr = r + dr[d] * m;
							int nc = c + dc[d] * m;
							if (nr >= 0 && nr < N && nc >= 0 && nc < N) {
								sum += map[nr][nc];
							}
						}
					}
					if (sum > max)
						max = sum;
					sum = map[r][c];
					for (int d = 0; d < 4; d++) {
						for (int m = 1; m < M; m++) {
							int nr = r + dr2[d] * m;
							int nc = c + dc2[d] * m;
							if (nr >= 0 && nr < N && nc >= 0 && nc < N) {
								sum += map[nr][nc];
							}
						}
					}
					if (sum > max)
						max = sum;
				}

			}
			System.out.println("#" + tc + " " + max);
		}

		sc.close();
	}

}
