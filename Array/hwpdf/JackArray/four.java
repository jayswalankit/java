public class four {
    public static void main(String[] args) {
        int[][] arr = {
            {1, 2, 3, 44, 56, 778},
            {67, 4},
            {0, 12, 23, 55}
        };

        for (int i = 0; i < arr.length; i++) {
          
            for (int j = 0; j < arr[i].length - 1; j++) {
                for (int k = j + 1; k < arr[i].length; k++) {
                    if (arr[i][j] > arr[i][k]) { 
                        int temp = arr[i][j];
                        arr[i][j] = arr[i][k];
                        arr[i][k] = temp;
                    }
                }
            }
        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}