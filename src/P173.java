import java.util.*;

public class P173 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        while (true) {

            char[] line = sc.nextLine().toCharArray();
            if (line[0] == 'F') {break;}

            char turn = 'A';
            boolean espacio = false;
            boolean pending = true;
            int[] results = {0,0};

            for (char c : line) {

                if (c != 'F') {
                    if (c == turn) {
                        results[(turn == 'A') ? 0 : 1]++;
                    } else {
                        turn = (turn == 'A') ? 'B' : 'A';
                    }
                    pending = true;
                }

                if (((results[0] > 8 || results[1] > 8) && Math.abs(results[0] - results[1]) > 1) || (c == 'F' && pending)) {
                    if (espacio) System.out.print(" ");
                    espacio = true;
                    System.out.print(results[0] + "-" + results[1]);
                    results[0] = 0;
                    results[1] = 0;
                    pending = false;
                }

            }

            System.out.println();

        }

    }

}