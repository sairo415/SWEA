package SWEA_1974_스도쿠검증;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class SWEA_1974_스도쿠검증 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();

		for (int tc = 1; tc <= T; tc++) {

			Set<Integer> row = new HashSet<>();
			Set<Integer> col = new HashSet<>();
			Set<Integer> box = new HashSet<>();

			int[][] arr = new int[9][9];
			int result = 1;

			for (int r = 0; r < arr.length; r++) {
				for (int c = 0; c < arr.length; c++) {
					arr[r][c] = sc.nextInt();
				}
			}

			for (int r = 0; r < arr.length; r++) {
				for (int c = 0; c < arr.length; c++) {
					row.add(arr[r][c]);
				}
				if (row.size() != 9) {
					result = 0;
				}
				row.clear();
			}

			for (int c = 0; c < arr.length; c++) {
				for (int r = 0; r < arr.length; r++) {
					col.add(arr[r][c]);
				}
				if (col.size() != 9) {
					result = 0;
				}
				col.clear();
			}

			for (int i = 0; i < 9; i = i + 3) {
				for (int j = 0; j < 9; j = j + 3) {

					for (int r = i; r < 3 + i; r++) {
						for (int c = j; c < 3 + j; c++) {
							box.add(arr[r][c]);
						}
					}
					if (box.size() != 9) {
						result = 0;
					}
					box.clear();
				}
			}

			System.out.println("#" + tc + " " + result);
		}

		sc.close();
	}
}