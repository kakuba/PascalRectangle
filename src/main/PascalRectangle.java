package main;

/**
 * Created by ldrygala on 2015-01-23.
 * 0                     1
 * 1                   1   1
 * 2                 1   2   1
 * 3               1   3   3   1
 * 4             1   4   6   4   1
 * 5           1   5   10  10   5   1
 * 6         1   6   15  20  15   6   1
 * 7       1   7   21  35  35   21  7   1
 * 8     1   8   28  56  70  56   28  8   1
 * 9   1   9  36   84  126 126  84  36  9   1
 */

public class PascalRectangle {
	public static void main(String[] args){
		int c = 6;
		int r = 9;
		if(checkNumbers( r, c)){
			int[][] pascalMatrix = makePascalMatrix(r);
			int value = pascalMatrix[r][c];
			printMatrix(pascalMatrix);
			System.out.printf("Those value for [%d,%d] are %d", r, c, value);
		}
		else{
			System.out.printf("Error - %d or %d have wrong value, they should be more then or equal to 0 and c should be less then or equal to r", c, r);
		}
		
	}


	public static boolean checkNumbers(int r, int c) {
		if(r >= 0 && c >= 0 && c <= r){
			return true;
		}
		return false;
	}


	public static void printMatrix(int[][] pascalMatrix) {
		int value = 0;
		for(int i = 0;i < pascalMatrix.length;i++){
			for(int j = 0;j <= i;j++){
				value = pascalMatrix[i][j];
				System.out.printf("%d ", value);
			}
			System.out.printf("\n");
		}
	}


	public static int[][] makePascalMatrix(int r) {
		int[][] pascalMatrix = new int[r+1][r+1];
		for(int i = 0;i <= r;i++){
			pascalMatrix[i][0] = 1;
			pascalMatrix[i][i] = 1;
		}
		for(int i = 2;i <= r;i++){
			int sum = 0;
			int prev = 0;
			int next = 0;
			for(int j = 1;j < i;j++){
				sum = 0;
				prev = pascalMatrix[i-1][j-1];
				next = pascalMatrix[i-1][j];
				sum = prev + next;
				pascalMatrix[i][j] = sum;
			}
		}
		return pascalMatrix ;
	}
	
}
