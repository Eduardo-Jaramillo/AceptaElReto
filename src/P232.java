import java.util.*;

public class P232 {

    public static void main(String[] args) {
        int[] months = {31,28,31,30,31,30,31,31,30,31,30,31};
        Scanner sc = new Scanner(System.in);
        while (true) {
            int sDay = sc.nextInt();
            int sMonth = sc.nextInt();
            int sYear = sc.nextInt();
            int eDay = sc.nextInt();
            int eMonth = sc.nextInt();
            int eYear = sc.nextInt();

            if (sDay == 0) {break;}
            if (sDay == eDay && sMonth == eMonth) {
                System.out.println("0");
                continue;
            }
            if (eYear == sYear && sMonth == eMonth) {
                System.out.println(eDay - sDay);
                continue;
            }

            int day = months[sMonth-1] - sDay;
            int month = eMonth - sMonth;
            int year = eYear - sYear;

            int total = day + eDay;

            int cont = sMonth;
            for (int i = 0; i < ((year * 12) + (month-1)); i++) {
                cont++;
                if (cont > 12) { cont = 1; }
                total += months[cont-1];
            }

            total -= year;

            if (eMonth < sMonth) {
                total++;
            } else if (eMonth == sMonth && eDay < sDay) {
                total++;
            }

            System.out.println(total);

        }

    }

}
