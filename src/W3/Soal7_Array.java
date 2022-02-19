package W3;
import java.util.Arrays;
import java.util.Scanner;
import java.util.regex.Pattern;
/**
 * <h1>Multi Dimensional Array in Java!</h1>
 * 
 * @author YasminA
 * @version 1.0
 * @since 2022-02-19
 *
 */

public class Soal7_Array {
	public static void main(String[] args) {
		//One Dimensional Arrays
		int[] fisrtArray = {2, 5, 3};
		int[] secondArray = {9, 5, 3};
		int[] thirdArray = {2, 4, 9};
		int[] fourthArray = {10, 11, 12};
		int[] fifthArray = {13, 14, 15};
		int[] sixthArray = {16, 17, 18};
		int[] seventhArray = {19, 20, 21};
		int[] eighthArray = {22, 23, 24};
		int[] ninthArray = {25, 26, 27};
		
		//Two Dimensional Arrays
		int[][] twoDimensionalArray1 = {fisrtArray, secondArray, thirdArray};
		int[][] twoDimensionalArray2 = {fourthArray, fifthArray, sixthArray};
		int[][] twoDimensionalArray3 = {seventhArray, eighthArray, ninthArray};
		
		//Three Dimensional Array
		int[][][] threeDimensionalArray = {twoDimensionalArray1, twoDimensionalArray2, twoDimensionalArray3};
		
		for (int[][] x : threeDimensionalArray) {
			// replace the '[', ']', and ',' symbol appears at console to '{', ' }', and '' respectively
			System.out.println(Arrays.deepToString(x).replaceAll("\\[", "{").replaceAll("\\]", " }").replaceAll(",", ""));
	}
}
}
