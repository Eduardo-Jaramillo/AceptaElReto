import java.util.Scanner;

public class P739 {

    public static void main(String[] Args) {

        Scanner sc = new Scanner(System.in);
        int quant = sc.nextInt();
        for (int i = 0; i < quant; i++) {
            int altoe = sc.nextInt();
            int anchoe = sc.nextInt();
            int altot = sc.nextInt();
            int anchot = sc.nextInt();

            int op11 = (altoe + (anchot-1)) / anchot;
            int op12 = (anchoe + (altot-1)) / altot;
            int op1 = op11 * op12;

            int op21 = (altoe + (altot-1)) / altot;
            int op22 = (anchoe + (anchot-1)) / anchot;
            int op2 = op21 * op22;

            System.out.println(Math.min(op1, op2));

        }

    }

}