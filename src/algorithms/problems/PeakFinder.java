package algorithms.problems;

public class PeakFinder {
    int array[] = {0,1,2,3,4,5,6,7,8,66,9,10,9,1};

    private int findPickIndex(int leftIndex, int rightIndex) {
        int mid = (leftIndex + rightIndex) / 2;
        if(array[mid - 1] > array[mid] ) {
            return findPickIndex(leftIndex,mid);
        } else {
            if(array[mid] < array[mid + 1]) {
                return findPickIndex(mid, rightIndex);
            }
        }
        return mid;
    }

    public int findPickIndex() {
        if(array[0] > array[1]) return 0;
        if(array[array.length-2] < array[array.length-1]) return array.length-1;
        return findPickIndex(1, array.length-2);
    }

}
