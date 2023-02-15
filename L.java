import java.util.Scanner;

public class L {

    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {
            while (true) {
                int d = sc.nextInt();
                long c = sc.nextLong();
                if (d == 0 && c == 0)
                    System.exit(0);
                long cincos = 0;
                for (int i = 1; i <= d; i++) {
                    int cin = i;

                    while (cin >= 5 && cin % 5 == 0) {
                        cincos++;
                        cin /= 5;
                    }
                }
                if (cincos > c) {
                    System.out.println("NINGUNO");
                    continue;
                } else if (cincos == c) {
                    System.out.println(d);
                    continue;
                }
                boolean encontrado = false;
                int k = d;
                while (!encontrado) {
                    k++;
                    int cin = k;

                    while (cin >= 5 && cin % 5 == 0) {
                        cincos++;
                        cin /= 5;
                    }
                    if (cincos == c && k % d == 0) {
                        System.out.println(k);
                        encontrado = true;
                        continue;
                    }
                }

            }
        }

    }

}
