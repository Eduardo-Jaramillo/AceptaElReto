import java.util.*;

public class P464 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {

            int amount = sc.nextInt();
            int[][] times = new int[amount][3];

            for (int i = 0; i < amount; i++) {
                String[] line = sc.next().split(":");
                times[i][0] = Integer.parseInt(line[0])*60*60 + Integer.parseInt(line[1])*60 + Integer.parseInt(line[2]);
                times[i][1] = i;
            }

            Arrays.sort(times, new Comparator<int[]>() {
                public int compare(int[] o1, int[] o2) {
                    return o1[0] - o2[0];
                }
            });

            times[0][2] = 1;
            for (int i = 1; i < amount; i++) {
                if (times[i-1][0] >= times[i][0]-1) {
                    times[i][2] = times[i-1][2];
                } else {
                    times[i][2] = i+1;
                }
            }

            Arrays.sort(times, new Comparator<int[]>() {
                public int compare(int[] o1, int[] o2) {
                    return o1[1] - o2[1];
                }
            });

            for (int i = 0; i < amount; i++) {
                System.out.println(times[i][2]);
            }
            System.out.println("---");

        }

    }

}
