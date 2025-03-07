import java.util.Scanner;
import java.util.TreeMap;

public class P701 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int unidades = sc.nextInt();

        while (unidades != 0) {

            final int bloques = sc.nextInt();

            TreeMap<Long, Integer> caducidad = new TreeMap<>();

            for (int i = 0; i < bloques; i++) {
                int quant = sc.nextInt();
                final long cad = sc.nextLong();

                if (caducidad.containsKey(cad)) {
                    quant += caducidad.get(cad);
                }

                caducidad.put(cad, quant);

            }

            Long last = 0L;

            for (Long key : caducidad.descendingKeySet()) {

                last = key;
                unidades -= caducidad.get(key);
                if (unidades < 1) {
                    break;
                }

            }

            System.out.println(last);

            unidades = sc.nextInt();

        }

    }

}
