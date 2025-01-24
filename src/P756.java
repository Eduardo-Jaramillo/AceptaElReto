import java.util.*;

public class P756 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int[] nums = new int[16];
            for (int i = 0; i < 16; i++) {
                nums[i] = sc.nextInt();
            }

            int reverse = 0;
            for (int i = 1; i < 16; i++) {
                for (int j = i-1; j >= 0; j--) {
                    if (nums[i] < nums[j]) {
                        reverse++;
                    }
                }
            }

            System.out.println(reverse%2==0?"SI":"NO");

        }

    }

}
