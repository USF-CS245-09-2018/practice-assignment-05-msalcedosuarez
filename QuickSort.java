
public class QuickSort implements SortingAlgorithm{


	public void sort(int [] a){

		helperSort(a, 0, a.length-1);
	}
 
	public static void helperSort(int[] a, int low, int high) {
		if (a == null || a.length == 0){
			return;
		}
 
		if (low >= high){
			return;
		}
 
		// pick the pivot
		int middle = low + (high - low) / 2;
		int pivot = a[middle];
 
		// make left < pivot and right > pivot
		int i = low, j = high;
		while (i <= j) {
			while (a[i] < pivot) {
				i++;
			}
 
			while (a[j] > pivot) {
				j--;
			}
 
			if (i <= j) {
				int temp = a[i];
				a[i] = a[j];
				a[j] = temp;
				i++;
				j--;
			}
		}
 
		// recurses
		if (low < j){
			helperSort(a, low, j);
		}
 
		if (high > i){
			helperSort(a, i, high);
		}
	}
}