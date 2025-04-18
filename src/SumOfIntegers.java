import java.util.*;

public class SumOfIntegers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter numbers separated by spaces: ");
        String input = scanner.nextLine();

        String[] numbers = input.split(" ");
        ArrayList<Integer> integerList = new ArrayList<>();

        for (String num : numbers) {
            // Autoboxing: converting int to Integer
            integerList.add(Integer.parseInt(num));
        }

        int sum = 0;
        for (Integer number : integerList) {
            // Unboxing: converting Integer to int
            sum += number;
        }

        System.out.println("Sum of numbers: " + sum);
    }
}
