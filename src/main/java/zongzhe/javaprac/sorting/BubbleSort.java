package zongzhe.javaprac.sorting;

public class BubbleSort {

    public int[] bubbleSort(int[] inputArray) {
        System.out.println("Using bubble sorting!");
        for (int i = 0; i < inputArray.length - 1; i++) {
            for (int j = i + 1; j < inputArray.length; j++) {
                if (inputArray[i] > inputArray[j]) {
                    int temp = inputArray[i];
                    inputArray[i] = inputArray[j];
                    inputArray[j] = temp;
                }
            }
        }
        return inputArray;
    }
}
