package zongzhe.algorism.sorting;

public class ShellSort {

    public int[] sort(int[] array) {
        if (array == null || array.length <= 1) return array;

        for (int step = (int) array.length / 2; step >= 1; step = (int) step / 2) {
            for (int i = step; i < array.length; i++) {
                int j = i;
                while (j - step >= 0) {
                    if (array[j - step] > array[j]) {
                        int temp = array[j - step];
                        array[j - step] = array[j];
                        array[j] = temp;
                    }
                    j = j - step;
                }
            }
        }
        return array;
    }
}
