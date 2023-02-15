import java.util.Scanner;

public class C {

    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {

            int n = sc.nextInt();
            sc.nextLine();

            for (int i = 0; i < n; i++) {
                String[] v1 = sc.next().replace(".", "/").split("/");
                String[] v2 = sc.next().replace(".", "/").split("/");
                boolean major = false;
                boolean minor = false;

                int nv1 = Integer.parseInt(v1[0]);
                int nv2 = Integer.parseInt(v2[0]);
                if (nv2 == nv1+1) {
                    major = true;
                } else if (nv2!=nv1) {
                    System.out.println("NO");
                    continue;
                }

                nv1 = Integer.parseInt(v1[1]);
                nv2 = Integer.parseInt(v2[1]);

                if (major) {
                    if (nv2 == 0)
                        minor = true;
                    else {
                        System.out.println("NO");
                        continue;
                    }
                } else if (nv2 != nv1 && nv2 != nv1 + 1) {

                    System.out.println("NO");
                    continue;
                } else if (nv2 == nv1 + 1)
                    minor = true;

                nv1 = Integer.parseInt(v1[2]);
                nv2 = Integer.parseInt(v2[2]);

                if (minor) {
                    if (nv2 == 0)
                        System.out.println("SI");
                    else {
                        System.out.println("NO");

                    }
                } else if (nv2 != nv1 + 1) {

                    System.out.println("NO");

                } else
                    System.out.println("SI");

            }
        }
    }
}
