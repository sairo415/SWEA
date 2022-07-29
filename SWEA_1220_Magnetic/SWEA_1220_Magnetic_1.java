package SWEA_1220_Magnetic;

import java.util.Scanner;

public class SWEA_1220_Magnetic_1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		for (int tc = 1; tc <= 10; tc++) {

			int N = sc.nextInt();
			int[][] table = new int[N][N];
			int cnt = 0;

			for (int r = 0; r < N; r++) {
				for (int c = 0; c < N; c++) {
					table[r][c] = sc.nextInt();
				}
			}

			// 1 검사
			for (int c = 0; c < table.length; c++) {
				in: for (int r = 0; r < table.length; r++) {
					if (table[r][c] != 1)
						continue;
					else if (table[r][c] == 1) {
						for (int i = 0; i < table.length - r; i++) {
							if (table[r + i][c] != 2) {
								continue;
							} else if (table[r + i][c] == 2) {
								cnt++;
								r += i;
								continue in;
							}
						}
					}
				}
			}

			System.out.println("#" + tc + " " + cnt);
		}

		sc.close();
	}
}