import java.util.Scanner;

public class K {
   
    public static void main(String[] args){




        try(Scanner sc = new Scanner(System.in)){

            while(sc.hasNext()){

                int[] adornos = new int[sc.nextInt()];
                int n = sc.nextInt();
                
                for (int i = 0; i < adornos.length; i++) {
                    adornos[i]=sc.nextInt();
                }
                
            }
        }
    }
}
