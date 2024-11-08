package array;

import java.util.Scanner;

public class RemoveElementOfArray {
	
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter size");
		int[] nums = new int[s.nextInt()];
		
		System.out.println("Enter element");
		for (int i = 0; i < nums.length; i++) {
			nums[i] = s.nextInt();
		}
		System.out.println("enter the element for remove");
		int val = s.nextInt();
		int b[] = new int[nums.length - 1];

		for (int i = 0, k = 0; i < nums.length; i++) {
			if (nums[i] != val) {
				b[k] = nums[i];
				k++;
			}
		}
//		System.out.println("befor");												
//		for (int i = 0; i < nums.length; i++)
//			System.out.println(nums[i]);
//		System.out.println("after");
//		for (int k = 0; k < b.length; k++)
//			System.out.println(b[k]);
System.out.println(b);
	}
}
