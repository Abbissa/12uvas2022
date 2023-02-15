import java.util.Scanner;

public class A {

    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            for (int i = 0; i < n; i++) {
                int res = sc.nextInt();
                if (res > 0)
                    res--;
                System.out.println(res);

            }
        }
    }

}
