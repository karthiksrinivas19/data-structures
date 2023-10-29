class mergesort {
    public void Mergesort(int arr[], int start, int end) {
        if (start < end) {
            int mid = (start + end) / 2;
            Mergesort(arr, start, mid);
            Mergesort(arr, mid + 1, end);
            merge(arr, start, mid, end);
        }
    }

    public void merge(int arr[], int start, int middle, int end) {
        int n1 = middle - start + 1;
        int n2 = end - middle;

        int left[] = new int[n1];
        int right[] = new int[n2];

        for (int i = 0; i < n1; i++) {
            left[i] = arr[start + i];
        }
        for (int i = 0; i < n2; i++) {
            right[i] = arr[middle + 1 + i];
        }

        int i = 0, j = 0, k = start;

        while (i < n1 && j < n2) {
            if (left[i] <= right[j]) {
                arr[k] = left[i];
                i++;
            } else {
                arr[k] = right[j];
                j++;
            }
            k++;
        }
        while (i < n1) {
            arr[k] = left[i];
            i++;
            k++;
        }

        while (j < n2) {
            arr[k] = right[j];
            j++;
            k++;
        }
    }

    public static void main(String[] args) {
        mergesort sorter = new mergesort();
        int array[] = {1, 5, 4, 2, 3, 8, 6, 7};
        sorter.Mergesort(array, 0, 7);
        for (int i = 0; i < 8; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
