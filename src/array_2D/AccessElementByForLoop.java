package array_2D;

public class AccessElementByForLoop {

	public static void main(String[] args) {
		int[][] a = new int[5][5];
		for (int[] b : a) {
			for (int c : b) {
				System.out.print(c + " ");
			}
			System.out.println();
		}
	}

}
