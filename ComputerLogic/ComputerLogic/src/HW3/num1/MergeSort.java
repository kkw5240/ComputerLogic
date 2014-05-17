/**
 * 
 */
package HW3.num1;

/**
 * @author : PROP
 * @date : 2014. 5. 10.
 * @explanation :
 */
public class MergeSort {
	static int mergeCount(int arr[], int left, int mid, int right) {
		int invertCount = 0;
		int tmp[] = new int[arr.length];

		int l = left;
		int m = mid;
		int r = left;

		while ((l <= mid - 1) && (m <= right)) {
			if (arr[l] <= arr[m]) {
				tmp[r++] = arr[l++];
			} else {
				tmp[r++] = arr[m++];
				invertCount += mid - l;
			}
		}

		while (l <= mid - 1)
			tmp[r++] = arr[l++];

		while (m <= right)
			tmp[r++] = arr[m++];

		for (l = left; l <= right; l++)
			arr[l] = tmp[l];

		return invertCount;
	}

	static int sorting(int arr[], int left, int right) {
		int mid, invertCount = 0;
		
		if (right > left) {
			mid = (right + left) / 2;
			
			invertCount = sorting(arr, left, mid);
			invertCount += sorting(arr, mid+1, right);
			
			invertCount += mergeCount(arr, left, mid+1, right);
		}
		return invertCount;
	}
}
