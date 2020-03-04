package zongzhe.algorism.sorting;

/**
 * Step 1: choose a number as base
 * Step 2: for every number which less than the base, put it left; otherwise right;
 * Step 3: apply the same process for each divided number parts
 * Good article: https://zhuanlan.zhihu.com/p/64659156
 */

public class QuickSort {

    static int[] array;

    public int[] sort(int[] inputArray) {
        System.out.println("Using quick sorting!");
        if (inputArray == null || inputArray.length <= 1) return inputArray;
        array = inputArray;
        recursiveSort(array, 0, array.length - 1);
        return array;
    }

    static void recursiveSort(int[] inputArray, int start, int end) {
        if (start < end) {
            int baseNum = inputArray[start];
            int baseIndex = start;
            int i = start;
            int j = end;
            while (i < j) {
                while (inputArray[j] > baseNum && j > i) j--;
                while (inputArray[i] <= baseNum && i < j) i++;
                if (i < j) {
                    // swap start and end
                    int temp = inputArray[i];
                    inputArray[i] = inputArray[j];
                    inputArray[j] = temp;
                }

            }
            // swap base between initial position and target position
            inputArray[baseIndex] = inputArray[i];
            inputArray[i] = baseNum;
            if (start < i - 1) recursiveSort(inputArray, start, i - 1);
            if (end > j + 1) recursiveSort(inputArray, i + 1, end);
        }


    }
}
