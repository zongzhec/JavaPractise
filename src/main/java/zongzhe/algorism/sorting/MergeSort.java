package zongzhe.algorism.sorting;

/**
 * Divide and conquer
 */
public class MergeSort {

    public int[] sort(int[] array) {
        if (array == null || array.length <= 1) return array;
        return divedeAndMerge(array);
    }

    private static int[] divedeAndMerge(int[] array) {
        if (array.length < 2) return array;
        int middle = (int) array.length / 2;
        int[] left = passValue(0, middle - 1, array);
        int[] right = passValue(middle, array.length - 1, array);
        return merge(divedeAndMerge(left), divedeAndMerge(right));
    }

    private static int[] passValue(int start, int end, int[] originArray) {
        int[] newArray = new int[end - start + 1];
        for (int i = 0; i < newArray.length; i++) {
            newArray[i] = originArray[start + i];
        }
        return newArray;
    }

    private static int[] merge(int[] array1, int[] array2) {
        int[] mergeedArray = new int[array1.length + array2.length];
        int index1 = 0;
        int index2 = 0;
        int indexM = 0;
        while (indexM < mergeedArray.length) {
            if (index1 == array1.length) {
                mergeedArray[indexM] = array2[index2];
                index2++;
            } else if (index2 == array2.length) {
                mergeedArray[indexM] = array1[index1];
                index1++;
            } else {
                if (array1[index1] < array2[index2]) {
                    mergeedArray[indexM] = array1[index1];
                    index1++;
                } else {
                    mergeedArray[indexM] = array2[index2];
                    index2++;
                }
            }
            indexM++;
        }
        return mergeedArray;
    }
}
