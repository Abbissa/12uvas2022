import java.util.Scanner;

public class F {

    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {
            while (true) {
                int v0 = sc.nextInt();
                int v1 = sc.nextInt();
                int n = sc.nextInt();
                if (v0 == 0 && v1 == 0 && n == 0)
                    System.exit(0);
                n = n % 6;
                int res = 0;
                switch (n) {
                    case 0:
                        res = v0;
                        break;
                    case 1:
                        res = v1;
                        break;
                    case 2:
                        res = v1 - v0;
                        break;
                    case 3:
                        res = -v0;
                        break;
                    case 4:
                        res = -v1;
                        break;
                    case 5:
                        res = v0 - v1;
                        break;

                }

                System.out.println(res);
            }

        }
    }
}
