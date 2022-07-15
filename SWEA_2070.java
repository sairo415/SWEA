package 알고리즘문제풀이;

import java.util.Scanner;

public class SWEA_2070 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for(int tc = 1; tc <= T; tc++) {
			String ans = "";
			int a = sc.nextInt(); int b = sc.nextInt();
			if(a > b) {
				ans = ">";
			} else if(a < b) {
				ans = "<";
			} else {
				ans = "=";
			}
			System.out.println("#" + tc + " " + ans);
		}
		sc.close();
	}

}
