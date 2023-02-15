import java.util.Scanner;

public class E {

    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {

            while (true) {
                String año = sc.next();

                if (año.equals("0"))
                    System.exit(0);

                int[] uvasN = new int[10];

                for (int i = 0; i < año.length(); i++) {
                    uvasN[Integer.parseInt(año.charAt(i) + "")]++;
                }
                for (int i = 0; i < uvasN.length; i++) {
                    uvasN[i] *= 3;
                }

                int min = 1_000_000_000;

                for (int i = 0; i < uvasN.length; i++) {
                    int n  = sc.nextInt();
                    if (uvasN[i] != 0)
                        min = Math.min(min, n / uvasN[i]);
                }
                System.out.println(min);

            }
        }

    }

}
