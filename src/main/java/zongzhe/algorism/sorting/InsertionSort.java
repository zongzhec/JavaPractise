package zongzhe.algorism.sorting;

public class InsertionSort {

    public int[] sort(int[] array) {
        if (array == null || array.length <= 1) return array;

        for (int i = 1; i < array.length; i++) {
            int j = i - 1;
            while (j >= 0 && array[j] > array[j + 1]) {
                int temp = array[j + 1];
                array[j + 1] = array[j];
                array[j] = temp;
                j--;
            }
        }

        return array;
    }
}


