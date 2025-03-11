
public class Question15 {

    public void pascal(int n){
         for(int i=0;i<=n;i++){
           
            int a=1;
            for(int k=0;k<=i;k++){
             System.out.print(a +" ");
             a=a*(i-k)/(k+1);
            }
            System.out.println(" ");
         }
    }
    public static void main(String[] args) {
        Question15 obj=new Question15();
        obj.pascal(4);
    }
}



// public class Question15 {

//     public void pascal(int n) {
//         int[][] triangle = new int[n][n];
        
//         for (int i = 0; i < n; i++) {
//             for (int j = 0; j <= i; j++) {
//                 if (j == 0 || j == i) {
//                     triangle[i][j] = 1;
//                 } else {
//                     triangle[i][j] = triangle[i - 1][j - 1] + triangle[i - 1][j];
//                 }
//                 System.out.print(triangle[i][j] + " ");
//             }
//             System.out.println();
//         }
//     }

//     public static void main(String[] args) {
//         Question15 obj = new Question15();
//         obj.pascal(5); // Generate Pascal's Triangle with 5 rows
//     }
// }
