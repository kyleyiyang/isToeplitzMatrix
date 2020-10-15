public class Main
{
	public static void main(String[] args) {
		System.out.println("Hello World");
		int[][] matrix = {{1,2},{2,2}};
		boolean t=isToeplitzMatrix(matrix);
		System.out.println(t);
	}
	public static boolean isToeplitzMatrix(int[][] matrix) {
	    for (int i=0;i<matrix.length-1;i++) {
	        for (int j=0;j<matrix[0].length-1;j++) {
	            if (matrix[i][j]!=matrix[i+1][j+1]) {
	                return false;
	            }
	        }
	    }
	    return true;
	}
}
// using array comparison

import java.util.Arrays;
public class Main
{
	public static void main(String[] args) {
		System.out.println("Hello World");
		int[][] matrix = {{1,2,3,4},{5,1,2,3},{9,5,1,2}};
		boolean t=isToeplitzMatrix(matrix);
		System.out.println(t);
	}
	public static boolean isToeplitzMatrix(int[][] matrix) {
	    for (int i=0;i<matrix.length-1;i++) {
	        int[] arr1= Arrays.copyOfRange(matrix[i],0,matrix[0].length-1);
	        int[] arr2= Arrays.copyOfRange(matrix[i+1],1,matrix[0].length);
	    	if (!Arrays.equals(arr1,arr2)) {
			return false;
	    	}
	    }
	    return true;
	}
}
