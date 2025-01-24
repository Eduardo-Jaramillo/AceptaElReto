import java.util.Scanner;

public class P677 {

    public static void main(String[] Args) {

        Scanner sc = new Scanner(System.in);

        int quantity = sc.nextInt();
        for (int i = 0; i < quantity; i++) {
            Long num = sc.nextLong();
            num = num / 10 ;
            num = num * (num+1);
            if (num != 0) {
                System.out.print(num);
            }
            System.out.println("25");
        }

    }

}
