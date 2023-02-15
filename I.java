import java.util.HashMap;
import java.util.PriorityQueue;
import java.util.Scanner;

public class I {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            while (true) {
                int n = sc.nextInt();
                if (n == 0)
                    System.exit(0);
                int max = 0;
                HashMap<Integer, Integer> horas = new HashMap<>();
                PriorityQueue<Integer> tiempos = new PriorityQueue<>();
                for (int i = 0; i < n; i++) {
                    int llegada = sc.nextInt();
                    int salida = sc.nextInt();
                    Integer x = horas.get(llegada);
                    Integer y = horas.get(salida);
                    if (x == null)
                        x = 0;
                    if (y == null)
                        y = 0;
                    if (!horas.containsKey(llegada))
                        tiempos.add(llegada);
                    if (!horas.containsKey(salida))
                        tiempos.add(salida);
                    horas.put(llegada, x + 1);
                    horas.put(salida, y - 1);
                    max = Math.max(max, salida);
                }
                int maxP = 0;
                int tiempo = 0;
                int cur = 0;
                int tPre = 0;

                
                while (!tiempos.isEmpty()) {
                    Integer hora = tiempos.poll();
                    int curT = hora - tPre;
                    if (horas.get(hora) == 0) {
                        continue;
                    }
                    if (maxP == cur) {
                        tiempo += curT;
                    } else if (maxP < cur) {
                        maxP = cur;
                        tiempo = curT;
                    }
                    cur += horas.get(hora);
                    tPre=hora;
                }
                System.out.println(maxP + " " + tiempo);
            }
        }
    }

}
