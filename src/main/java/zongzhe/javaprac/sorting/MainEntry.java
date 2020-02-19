package zongzhe.javaprac.sorting;

public class MainEntry {

    public static void main(String args[]) {

        // Test empty numbers
        int[] emptyNumbers = {};
        testSorting(emptyNumbers, "emptyNumbers");

        // Test unit number array
        int[] unitNumber = {1};
        testSorting(unitNumber, "unitNumber");

        // Test double numbers
        int[] doubleNumbers = {2, 1};
        testSorting(doubleNumbers, "doubleNumbers");

        // Test odd numbers
        int[] oddNumbers = {2, 1, 6, 9, 8};
        testSorting(oddNumbers, "oddNumbers");

        // Test even numbers
        int[] evenNumbers = {7, 6, 9, 8, 5,1};
        testSorting(evenNumbers, "evenNumbers");
    }

    public static void testSorting(int[] initialArray, String desc) {
        printArray(initialArray, "numbers before sorting");

//        BubbleSort sortApproach = new BubbleSort();
//        QuickSort sortApproach = new QuickSort();
//        SelectionSort sortApproach = new SelectionSort();
//        InsertionSort sortApproach = new InsertionSort();
        ShellSort sortApproach = new ShellSort();
        int[] sortedNums = sortApproach.sort(initialArray);
        printArray(sortedNums, "numbers after bubble sorting");
        System.out.println();
    }

    public static void printArray(int[] arrayToPrint, String desc) {
        System.out.print(desc + ": ");
        for (int value : arrayToPrint) {
            System.out.print(value + " ");
        }
        System.out.println();

    }
}
