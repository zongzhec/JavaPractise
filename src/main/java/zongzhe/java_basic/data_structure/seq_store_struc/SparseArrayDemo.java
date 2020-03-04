package zongzhe.java_basic.data_structure.seq_store_struc;

/**
 * @see <a href="https://www.bilibili.com/video/av54029771?p=8</a>
 */
public class SparseArrayDemo {

    public static void main(String args[]) {
        // Create a two-dimension array, 0 means no chess, 1 means blank and 2 means blue
        int[][] chessArr1 = new int[11][11];
        chessArr1[1][2] = 1;
        chessArr1[2][3] = 2;
        // print our origin 2-d array
        System.out.println("Original 2-d array");
        for (int[] row : chessArr1) {
            for (int chess : row) {
                System.out.printf("%d\t", chess);
            }
            System.out.println();
        }

        // Convert 2-d array into sparse array
        // Step 1: iterate the original array and get all non-zero values
        int sum = 0;
        for (int[] row : chessArr1) {
            for (int chess : row) {
                if (chess != 0) sum++;
            }
        }
        System.out.println("sum = " + sum);

        // Step 2: Create corresponding sparse array
        int[][] sparseArr = new int[sum + 1][3];
        sparseArr[0][0] = chessArr1.length;
        sparseArr[0][1] = chessArr1[0].length;
        sparseArr[0][2] = sum;

        // Step 3: iterate 2-d array, and store non-zero values into sparse array
        int rowIndex = 1;
        for (int i = 0; i < chessArr1.length; i++) {
            for (int j = 0; j < chessArr1[0].length; j++) {
                if (chessArr1[i][j] != 0) {
                    sparseArr[rowIndex][0] = i;
                    sparseArr[rowIndex][1] = j;
                    sparseArr[rowIndex][2] = chessArr1[i][j];
                    rowIndex++;
                }
            }
        }

        System.out.println("Printing sparse array");
        for (int[] row : sparseArr) {
            for (int item : row) {
                System.out.printf("%d\t", item);
            }
            System.out.println();
        }

        // Step 4: Revert the saprse array back to 2-d array
        int[][] chessArr2 = new int[sparseArr[0][0]][sparseArr[0][1]];
        for (int i = 1; i < sparseArr.length; i++) {
            chessArr2[sparseArr[i][0]][sparseArr[i][1]] = sparseArr[i][2];
        }
        System.out.println("Printing roll back 2-d array");
        for (int[] row : chessArr2) {
            for (int chess : row) {
                System.out.printf("%d\t", chess);
            }
            System.out.println();
        }

    }
}
