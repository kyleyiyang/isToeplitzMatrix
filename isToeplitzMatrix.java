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
