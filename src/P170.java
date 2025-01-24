import java.util.Scanner;

public class P170 {

    public static void main(String[] Args) {

        Scanner sc = new Scanner(System.in);
        int stones = sc.nextInt();
        while (stones != 0) {

            int sides = 1;
            int quant = 1;
            int remain = 0;

            while (quant < stones) {
                sides++;
                quant += sides;
            }

            if (quant != stones) {
                remain = stones-quant-sides;
                sides--;
            }

            System.out.println(sides + " " + remain);
            stones = sc.nextInt();

        }

    }

}
