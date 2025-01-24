import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class P419 {

    public static void main(String[] Args) {

        Scanner sc = new Scanner(System.in);

        while (true) {

            int weight = sc.nextInt();
            int quantity = sc.nextInt();

            if ((weight == 0 && quantity == 0)) {
                break;
            }

            ArrayList<Integer> numeros = new ArrayList<>(quantity);

            for (int i = 0; i < quantity; i++) {
                numeros.add(sc.nextInt());
            }

            Collections.sort(numeros, Collections.reverseOrder());

            int contador = 0;
            int start = 0;
            int end = numeros.size() - 1;
            do {

                int operacion = numeros.get(start) + numeros.get(end);

                start++;
                if (operacion <= weight) {
                    end--;
                }

                contador++;
                if (start == end) {
                    contador++;
                }

            } while (start < end);

            System.out.println(contador);

        }

    }

}