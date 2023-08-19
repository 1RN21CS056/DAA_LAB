package Merge_Sort;

public class mergesort {
    public void simpleMerge(int[] a, int low, int mid, int high) {
        int i = low;
        int j = mid + 1;
        int k = low;
        int[] c = new int[high + 1];
        while (i <= mid && j <= high) {
            if (a[i] < a[j]) {
                c[k] = a[i];
                i++;
                k++;
            } else {
                c[k] = a[j];
                j++;
                k++;
            }
        }
        while (i <= mid) {
            c[k] = a[i];
            i++;
            k++;
        }
        while (j <= high) {
            c[k] = a[j];
            j++;
            k++;
        }
        for (int l = low; l <= high; l++) {
            a[l] = c[l];
        }
    }

    public void mergeSort(int[] a, int low, int high) {
        if (low < high) {
            int mid = (low + high) / 2;
            mergeSort(a, low, mid);
            mergeSort(a, mid + 1, high);
            simpleMerge(a, low, mid, high);
        }
    }
}
