package zongzhe.algorism.sorting;

public class SelectionSort {

    public int[] sort(int[] inputArray) {
        if (inputArray == null || inputArray.length < 2) return inputArray;
        for (int i = 0; i < inputArray.length - 1; i++) {
            int minNum = inputArray[i];
            int minIndex = i;
            for (int j = i + 1; j < inputArray.length; j++) {
                if (inputArray[j] < minNum) {
                    minNum = inputArray[j];
                    minIndex = j;
                }
            }
            if (minNum < inputArray[i]) {
                // swap the values
                inputArray[minIndex] = inputArray[i];
                inputArray[i] = minNum;

            }
        }
        return inputArray;
    }
}
