package algorithms;
/*
 - > split array => n*chunks (size 1)
 - > compare values from each chunk => add to returned chunk
 - > merge the chunks

 */
public class SortingAlgorithms {

//    ------------------------------------------------------------------------------------------------------------------
//    QUICK-SORT

//    [][][][][][][][][][][]
    public static void quickSort(int array[]) {
        quickSort(array,0, array.length -1);
    }

    private static void quickSort(int array[], int leftStart, int rightEnd) {
        if(leftStart >= rightEnd) return;
        int leftEnd = placePivot(array,leftStart,rightEnd) - 1;

        int rightStart = leftEnd + 2;

        quickSort(array, leftStart, leftEnd);
        quickSort(array, rightStart,rightEnd);
    }

    private static int placePivot(int array[], int start, int end) {
        int pivot = end;
        boolean rightDirection = true;
        boolean isPlaced = false;
        while (!isPlaced) {
            isPlaced = true;
            if(rightDirection) {
                for (int i = start; i < pivot; i++) {
                    if (array[pivot] < array[i]) {
                        swap(array,pivot,i);
                        pivot = i;
                        isPlaced = false;
                        rightDirection = false;
                        break;
                    }
                }
            } else {
                for (int i = end; i > pivot; i--) {
                    if (array[pivot] > array[i]) {
                       swap(array,pivot,i);
                       pivot = i;
                       isPlaced = false;
                       rightDirection = true;
                       break;
                    }
                }
            }
        }
        return pivot;
    }



//    ------------------------------------------------------------------------------------------------------------------

//    MERGE-SORT
    public static void mergeSort(int array[]) {
        int copy[] = new int[array.length];
        for(int i = 0; i < array.length; i++) {
            copy[i] = array[i];
        }
        mergeSort(array, copy, 0, array.length -1);
    }

    private static void mergeSort (int array[], int copy[],int leftStart, int rightEnd) {
        if(!(leftStart < rightEnd)) return;
        int leftEnd = (leftStart + rightEnd) / 2;
        int rightStart = leftEnd + 1;
        mergeSort(array, copy, leftStart, leftEnd);
        mergeSort(array, copy, rightStart, rightEnd);
        mergeChunks(array, copy, leftStart, rightEnd);
    }

    private static void mergeChunks(int array[], int copy[], int leftStart, int rightEnd) {
        int leftEnd = (leftStart + rightEnd) / 2;
        int rightStart = leftEnd + 1;

        int i = leftStart;
        int j = rightStart;
        int k = leftStart;

//        [x][x][x] [x][x][x]
//
//        [/][x][x] [/][/][/]
//
//        [/][/][/] [/][x][x]

        while (i <= leftEnd && j <= rightEnd){
            if(copy[i] < copy[j]) {
                array[k] = copy[i];
                i++;
            } else {
                array[k] = copy[j];
                j++;
            }
            k++;
        }
        if(i <= leftEnd && j > rightEnd) {
            System.arraycopy(copy,i,array,k,leftEnd - i + 1);
        }
        if(j <= rightEnd && i > leftEnd) {
            System.arraycopy(copy,j,array,k, rightEnd - j + 1);
        }
        System.arraycopy(array,leftStart,copy,leftStart,rightEnd - leftStart);
    }
//    ------------------------------------------------------------------------------------------------------------------

//    BUBBLE-SORT
    private static void swap(int array[], int left, int right) {
        int aux = array[left];
        array[left] = array[right];
        array[right] = aux;
    }

    public static void bubbleSort(int array[]) {
        boolean isSorted = false;
        int lastIndex = array.length - 1;
        while (!isSorted) {
            isSorted = true;
            for (int i = 0; i < lastIndex; i++) {
                if (array[i] > array[i + 1]) {
                    swap(array, i, i+1);
                    isSorted = false;
                }
            }
            lastIndex--;
        }
    }
}

//    ------------------------------------------------------------------------------------------------------------------

