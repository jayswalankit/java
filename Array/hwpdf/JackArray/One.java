public class One {
    public static void main(String[] args) {
        int[][] arr = {
            {1, 2, 3, 4},
            {1, 2, 3},
            {1, 3}
        };

        for (int i = 0; i < arr.length; i++) {
            int max = arr[i][0]; 
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] > max) {
                    max = arr[i][j];
            }
            System.out.println("Max in row " + i + ": " + max); 
        }
    }
}