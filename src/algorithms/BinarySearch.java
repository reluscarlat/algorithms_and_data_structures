package algorithms;

public class BinarySearch {
    public boolean arrayContains(int array[],int low, int high, int value) {
        int mid = (low + high) / 2;
        if(array[mid] == value) return true;
        if(array[mid] < value && mid < high) {
            return arrayContains(array, mid + 1, high, value);
        }
        if(array[mid] > value && low < mid) {
            return arrayContains(array, low, mid - 1, value);
        }
        return false;
    }

    public boolean binarySearchIterative(int array[], int value) {
        int mid;
        int low = 0;
        int high = array.length;
        while( low <= high) {
            mid = (low + high)/2;
            if(array[mid] == value) return true;
            if(value < array[mid]) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return false;
    }

    public int binarySearch(int arr[], int l, int r, int x)
    {
        if (r >= l) {
            int mid = l + (r - l) / 2;

            // If the element is present at the
            // middle itself
            if (arr[mid] == x)
                return mid;

            // If element is smaller than mid, then
            // it can only be present in left subarray
            if (arr[mid] > x)
                return binarySearch(arr, l, mid - 1, x);

            // Else the element can only be present
            // in right subarray
            return binarySearch(arr, mid + 1, r, x);
        }

        // We reach here when element is not present
        // in array
        return -1;
    }
}
