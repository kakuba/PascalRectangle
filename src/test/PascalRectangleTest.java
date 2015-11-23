package test;



import org.junit.Assert;
import org.junit.Test;

import main.PascalRectangle;

public class PascalRectangleTest {

	@Test
	public void shouldMakePascalMatrix() {
		//given
		int numberOfRow = 4;
		int[][] expectedResult = {{1,0,0,0},{1,1,0,0},{1,2,1,0},{1,3,3,1}};
		int[][] result = new int[numberOfRow-1][numberOfRow-1];
		//when
		result = PascalRectangle.makePascalMatrix(numberOfRow-1);
		//then
		for(int i = 0;i < result.length;i++){
			for(int j = 0;j <= i;j++){
				Assert.assertEquals(expectedResult[i][j], result[i][j]);
				
			}
		}
	}
	@Test
	public void shouldGetValueFromPascalMatrix() {
		//given
		int numberOfRow = 9;
		int expectedResult = 84;
		//when
		int[][] pascalMatrix = PascalRectangle.makePascalMatrix(numberOfRow);
		int result = pascalMatrix[9][6];
		//then
		Assert.assertEquals(expectedResult, result);
				
	}
	@Test
	public void shouldReturnTrueIfValuesAreNotNegative() {
		//given
		boolean expectedResult = true;
		int c = 2;
		int r = 4;
		//when
		boolean result = PascalRectangle.checkNumbers( r, c);
		//then
		Assert.assertEquals(expectedResult, result);
	}
	@Test
	public void shouldReturnFalseIfCValueIsNegative() {
		//given
		boolean expectedResult = false;
		int c = -1;
		int r = 4;
		//when
		boolean result = PascalRectangle.checkNumbers( r, c);
		//then
		Assert.assertEquals(expectedResult, result);
	}
	@Test
	public void shouldReturnTrueIfCValueIsLessThenRValue() {
		//given
		boolean expectedResult = true;
		int c = 2;
		int r = 4;
		//when
		boolean result = PascalRectangle.checkNumbers( r, c);
		//then
		Assert.assertEquals(expectedResult, result);
	}

}
