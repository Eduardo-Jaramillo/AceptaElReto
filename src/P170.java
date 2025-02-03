import java.util.Scanner;

public class P170 {

    public static void main(String[] Args) {

        Scanner sc = new Scanner(System.in);
        int stones = sc.nextInt();
        while (stones != 0) {

            int sides = 0;
            while (stones > 0) {
                sides++;
                stones -= sides;
            }

            if (stones < 0) {
                stones += sides;
                sides--;
            }

            System.out.println(sides + " " + stones);
            stones = sc.nextInt();

        }

    }

}
