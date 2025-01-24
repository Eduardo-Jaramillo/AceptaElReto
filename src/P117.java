import java.util.Scanner;

public class P117 {

    public static void main(String[] Args) {

        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < num; i++) {
            String frase = sc.nextLine();
            System.out.println("Hola, " + frase.substring(4) + ".");
        }

    }

}

