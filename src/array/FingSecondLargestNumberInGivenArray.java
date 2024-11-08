package array;

public class FingSecondLargestNumberInGivenArray {

	public static void main(String[] args) {

		int[] a= {101,100,97,98,9,8,88,8,56,89,37,10};
		int max=a[0];
		int smax=a[1];
		
		for(int i=1;i<a.length;i++) {
			if(max<a[i]) {
				smax=max;
				max=a[i];
			}
			else if(smax<a[i]) {
				smax=a[i];
			}
		}
		System.out.println(smax);
	}

}
