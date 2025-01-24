import java.util.Scanner;

public class P653 {

    public static void main(String[] Args) {

        Scanner sc = new Scanner(System.in);
        int totalSegments = sc.nextInt();
        while (totalSegments != 0) {
            int[] segments = new int[totalSegments];
            for (int i = 0; i < totalSegments; i++) {
                int amount = sc.nextInt();
                if (amount == 0) {amount = 1;};
                if (amount > 30) {amount = 30;};
                segments[i] = amount;
            }

            int pos = -1;
            int num = -1;
            for (int i = totalSegments - 10; i >= 0; i--) {
                int sum = 0;
                for (int j = i; j < i + 10; j++) {
                    sum += segments[j];
                }
                if (sum < num || pos == -1) {
                    pos = i;
                    num = sum;
                }
            }

            int min = num / 60;
            int sec = num % 60;
            String filler = (sec / 10 == 0) ? "0" : "";
            pos *= 100;
            System.out.println(pos + "-" + (pos + 1000) + " " + min + ":" + filler + sec);
            totalSegments = sc.nextInt();

        }

    }

}
