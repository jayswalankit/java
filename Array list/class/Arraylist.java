import java.util.*;
public class Arraylist {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(23);
        
        numbers.add(73);
        
        numbers.add(13);
        
        numbers.add(3);
        
        numbers.add(34);

        numbers.remove(2);

        // numbers.add(2, 100);

        int sum = 0; 

        for (Integer no : numbers) { 
            sum += no;
        }

        System.out.println("Sum of numbers is " + sum); 
        System.out.println("First number is " + numbers.get(0)); 
        System.out.println("Last number is " + numbers.get(numbers.size() - 1)); 
        System.out.println("Number at index 2 is " + numbers.get(2));
        System.out.println("Class of numbers is " + numbers.getClass());
    }
}
