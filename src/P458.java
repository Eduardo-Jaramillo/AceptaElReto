import java.util.Arrays;
import java.util.Scanner;

public class P458 {

    public static void main(String[] Args) {

        Scanner sc = new Scanner(System.in);
        int quantity = sc.nextInt();
        while (quantity != 0) {

            long[] numbers = new long[quantity];
            for (int i = 0; i < quantity; i++) {
                numbers[i] = sc.nextLong();
            }

            Arrays.sort(numbers);

            Long negative = null;
            if (numbers[0] < 0) {
                negative = numbers[0] * numbers[1];
            }
            long positive = numbers[numbers.length - 1] * numbers[numbers.length - 2];

            long value = (negative != null) ? Math.max(negative, positive) : positive;
            System.out.println(value);
            quantity = sc.nextInt();

        }

    }

}
