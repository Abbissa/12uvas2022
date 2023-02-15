import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class G {

    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {
            while (true) {
                int n = sc.nextInt();
                if (n == 0)
                    System.exit(0);
                int[] baras = new int[101];

                for (int i = 0; i < n; i++) {
                    baras[sc.nextInt()]++;
                }
                int res = 0;
                ArrayList<Integer> lista = new ArrayList<Integer>();

                for (int i = 0; i < baras.length; i++) {
                    if (baras[i] != 0)
                        lista.add(baras[i]);
                }
                Comparator<Integer> c = new Comparator<Integer>() {

                    @Override
                    public int compare(Integer o1, Integer o2) {
                        return o2 - o1;
                    }

                };
                res = 0;

                Collections.sort(lista, c);

                while (lista.size() > 0) {
                    int index = 0;
                    for (int i = 0; i < lista.size(); i++) {
                        if (lista.get(i) >= 4) {
                            index = i;
                            break;
                        }
                    }

                    int aux = lista.get(index);
                    lista.remove(index);

                    lista.add(index, aux - 4);
                    if (lista.get(lista.size() - 1) >= 2) {
                        res++;
                        aux = lista.get(lista.size() - 1);
                        lista.remove(lista.size() - 1);
                        lista.add(aux - 2);

                    }

                    while (lista.size() > 0 && lista.get(lista.size() - 1) < 2)
                        lista.remove(lista.size() - 1);

                }

                System.out.println(res);

            }

        }
    }
}
