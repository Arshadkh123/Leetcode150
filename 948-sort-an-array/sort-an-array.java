class Solution {
    public int[] sortArray(int[] nums) {
        Mergesort(nums, 0, nums.length - 1);
        return nums; 
    }

    private void Mergesort(int a[], int l, int h) {
        if (l < h) {
            int mid = l + (h - l) / 2;  // Correct calculation of mid
            Mergesort(a, l, mid);
            Mergesort(a, mid + 1, h);
            Merging(a, l, mid, h);
        }
    }

    private void Merging(int a[], int low, int mid, int high) {
        int b[] = new int[high - low + 1];  // Correct size for the temporary array
        int i = low, j = mid + 1, k = 0;    // Initialize k to 0

        while (i <= mid && j <= high) {
            if (a[i] < a[j]) {
                b[k++] = a[i++];
            } else {
                b[k++] = a[j++];
            }
        }

        // Copy remaining elements from the left side
        while (i <= mid) {
            b[k++] = a[i++];
        }

        // Copy remaining elements from the right side
        while (j <= high) {
            b[k++] = a[j++];
        }

        // Copy sorted elements back to the original array
        for (i = 0; i < b.length; i++) {
            a[low + i] = b[i];
        }
    }
}
