package game;

import java.util.Scanner;
public class GameFromStudent_Tariq_Jake {


	
		static int[][] m = new int[8][7];
		public static char[][] map = new char[8][7];

		public static void main(String[] args) {
			Scanner user = new Scanner(System.in);

			int num;
			boolean pRTurn = true;
			int row;
			int col;
			while (!isGameOver()) {

				if (pRTurn) {
					num = 4;
					System.out.print("Drop a O disk at column (0–6) : ");
					col = user.nextInt();
					row = dropDisk(col, num);
				} else {
					num = 5;
					System.out.print("Drop a 0 disk at column (0–6) : ");
					col = user.nextInt();
					row = dropDisk(col, num);
				}
				if (row == -1) {
					System.out.println("That column is full, try another one.");
					continue;
				}
				changeMap(row, col, pRTurn);
				displayMap();
				pRTurn = !pRTurn;

			}
			if (!pRTurn) {
				System.err.println("O WON !!!");
			} else {
				System.out.println("0 WON !!!");
			}

		}

		public static void displayMap() {
			for (int i = 0; i < m.length; i++) {
				for (int j = 0; j < m[i].length; j++) {
					if (map[i][j] == '\u0000') {
						System.out.print("|   |");
						}else if (map[i][j] == '0'){
							System.out.print("| " + map[i][j] + " |");
						} else {
							System.out.print("| " + map[i][j] + " |");
					}
				}
				System.out.println();
			}
			System.out.println("----------------------------------");

		}

		private static void changeMap(int row, int col, boolean pRTurn) {

			for (int i = 0; i < map.length; i++) {
				for (int j = 0; j < map[i].length; j++) {

					if (map[i][j] == '\u0000' && i == row && j == col) {
						map[i][j] = pRTurn ? 'O' : '0';
					} else {
						map[i][j] = map[i][j];
					}
				}
			}

		}

		private static int dropDisk(int column, int num) {

			for (int i = m.length - 1; i >= 0; i--) {
				if (m[i][column] == 0) {
					m[i][column] = num;
					return i;
				}
			}
			return -1;
		}

		private static boolean isGameOver() {
			return (checkTheRows() || checkTheColumns() || checkTheLeftDiagonal() || checkTheRightDiagonal());
		}

		public static boolean checkTheRows() {
			int sum;
			for (int i = 0; i < m.length; i++) {
				for (int j = 0; j < m[i].length - 3; j++) {
					sum = 0;
					for (int k = 0; k < 4; k++) {
						sum += m[i][j + k];
					}
					if (sum == 20 || sum == 16) {
						return true;
					}
				}
			}
			return false;
		}

		public static boolean checkTheColumns() {
			int sum;
			for (int i = 0; i < m[0].length; i++) {
				for (int j = 0; j < m.length - 3; j++) {
					sum = 0;
					for (int k = 0; k < 4; k++) {
						sum += m[j + k][i];
					}
					if (sum == 20 || sum == 16) {
						return true;
					}
				}
			}
			return false;
		}

		public static boolean checkTheLeftDiagonal() {
			int sum;
			for (int i = 3; i < m.length; i++) {
				for (int j = 0; j < m[i].length - 3; j++) {
					sum = 0;
					for (int k = 0; k < 4; k++) {
						sum += m[i - k][j + k];
					}
					if (sum == 20 || sum == 16) {
						return true;
					}
				}
			}
			return false;
		}

		public static boolean checkTheRightDiagonal() {
			int sum;
			for (int i = 0; i < m.length - 3; i++) {
				for (int j = 0; j < m[i].length - 3; j++) {
					sum = 0;
					for (int k = 1; k < 4; k++) {
						sum += m[i + k][j + k];
					}
					if (sum == 20 || sum == 16) {
						return true;
					}
				}
			}
			return false;
		}
	
	
}
