

public class One {
    static void sum(int[]numbers){
        int sum=0;
        for(int a:numbers){
       sum+=a;
    }
    System.out.println(sum);
    }

    public static void main(String[] args) {
        sum(new int[] {2,3,4,5,1});

    }
}
