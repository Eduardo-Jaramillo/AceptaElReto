import java.util.HashMap;
import java.util.Scanner;

public class P748 {

    public static void main(String[] Args) {

        Scanner sc = new Scanner(System.in);

        int cantidad = sc.nextInt();

        while (cantidad != 0) {

            HashMap<String,Integer> armas = new HashMap<>();
            for (int i = 0; i < cantidad; i++) {

                String name = sc.next();
                int quantity = sc.nextInt();

                if (name.contains("?")) {
                    int get = 0;
                    for (int j = 0; j < quantity; j++) {
                        String key = sc.next();
                        get += armas.get(key);
                        armas.remove(key);
                    }
                    System.out.println(get);
                } else {
                    if (armas.containsKey(name)) {
                        armas.put(name, armas.get(name) + quantity);
                    } else {
                        armas.put(name, quantity);
                    }
                }

            }
            System.out.println("---");
            cantidad = sc.nextInt();

        }

    }

}
