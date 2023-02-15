import java.util.Scanner;

public class J {

    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {
            while (sc.hasNextInt()) {
                int n = sc.nextInt();

                long t1 = 0;
                long t2 = 0;

                while (n > 0) {
                    if (t1 > t2)
                        t2 += sc.nextLong();
                    else {
                        t1 += sc.nextLong();
                    }
                    n--;
                }
                Long res = 2 * Math.max(t1, t2);
                System.out.println(res);
            }
        }
    }
}
