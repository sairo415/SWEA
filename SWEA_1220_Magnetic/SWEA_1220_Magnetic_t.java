package SWEA_1220_Magnetic;

import java.util.Scanner;

public class SWEA_1220_Magnetic_t {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		for (int tc = 1; tc <= 10; tc++) {

			int N = sc.nextInt(); // 100
			int[][] map = new int[N][N];

			for (int r = 0; r < N; r++) {
				for (int c = 0; c < N; c++) {
					map[r][c] = sc.nextInt(); // 0: 빈칸, 1: N, 2: S
				}
			}

			int cnt = 0;
			for (int c = 0; c < N; c++) {
				boolean nFound = false;
				for (int r = 0; r < N; r++) {
					if (!nFound && (map[r][c] == 0 || map[r][c] == 2)) {
						continue;
					}
					if (!nFound && map[r][c] == 1) {
						nFound = true;
					}
					if(nFound && map[r][c] == 2) {
						cnt++;
						nFound = false;
					}
				}
			}

			System.out.println("#" + tc + " " + cnt);
		}

		sc.close();
	}

}
