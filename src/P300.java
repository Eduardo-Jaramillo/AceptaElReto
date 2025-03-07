import java.util.Scanner;

public class P300 {

    public static void main(String[] args) {

        final Scanner sc = new Scanner(System.in);

        int quant = sc.nextInt();

        for (int i = 0; i < quant; i++) {

            final String p = sc.next();

            boolean a = false;
            boolean e = false;
            boolean y = false;
            boolean o = false;
            boolean u = false;

            for (int j = 0; j < p.length(); j++) {

                if (p.charAt(j) == 'a') {
                    a = true;
                }

                if (p.charAt(j) == 'e') {
                    e = true;
                }

                if (p.charAt(j) == 'i') {
                    y = true;
                }

                if (p.charAt(j) == 'o') {
                    o = true;
                }

                if (p.charAt(j) == 'u') {
                    u = true;
                }

            }

            if (a && e && y && o && u) {
                System.out.println("SI");
            } else {
                System.out.println("NO");
            }

        }

    }

}
