package study;

import java.util.Arrays;
import java.util.Scanner;

public class SWEA_2805_농작물수확하기2 {

	public static void main(String[] args) {
		// 입력
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for (int tc = 1; tc <= T; tc++) {
			int N = sc.nextInt();
			int[][] arr = new int[N][N];
			for(int i = 0; i < N; i++) {
				String str = sc.next();
				char[] charArr = str.toCharArray();
				for (int j = 0; j < N; j++) {
					arr[i][j] = charArr[j] - '0';
				}
				
			}
				// r -> d
				// 0 -> 2
				// 1 -> 1
				// 2 -> 0
				// 3 -> 1
				// 4 -> 2
				
			int sum = 0;
			for (int r = 0; r < N; r++) {
				for (int c = 0; c < N; c++) {
					int mid = N / 2;
					int d = Math.abs(r - mid);
					int start = 0 + d;
					int end = (N - 1) - d;
					if(start <= c && c <= end) {
						sum += arr[r][c];
					}
				}
			}
			System.out.println("#" + tc + " " + sum);
//			System.out.println(Arrays.deepToString(arr));
		}
		sc.close();
		
		// char test
//		char a = 48;
//		char b = '1';
//		char c = 1;
//		System.out.println(a);
//		System.out.println(b);
//		System.out.println(c);
	}

}
