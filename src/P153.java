import java.util.Scanner;

public class P153 {

    public static void main(String[] Args) {

        Scanner sc = new Scanner(System.in);

        int times = sc.nextInt();

        for (int i = 0; i < times; i++) {
            String[] time = sc.next().split(":");

            int hour = Integer.parseInt(time[0])-12;
            hour = (hour != 0) ? Math.abs(hour) : 12;

            int minute = Integer.parseInt(time[1]);
            if (minute != 0) {
                hour = (hour == 1) ? 12 : hour-1;
                minute = 60 - minute;
            }

            System.out.printf("%0,2d:%0,2d\n", hour, minute);
        }

    }

}