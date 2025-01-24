import java.util.*;

public class P255 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()) {

            char[] characters = sc.next().toCharArray();

            int size = -1;
            int length = characters.length;

            for (int k = length; k > 1 && size == -1; k--) {

                int end = k;
                for (int j = 0; j <= length - k && size == -1; j++) {

                    boolean valid = true;
                    int v = end - 1;
                    for (int i = j; i < v; i++) {
                        if (characters[i] != characters[v--]) {
                            valid = false;
                            break;
                        }
                    }

                    if (valid) {
                        size = k;
                    }
                    end++;

                }

            }

            System.out.println(size != -1 ? size : 1);

        }

    }

}