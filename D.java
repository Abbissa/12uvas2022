import java.util.Scanner;

public class D {

    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            sc.nextLine();
            for (int i = 0; i < n; i++) {

                String f1 = sc.nextLine().toLowerCase().replaceAll("[^a-z]+", "");
                String f2 = sc.nextLine().toLowerCase().replaceAll("[^a-z]+", "");
                int i1 = 0;
                int i2 = 0;
                boolean error = false;
                while (i1 < f1.length() && i2 < f2.length()) {
                    char c1 = f1.charAt(i1);
                    char c2 = f2.charAt(i2);

                    
                    if (c2 != c1) {
                        error = true;
                        break;
                    }
                    i1++;
                    i2++;

                }
                if (error || i1 != f1.length() || i2 != f2.length()) {
                    System.out.println("NO");
                } else {
                    System.out.println("SI");
                }

            }
        }
    }

}
