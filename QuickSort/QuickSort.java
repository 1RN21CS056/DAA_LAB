package QuickSort;

public class QuickSort {
	void quicksort(int array[], int low, int high)
	{
		if(low>high)
			return;
		int k = partition(array, low, high);
		quicksort(array, low, k-1);
		quicksort(array, k+1, high);
	}
	
	int partition(int array[], int low, int high)
	{
		int i, j ,key;
		key = array[low];
		i = low;
		j = high;
		while(i<j)
		{
			while(key>=array[i] && i<high)
				i++;
			
			while(key<=array[j] && j>low)
				j--;
			
			if(i<j)
			{
				int temp = array[i];
				array[i]=array[j];
				array[j]=temp;
			}
		}
		int temp = array[low];
		array[low] = array[j];
		array[j] = temp;
		
		return j;
	}
}