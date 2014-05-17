/**
 * 
 */
package HW3.num1;

import java.util.Random;

/**
 * @author		: PROP
 * @date		: 2014. 5. 10.
 * @explanation	: 
 */
public class InversionCount {
	public static void main(String args[]) {
		Random rand = new Random();
		int arr[] = new int[20];
		for(int i=0; i<arr.length; i++) {
			arr[i] = rand.nextInt(100);
			System.out.print(arr[i] +" ");
		}
		System.out.println();
		
		int count = MergeSort.sorting(arr, 0, arr.length-1); 
		System.out.println("Number of inversions are " +count);
	}
}
