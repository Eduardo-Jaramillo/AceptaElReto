import java.util.*;

public class P336 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            int n = sc.nextInt();
            int[] nums = new int[n];

            int total = 0;
            for (int i = 0; i < n; i++) {
                nums[i] = sc.nextInt();
                total += nums[i];
            }

            if (n == 2) {
                System.out.println("1 " + nums[0] + " " + nums[1]);
                continue;
            }

            int left = 0;
            int center = 0;

            for (int i = 0; (i < n) && (left + nums[i] <= total/2); i++) {
                left += nums[i];
                center++;
            }

            int right = 0;
            for (int i = center+1; i < n; i++) {
                right += nums[i];
            }

            int testLeft = left + nums[center];
            int testRight = right + nums[center];

            if (testLeft > testRight) {
                right = testRight;

            } else if ((left) == (right)) {
                System.out.println("NO JUEGAN");
                continue;

            } else {
                left = testLeft;
                center++;

            }

            System.out.println(center + " " + left + " " + right);

        }

    }

}